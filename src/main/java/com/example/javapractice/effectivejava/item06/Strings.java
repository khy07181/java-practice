package com.example.javapractice.effectivejava.item06;

public class Strings {

    public static void main(String[] args) {
        String hello1 = "hello";
        String hello2 = "hello";

        // jvm은 내부적으로 문자열을 캐싱하고 있다. 따라서 new로 String을 생성하는 것은 권장되지 않는다.
        String newHello = new String("hello");

        System.out.println(hello1 == hello2);
        System.out.println(hello1.equals(hello2));
        System.out.println(hello1 == newHello);
        System.out.println(hello1.equals(newHello));

    }
}