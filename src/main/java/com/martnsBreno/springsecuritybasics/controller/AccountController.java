package com.martnsBreno.springsecuritybasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    
    @GetMapping("/minhaConta")
    String getAccountDetails() {
        return "Detalhes da minha conta";
    }
}
