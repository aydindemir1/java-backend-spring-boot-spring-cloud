package com.aydindemir.controller;

import com.aydindemir.model.Auth;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/register")
    public ResponseEntity<Auth> register() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PostMapping("/login")
    public ResponseEntity<Auth> login() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Auth>> findAll() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}
