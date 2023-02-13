package com.martnsBreno.springsecuritybasics.repository;


import com.martnsBreno.springsecuritybasics.model.Accounts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends CrudRepository<Accounts, Long>{

    Accounts findByCustomerId(int customerId);
    
}
