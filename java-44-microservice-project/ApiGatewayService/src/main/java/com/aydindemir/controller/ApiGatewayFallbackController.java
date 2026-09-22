package com.aydindemir.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class ApiGatewayFallbackController {

    @GetMapping("/auth")
    public ResponseEntity<String> authFallback() {
        return ResponseEntity.ok("AuthService geçici olarak hizmet veremiyor.");
    }

    @GetMapping("/user")
    public ResponseEntity<String> userProfileFallback() {
        return ResponseEntity.ok("UserProfileService geçici olarak hizmet veremiyor.");
    }

    @GetMapping("/agent")
    public ResponseEntity<String> agentFallback() {
        return ResponseEntity.ok("AgentService geçici olarak hizmet veremiyor.");
    }

    @GetMapping("/buyer")
    public ResponseEntity<String> buyerFallback() {
        return ResponseEntity.ok("BuyerService geçici olarak hizmet veremiyor.");
    }

    @GetMapping("/property")
    public ResponseEntity<String> propertyFallback() {
        return ResponseEntity.ok("PropertyService geçici olarak hizmet veremiyor.");
    }

    @GetMapping("/seller")
    public ResponseEntity<String> sellerFallback() {
        return ResponseEntity.ok("SellerService geçici olarak hizmet veremiyor.");
    }
}
