package com.aydindemir.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-a")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from ServiceA";
    }
}
