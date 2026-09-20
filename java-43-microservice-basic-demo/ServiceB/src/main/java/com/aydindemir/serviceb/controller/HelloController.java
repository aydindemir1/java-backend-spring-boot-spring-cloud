package com.aydindemir.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-b")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from ServiceB";
    }
}
