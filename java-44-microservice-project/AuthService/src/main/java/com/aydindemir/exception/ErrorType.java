package com.aydindemir.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorType {

    REGISTER_PASSWORD_MISMATCH(1004, "Girilen parolalar uyuşmadı.", HttpStatus.BAD_REQUEST),
    REGISTER_USERNAME_EXISTS(1005, "Bu kullanıcı adı sistemde alınmıştır.", HttpStatus.BAD_REQUEST),
    LOGIN_USERNAME_OR_PASSWORD_MISMATCH(3001, "Kullanıcı adı veya parola hatalı.", HttpStatus.BAD_REQUEST),
    INVALID_TOKEN(5001, "Geçersiz token.", HttpStatus.BAD_REQUEST),
    BAD_REQUEST(6001, "Geçersiz istek yaptınız.", HttpStatus.BAD_REQUEST),
    INTERNAL_SERVER_ERROR(7000, "Beklenmeyen bir sunucu hatası oluştu.", HttpStatus.INTERNAL_SERVER_ERROR);

    private final int code;
    private final String message;
    private final HttpStatus httpStatus;
}
