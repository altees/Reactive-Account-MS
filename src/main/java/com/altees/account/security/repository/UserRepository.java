package com.altees.account.security.repository;

import com.altees.account.security.domain.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.Optional;

public interface UserRepository extends ReactiveCrudRepository<User,String> {
    Optional<User> findByUserName(String userName);
}
