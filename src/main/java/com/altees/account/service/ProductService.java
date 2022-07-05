package com.altees.account.service;

import com.altees.account.entity.Product;
import com.altees.account.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Mono<Product> getProductById(int productId){
        return this.repository.findById(productId);
    }

    public Flux<Product> getAllProducts(){
        return this.repository.findAll();
    }

    public Mono<Product> createProduct(final Product product){
        return this.repository.save(product);
    }

    public Mono<Product> updateProduct(int productId, final Mono<Product> productMono){
        return this.repository.findById(productId)
                .flatMap(p -> productMono.map(u -> {
                    p.setDescription(u.getDescription());
                    p.setPrice(u.getPrice());
                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteProduct(final int id){
        return this.repository.deleteById(id);
    }

}