package com.example.javapractice.common.functionalinterface;

@FunctionalInterface
public interface MyFunction {

    String valueOf(Integer integer);

    static String hello() {
        return "hello";
    }

}