package com.altees.account.repositories;

import com.altees.account.security.domain.Role;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.List;

public interface RoleRepository extends ReactiveCrudRepository<Role,Integer> {

    List<Role> findByRoleNameIn(List<String> roles);
}
