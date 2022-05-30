package com.example.javapractice.effectivejava.item02.hierarchicalbuilder;

import static com.example.javapractice.effectivejava.item02.hierarchicalbuilder.NewYorkPizza.Size.SMALL;
import static com.example.javapractice.effectivejava.item02.hierarchicalbuilder.Pizza.Topping.*;

class PizzaTest {
    public static void main(String[] args) {
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