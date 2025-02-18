package com.role.controller;

import com.role.dto.UserDTO;
import com.role.service.DAOService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class NonSecureController {
    private final DAOService daoService;

    public NonSecureController(DAOService daoService) {
        this.daoService = daoService;
    }

    @GetMapping("/testsecure")
    public ResponseEntity<String> testSecure() {
        return ResponseEntity.ok("This is a Non-secure endpoint");
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(daoService.saveUser(userDTO));
    }
}
