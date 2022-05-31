package com.example.javapractice.effectivejava.item03.staticfactory;

import java.util.function.Supplier;

public class Concert {

    // static factory의 method 참조를 supplier로 사용할 수 있다.
    public void start(Supplier<Singer> singerSupplier) {
        Singer singer = singerSupplier.get();
        singer.sing();
    }

    public static void main(String[] args) {
        Concert concert = new Concert();
        concert.start(Elvis::getInstance);
    }
}