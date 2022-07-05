/*
package com.altees.account.router;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@Slf4j
public class AccountRouter {

    public static final String GET_USER_URI = "/user/{id}";
    public static final String GET_ALL_USER_URI = "/user";
    public static final String SAVE_USER_URI = "/user";

    @Autowired
    private AccountHandler accountHandler;

    @Bean
    public RouterFunction<ServerResponse> route() {
        log.info("Route function invoked...");
        return RouterFunctions.
                 route()
                .GET(GET_USER_URI, request -> accountHandler.getUser(request)).
                 GET(GET_ALL_USER_URI, request -> accountHandler.getAllUser(request)).
                 POST(SAVE_USER_URI, request -> accountHandler.saveUser(request)).
                 GET("/test/url", request -> accountHandler.getTestUser(request))
                .build();
    }

}
*/
