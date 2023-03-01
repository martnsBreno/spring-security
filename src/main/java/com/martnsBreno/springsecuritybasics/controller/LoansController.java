package com.martnsBreno.springsecuritybasics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martnsBreno.springsecuritybasics.model.Loans;
import com.martnsBreno.springsecuritybasics.repository.LoanRepository;

@RestController
public class LoansController {

    @Autowired
    private LoanRepository loanRepository;
    
    @GetMapping("/emprestimos")
    List<Loans> getAccountLoans() {
        List<Loans> loans = loanRepository.findByCustomerIdOrderByStartDateDesc(1);

        return loans;
    }
}
