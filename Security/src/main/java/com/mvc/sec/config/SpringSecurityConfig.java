package com.mvc.sec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity(debug = true) // This annotation will go to create the Spring filter chain
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter { // Help us to create a spring security filter chain
    // This class is going to help you to create the Spring security filter chain(gunman)
    // This is a Spring Security Filter chain because it's going to create Spring security filter chain
    // Now Register the spring security filter chain with our App

    // I want to create some details for a user
    // username, password, roles
    // John, john123, admin (We can decide our roles for application! no rules)


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication() // Look for my users inside server memory
            .withUser("john")
            .password("{noop}john123") // Storing the password here in plain-text (Using the password encoder id in the password)
            .roles("admin");
    }

    /*
    @Bean
    PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
     */

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest()
                // .authenticated()
                // .denyAll()       // Deny all the request even if they are registered and even if they have a valid username and password
                .permitAll()        // NO login required permitting all the request
                .and()
                .formLogin()    // UsernamePasswordAuthenticationFilter
                .and()
                .httpBasic();   // Basic Authentication the encoded password can be decoded (Base64)
    }

}
