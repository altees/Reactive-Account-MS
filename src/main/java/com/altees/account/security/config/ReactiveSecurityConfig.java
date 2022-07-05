package com.altees.account.security.config;

import com.altees.account.security.service.UserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class ReactiveSecurityConfig {


    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {

        return http.csrf()
                .disable()
                .authorizeExchange()
                .pathMatchers(HttpMethod.GET, "/user").hasAnyRole("ADMIN", "USER")
                .pathMatchers(HttpMethod.GET, "/admin").hasRole("ADMIN")
                .anyExchange()
                .authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic()
                .and().build();
    }

    @Bean
    ReactiveAuthenticationManager authenticationManager(UserDetailService userDetailService){
        return new UserDetailsRepositoryReactiveAuthenticationManager(userDetailService);
    }
}
