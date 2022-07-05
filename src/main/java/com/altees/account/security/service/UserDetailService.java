
package com.altees.account.security.service;

import com.altees.account.security.domain.User;
import com.altees.account.security.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@Service
@Slf4j
public class UserDetailService implements ReactiveUserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public Mono<UserDetails> findByUsername(String username) {
        Mono<User> optionalUser = userRepository.findByUsername(username);
        log.info("user found ", optionalUser.log());
        return optionalUser.map(user->org.springframework.security.core.userdetails.User.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .roles(user.getRoles().stream().collect(Collectors.joining(",")))
                .build());
    }
}

