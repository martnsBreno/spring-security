package com.martnsBreno.springsecuritybasics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.martnsBreno.springsecuritybasics.model.Accounts;
import com.martnsBreno.springsecuritybasics.repository.AccountRepository;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;
    
    @GetMapping("/minhaConta")
    public Accounts getAccountDetails(@RequestParam int id) {
        Accounts accounts = accountRepository.findByCustomerId(id);
        
        if (accounts != null) {
            return accounts;
        } else {
            return null;
        }
    }
}
