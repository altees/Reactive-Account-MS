package com.altees.account.service;

import com.altees.account.repositories.RoleRepository;
import com.altees.account.security.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;



    @Override
    public Mono<Role> createRole(Role role) {
        return roleRepository.save(role);
    }
}
