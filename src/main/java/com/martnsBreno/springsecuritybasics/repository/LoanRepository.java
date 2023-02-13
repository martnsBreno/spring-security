package com.martnsBreno.springsecuritybasics.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.martnsBreno.springsecuritybasics.model.Loans;

@Repository
public interface LoanRepository extends CrudRepository<Loans, Long>{
    
    List<Loans> findByCustomerIdOrderByStartDateDesc(int customerId);

}
