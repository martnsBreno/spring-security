package com.martnsBreno.springsecuritybasics.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.martnsBreno.springsecuritybasics.model.Customer;
import com.martnsBreno.springsecuritybasics.repository.CustomerRepository;

@Service
public class EazyBankUserDetails implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        
        String userName, password = null;
        List<GrantedAuthority> authorities = null;

        List<Customer> customer = customerRepository.findByEmail(username);

        if (customer.isEmpty()) throw new UsernameNotFoundException("Usuario nao encontrado para: " + username);

        userName = customer.get(0).getEmail();
        password = customer.get(0).getPwd();
        authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(customer.get(0).getRole()));

        return new User(userName, password, authorities);
    }

 } 
