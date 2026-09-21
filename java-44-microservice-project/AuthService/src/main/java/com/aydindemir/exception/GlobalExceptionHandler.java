package com.aydindemir.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AuthServiceException.class)
    public ResponseEntity<ErrorMessage> handleAuthServiceException(AuthServiceException exception) {
        ErrorType errorType = exception.getType();

        ErrorMessage errorMessage = ErrorMessage.builder()
                .code(errorType.getCode())
                .message(errorType.getMessage())
                .status(errorType.getHttpStatus())
                .build();

        return ResponseEntity.status(errorType.getHttpStatus()).body(errorMessage);
    }

    
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorMessage> handleRuntimeException(RuntimeException exception) {
        ErrorType errorType = ErrorType.INTERNAL_SERVER_ERROR;

        ErrorMessage errorMessage = ErrorMessage.builder()
                .code(errorType.getCode())
                .message(errorType.getMessage())
                .status(errorType.getHttpStatus())
                .build();

        return ResponseEntity.status(errorType.getHttpStatus()).body(errorMessage);
    }
   
    /*
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorMessage> handleRuntimeException(RuntimeException exception) {

        exception.printStackTrace();

        ErrorType errorType = ErrorType.INTERNAL_SERVER_ERROR;

        ErrorMessage errorMessage = ErrorMessage.builder()
                .code(errorType.getCode())
                .message(exception.getMessage())
                .status(errorType.getHttpStatus())
                .build();

        return ResponseEntity.status(errorType.getHttpStatus()).body(errorMessage);
    }
     */
}
