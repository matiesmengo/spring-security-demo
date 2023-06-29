package com.matiesmengo.client.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        return http.authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/index.html").authenticated()
                        .requestMatchers("/admin/**").hasAuthority("ADMIN")
                        .requestMatchers("/reader/**").hasRole("READER")
                        .anyRequest().authenticated())
                .oauth2Login(withDefaults())
                .oauth2Client(withDefaults())
                .logout(withDefaults())
                .build();
    }
}
