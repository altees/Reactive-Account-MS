package com.altees.account.handlers;

import com.altees.account.entity.Product;
import com.altees.account.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class ProductHandler {

    @Autowired
    ProductService productService;


    public HandlerFunction<ServerResponse> getProductsHandlerFunction= request ->{
        Flux<Product> allUser = productService.getAllProducts();
        return ServerResponse
                .ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(allUser, Product.class);
    };

    public Mono<ServerResponse> getAllProducts(ServerRequest serverRequest) {
        Flux<Product> allUser = productService.getAllProducts();
        return ServerResponse
                .ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(allUser, Product.class);
    }


    public Mono<ServerResponse> saveProduct(ServerRequest serverRequest) {
        Mono<Product> userMono = serverRequest.bodyToMono(Product.class);
        return userMono.flatMap(product -> {
            return ServerResponse
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(productService.createProduct(product), Product.class);
        });
    }

}
