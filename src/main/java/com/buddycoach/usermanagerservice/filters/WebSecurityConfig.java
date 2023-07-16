package com.buddycoach.usermanagerservice.filters;

import org.springframework.stereotype.Component;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.web.*;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Component
@Order(Integer.MIN_VALUE)
@EnableWebSecurity
@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
            .requestMatchers("/api/v1/user/**").permitAll()
            .anyRequest()
            .authenticated()
            .and()
            .httpBasic();
        http.cors();
        // http.authorizeRequests().requestMatchers("/api/v1/employee/save").permitAll();
        return http.build();
    }
}
