package com.martnsBreno.springsecuritybasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    
    @GetMapping("/cartoes")
    String getAccountCards() {
        return "Aqui está os meus cartoes";
    }
}
