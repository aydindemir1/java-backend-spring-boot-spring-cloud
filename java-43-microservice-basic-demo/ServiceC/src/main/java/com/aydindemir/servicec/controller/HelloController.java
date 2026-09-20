package com.aydindemir.servicec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-c")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from ServiceC";
    }
}
