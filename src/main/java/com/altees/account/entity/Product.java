package com.altees.account.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table // optional
public class Product {

    @Id
    private Integer id;
    private String description;
    private Double price;

}