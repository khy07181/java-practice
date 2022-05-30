package com.example.javapractice.effectivejava.item02.hierarchicalbuilder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.example.javapractice.effectivejava.item02.hierarchicalbuilder.NewYorkPizza.Size.SMALL;
import static com.example.javapractice.effectivejava.item02.hierarchicalbuilder.Pizza.Topping.*;

class PizzaTest {

    @Test
    @DisplayName("계층적 빌더 패턴 예시")
    void hierarchicalBuilder() {
        NewYorkPizza pizza = new NewYorkPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}