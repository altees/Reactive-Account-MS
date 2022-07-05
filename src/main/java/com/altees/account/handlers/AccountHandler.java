/*
package com.altees.account.handlers;
import com.altees.account.entity.Product;
import com.altees.account.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class AccountHandler {

    @Autowired
    private ProductService productService;


    public Mono<ServerResponse> getUser(ServerRequest serverRequest) {
        String id = serverRequest.pathVariable("id");
        Mono<User> user = productService.getUser(id);
        log.info(user.toString());
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(user, User.class);
    }

    public Mono<ServerResponse> getAllProducts(ServerRequest serverRequest) {
        Flux<Product> allUser = productService.getAllProducts();
        return ServerResponse
                .ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(allUser, Product.class);
    }
    public Mono<ServerResponse> saveUser(ServerRequest serverRequest) {
        Mono<User> userMono = serverRequest.bodyToMono(User.class);
        return userMono.flatMap(user -> {
            return ServerResponse
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(productService.saveUser(user), User.class);
        });
    }

    public Mono<ServerResponse> getTestUser(ServerRequest serverRequest) {
        Mono<User> just = Mono.just(new User("11", "TestAK", "TESTLNAK", "ADMIN_TEST"));
        return ServerResponse
                .ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(just, User.class);
    }
}
*/
