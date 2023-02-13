package com.martnsBreno.springsecuritybasics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.martnsBreno.springsecuritybasics.model.AccountTransactions;
import com.martnsBreno.springsecuritybasics.model.Accounts;
import com.martnsBreno.springsecuritybasics.repository.AccountTransactionRepository;

@RestController
public class BalanceController {
    
    @Autowired
    private AccountTransactionRepository accountTransactionRepository;
    
    @GetMapping("/meuSaldo")
    public List<AccountTransactions> getAccountDetails(@RequestParam int id) {
        List<AccountTransactions> accounts = accountTransactionRepository.findByCustomerIdOrderByTransactionDateDesc(id);
        
        if (accounts != null) {
            return accounts;
        } else {
            return null;
        }
    }
}
