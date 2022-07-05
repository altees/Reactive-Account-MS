/*
package com.altees.account.security.service;

import com.altees.account.security.domain.User;
import com.altees.account.security.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserDetailService  implements ReactiveUserDetailsService {

    private UserRepository userRepository;


    @Override
    public Mono<UserDetails> findByUsername(String username) {
        Optional<User> optionalUser = userRepository.findByUserName(username);
        if (!optionalUser.isPresent())
            throw new UsernameNotFoundException("user not found with username " + userName);
        User user = optionalUser.get();
        log.info("user found ", user);


        return null;
    }
}
*/
