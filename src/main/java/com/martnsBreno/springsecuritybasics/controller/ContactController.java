package com.martnsBreno.springsecuritybasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    
    @GetMapping("/contato")
    String getAccountContact() {
        return "Aqui está as informaçoes de contato";
    }
}
