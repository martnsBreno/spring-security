package com.martnsBreno.springsecuritybasics.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.martnsBreno.springsecuritybasics.model.Customer;
import com.martnsBreno.springsecuritybasics.model.Authority;

import com.martnsBreno.springsecuritybasics.repository.CustomerRepository;

@Service
public class EazyBankUserDetails implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;

    private int CustomerId;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        
        String userName, password = null;

        List<Customer> customer = customerRepository.findByEmail(username);

        if (customer.isEmpty()) throw new UsernameNotFoundException("Usuario nao encontrado para: " + username);

        userName = customer.get(0).getEmail();
        password = customer.get(0).getPwd();
        CustomerId = customer.get(0).getId();

        return new User(userName, password, getGrantedAuthorities(customer.get(0).getAuthorities()));

    }
    
    private List<GrantedAuthority> getGrantedAuthorities(Set<Authority> authorities) {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (Authority authority : authorities) {
            grantedAuthorities.add(new SimpleGrantedAuthority(authority.getName()));
        }

        return grantedAuthorities;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    
 } 
