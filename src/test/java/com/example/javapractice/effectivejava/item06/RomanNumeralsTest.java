package com.example.javapractice.effectivejava.item06;

import org.junit.jupiter.api.Test;

class RomanNumeralsTest {

    @Test
    void isRomanNumeralSlow() {
        boolean result = false;
        long start = System.nanoTime();
        for (int j = 0; j < 100; j++) {
            result = RomanNumerals.isRomanNumeralSlow("MCMLXXVI");
        }
        long end = System.nanoTime();

        System.out.println("slow : " + (end - start));
        System.out.println(result);
    }

    @Test
    void isRomanNumeralFast() {
        boolean result = false;
        long start = System.nanoTime();
        for (int j = 0; j < 100; j++) {
            result = RomanNumerals.isRomanNumeralFast("MCMLXXVI");
        }
        long end = System.nanoTime();

        System.out.println("fast : " + (end - start));
        System.out.println(result);
    }

}