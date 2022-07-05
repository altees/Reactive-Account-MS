package com.altees.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class AccountServiceApplication {

	public static void main(String[] args) {
		System.out.println(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("adm@123"));
		System.out.println(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("usr@123"));
		SpringApplication.run(AccountServiceApplication.class, args);
	}

}
