package com.example.javapractice.common.enums;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@Getter
@NoArgsConstructor(access = PRIVATE)
public class Product {

    private String productName;

    public static Product create() {
        return new Product();
    }

    @Builder
    public Product(String productName) {
        this.productName = productName;
    }

}
