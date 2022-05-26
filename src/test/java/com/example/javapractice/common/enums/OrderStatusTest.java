package com.example.javapractice.common.enums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertThrows;

class OrderStatusTest {

    @Test
    void enumValues() {
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);
    }

    @Test
    @DisplayName("enum 비교는 ==이 권장된다.")
    void equals() {
        assertThrows(NullPointerException.class, () -> {
            Order order = Order.create();
            if (order.getOrderStatus().equals(OrderStatus.PREPARING)) {
                System.out.println("order의 orderStatus : " + order.getOrderStatus());
            }
        });

        Product product = Product.builder().productName("product").build();
        Order preparingOrder = Order.primeOrder(product);
        if (preparingOrder.getOrderStatus() == OrderStatus.PREPARING) {
            System.out.println("preparingOrder의 orderStatus : " + preparingOrder.getOrderStatus());
        }
    }

    @Test
    void enumMap() {
        EnumMap<OrderStatus, Object> orderStatusMap = new EnumMap<>(OrderStatus.class);

        Arrays.stream(OrderStatus.values())
                .forEach(orderStatus -> orderStatusMap.put(orderStatus, orderStatus.toString()));
        for (Map.Entry<OrderStatus, Object> en : orderStatusMap.entrySet()) {
            System.out.println(en.getKey() + ", " + en.getValue());
        }
    }

    @Test
    void enumSet() {
        EnumSet<OrderStatus> orderStatuses = EnumSet.allOf(OrderStatus.class);
        orderStatuses.forEach(System.out::println);
    }

}