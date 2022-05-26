package com.example.javapractice.common.enums;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@Getter
@NoArgsConstructor(access = PRIVATE)
public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        order.orderStatus = OrderStatus.PREPARING;

        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;

        return order;
    }

    public static Order create() {
        return new Order();
    }

    @Builder
    public Order(boolean prime, boolean urgent, Product product, OrderStatus orderStatus) {
        this.prime = prime;
        this.urgent = urgent;
        this.product = product;
        this.orderStatus = orderStatus;
    }

}
