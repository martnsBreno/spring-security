package com.martnsBreno.springsecuritybasics.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.martnsBreno.springsecuritybasics.model.AccountTransactions;

@Repository
public interface AccountTransactionRepository extends CrudRepository<AccountTransactions, Long>{

    List<AccountTransactions> findByCustomerIdOrderByTransactionDateDesc(int customerId);
    
}
