package com.aydindemir.service;

import com.aydindemir.dto.request.DoLoginRequestDto;
import com.aydindemir.dto.request.DoRegisterRequestDto;
import com.aydindemir.dto.response.DoRegisterResponseDto;
import com.aydindemir.exception.AuthServiceException;
import com.aydindemir.exception.ErrorType;
import com.aydindemir.model.Auth;
import com.aydindemir.repository.IAuthRepository;
import com.aydindemir.utils.JwtTokenManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthService extends ServiceManager<Auth, Long> {

    private final IAuthRepository authRepository;
    private final JwtTokenManager jwtTokenManager;

    public AuthService(IAuthRepository authRepository, JwtTokenManager jwtTokenManager) {
        super(authRepository);
        this.authRepository = authRepository;
        this.jwtTokenManager = jwtTokenManager;
    }

    public DoRegisterResponseDto doRegister(DoRegisterRequestDto dto) {
        if (!dto.getPassword().equals(dto.getRePassword())) {
            throw new AuthServiceException(ErrorType.REGISTER_PASSWORD_MISMATCH);
        }

        if (authRepository.existsByUsername(dto.getUsername())) {
            throw new AuthServiceException(ErrorType.REGISTER_USERNAME_EXISTS);
        }

        Auth auth = save(
                Auth.builder()
                        .username(dto.getUsername())
                        .email(dto.getEmail())
                        .password(dto.getPassword())
                        .state(true)
                        .createdAt(System.currentTimeMillis())
                        .build()
        );

        return DoRegisterResponseDto.builder()
                .id(auth.getId())
                .username(auth.getUsername())
                .email(auth.getEmail())
                .build();
    }

    public String doLogin(DoLoginRequestDto dto) {
        Auth auth = authRepository.findByUsernameAndPassword(dto.getUsername(), dto.getPassword())
                .orElseThrow(() -> new AuthServiceException(ErrorType.LOGIN_USERNAME_OR_PASSWORD_MISMATCH));

        return jwtTokenManager.createToken(auth.getId())
                .orElseThrow(() -> new AuthServiceException(ErrorType.INTERNAL_SERVER_ERROR));
    }

    public List<Auth> findAll(String token) {
        Optional<Long> authId = jwtTokenManager.getIdInfoFromToken(token);

        if (authId.isEmpty() || findById(authId.get()).isEmpty()) {
            throw new AuthServiceException(ErrorType.INVALID_TOKEN);
        }

        return authRepository.findAll();
    }
}
