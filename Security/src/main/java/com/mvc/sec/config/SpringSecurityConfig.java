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

        // Load the user login credentials from Database(DB)
        // Username, Password, Role


        /*
        auth
            .inMemoryAuthentication() // Look for my users inside server memory
            .withUser("john")
            .password("{noop}john123") // Storing the password here in plain-text (Using the password encoder id in the password)
            .roles("admin")
            .and()
            .withUser("collin")
            .password("{bcrypt}$2a$10$efpWtpXuMXhu1G5tltIzI.5I.tHXvvV9CpUHacAtl4KSgw4HIvxEu") // password123
            .roles("user");
         */
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
                // .anyRequest()
                /*
                 * Only show the login form for /hello request
                 * and serve the request once user is logged in,
                 * for other requests login is not required
                 */

                .antMatchers("/hello")  // Show the login page
                .authenticated()    // Now every URLS are secured and needs to be authenticated (Show the login form)

                .antMatchers("/bye")
                .authenticated()

                .antMatchers("/helloWorld")
                .permitAll()

                // .denyAll()       // Deny all the request even if they are registered and even if they have a valid username and password
                /*
                    There are better options available to handle the applications' downtime
                    Interceptors
                 */
                // .permitAll()        // NO login required permitting all the request
                .and()          // Close
                .formLogin()    // UsernamePasswordAuthenticationFilter
                .loginPage("/myCustomLogin") // Don't use the default login page (/login), use the one we have created
                .loginProcessingUrl("/process-login")
                .and()          // Close
                .httpBasic()   // Basic Authentication the encoded password can be decoded (Base64)
                .and()
                .logout()
                .logoutUrl("/appLogout");
    }

}
