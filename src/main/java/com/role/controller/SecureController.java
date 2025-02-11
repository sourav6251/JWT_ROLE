package com.role.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecureController {
    @GetMapping("/testsecure")
    public ResponseEntity<String> testSecure() {
        return ResponseEntity.ok("This is a secure endpoint");
    }
}
