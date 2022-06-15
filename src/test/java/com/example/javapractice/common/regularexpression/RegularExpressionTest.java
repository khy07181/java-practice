package com.example.javapractice.common.regularexpression;

import org.junit.jupiter.api.Test;

class RegularExpressionTest {

    @Test
    void regularExpression() {
        long start = System.nanoTime();

        for (int j = 0; j < 10000; j++) {
            String name = "hayoung:::kim";
            RegularExpression.SPLIT_PATTERN.split(name);
        }

        long end = System.nanoTime();

        System.out.println("regularExpression : " + (end - start) / 1_000_000. + " ms.");
    }

    @Test
    void split() {
        long start = System.nanoTime();

        for (int j = 0; j < 10000; j++) {
            String name = "hayoung:::kim";
            // split은 내부적으로 한 글자의 경우 fastpath를 타기 때문에 한 글자 split의 경우 정규식으로 만들지 않는 것도 좋다.
            name.split(":::");
        }

        long end = System.nanoTime();

        System.out.println("split : " + (end - start) / 1_000_000. + " ms.");
    }

}