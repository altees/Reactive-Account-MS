package com.altees.account.security.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Collection;


@Data
@Table(name = "user",schema = "public")
public class User {

    @org.springframework.data.annotation.Id
    private String Id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private Collection<String> roles;

}
