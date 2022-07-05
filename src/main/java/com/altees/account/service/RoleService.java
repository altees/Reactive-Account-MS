package com.altees.account.service;

import com.altees.account.security.domain.Role;
import reactor.core.publisher.Mono;

public interface RoleService {

    public Mono<Role> createRole(Role role);
}
