package com.aydindemir.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Service B Hello";
    }

    @GetMapping("/info")
    public String info() {
        return "INFO: Service B";
    }
}
