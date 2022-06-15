package com.example.javapractice.effectivejava.item06;

import org.junit.jupiter.api.Test;

class SumTest {

    @Test
    void sum() {
        long start = System.nanoTime();
        long sum = Sum.sum();
        long end = System.nanoTime();

        System.out.println("sum : " + (end - start) / 1_000_000. + " ms.");
        System.out.println(sum);
    }

    @Test
    void autoBoxingSum() {
        long start = System.nanoTime();
        // autoBoxing을 하면서 속도가 느려진다.
        long sum = Sum.autoBoxingSum();
        long end = System.nanoTime();

        System.out.println("autoBoxingSum : " + (end - start) / 1_000_000. + " ms.");
        System.out.println(sum);
    }

}