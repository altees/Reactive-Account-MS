package com.altees.account.security.repository;

import com.altees.account.security.domain.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<User,String> {
    Mono<User> findByUsername(String userName);
}
