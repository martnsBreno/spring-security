package com.martnsBreno.springsecuritybasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    
    @GetMapping("/emprestimos")
    String getAccountLoans() {
        return "Aqui está os meus emprestimos";
    }
}
