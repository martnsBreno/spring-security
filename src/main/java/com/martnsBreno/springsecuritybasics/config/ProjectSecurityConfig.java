package com.martnsBreno.springsecuritybasics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class ProjectSecurityConfig {
    
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        http.csrf().disable()
        .authorizeRequests()
        .antMatchers("/minhaConta", "/meuSaldo", "/cartoes", "/emprestimos").authenticated()
        .antMatchers("/noticias", "/contato", "/cadastro").permitAll()
        .and().httpBasic()
        .and().formLogin();

        return http.build();
    }

    // @Bean
    // public InMemoryUserDetailsManager userDetailsService() {
    //     UserDetails admin = User.withDefaultPasswordEncoder()
    //     .username("admin")
    //     .password("12345")
    //     .authorities("admin")
    //     .build();

    //     return new InMemoryUserDetailsManager(admin);
        
    // }

    // @Bean
    // public UserDetailsService userDetailsService (DataSource dataSource) {
    //     return new JdbcUserDetailsManager(dataSource);
    // }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
