package com.martnsBreno.springsecuritybasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    
    @GetMapping("/bem-vindo")
    private String helloWorld() {
        return "Bem vindo a minha aplicaçao spring";
    }
}
