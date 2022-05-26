package com.example.javapractice.effectivejava.item01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {

    @Test
    void primeOrder() {
        // given
        Product product = Product.builder().productName("product").build();

        // when
        Order order = Order.primeOrder(product);

        // then
        assertThat(order).isNotNull();
        assertThat(order.isPrime()).isEqualTo(true);
        assertThat(order.isUrgent()).isEqualTo(false);
    }

    @Test
    void urgentOrder() {
        // given
        Product product = Product.builder().productName("product").build();

        // when
        Order order = Order.urgentOrder(product);

        // then
        assertThat(order).isNotNull();
        assertThat(order.isPrime()).isEqualTo(false);
        assertThat(order.isUrgent()).isEqualTo(true);
    }

}