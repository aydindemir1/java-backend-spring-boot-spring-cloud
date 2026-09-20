package com.aydindemir.service;

import com.aydindemir.repository.IAuthRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final IAuthRepository authRepository;

    public AuthService(IAuthRepository authRepository) {
        this.authRepository = authRepository;
    }
}
