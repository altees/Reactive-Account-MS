package com.altees.account.security.domain;

import lombok.Data;

import java.util.Collection;
import java.util.UUID;


@Data
public class User {

    private String Id;
    private String userName;
    private String password;
    private Collection<String> roles;

}
