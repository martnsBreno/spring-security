package com.martnsBreno.springsecuritybasics.config;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;


@Configuration
public class ProjectSecurityConfig {
    
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        http.cors().configurationSource(new CorsConfigurationSource() {

            @Override
            public CorsConfiguration getCorsConfiguration(HttpServletRequest arg0) {
                CorsConfiguration config = new CorsConfiguration();
                config.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));
                config.setAllowedMethods(Collections.singletonList("*"));
                config.setAllowCredentials(true);
                return config;
            }
             
        }).and().csrf().ignoringAntMatchers("/noticias", "/cadastro").csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
        .and().authorizeRequests()
        .antMatchers("/minhaConta").hasAuthority("VIEWACCOUNT")
        .antMatchers("/meuSaldo").hasAnyAuthority("VIEWACCOUNT", "VIEWBALANCE")
        .antMatchers("/minhaConta", "/meuSaldo").authenticated()
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
