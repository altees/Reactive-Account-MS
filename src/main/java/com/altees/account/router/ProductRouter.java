package com.altees.account.router;

import com.altees.account.entity.Product;
import com.altees.account.handlers.ProductHandler;
import com.altees.account.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Configuration
@Slf4j
public class ProductRouter {

    @Autowired
    ProductHandler productHandler;


    @Bean
    public RouterFunction<ServerResponse> route() {
        log.info("Route function invoked...");
        return RouterFunctions.
                route()
                .GET("product/all", request -> productHandler.getProductsHandlerFunction.handle(request)).
                        POST("product/save", request -> productHandler.saveProduct(request))
                .GET("/admin",request->admin.handle(request))
                .GET("/user",request->user.handle(request))
                .build();
    }

    HandlerFunction<ServerResponse> admin= request->{

        return ServerResponse
            .ok()
            .contentType(MediaType.TEXT_EVENT_STREAM)
            .body(Mono.just("Hello ADMIN"), String.class);
    };
    HandlerFunction<ServerResponse> user= request->{
        return ServerResponse
            .ok()
            .contentType(MediaType.TEXT_EVENT_STREAM)
            .body(Mono.just("Hello USER"), String.class);
    };
}
