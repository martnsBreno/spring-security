package com.martnsBreno.springsecuritybasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    
    @GetMapping("/meuSaldo")
    String getAccountBalance() {
        return "Aqui está o meu saldo";
    }
}
