package com.example.javapractice.effectivejava.item04;

public class UtilityClass {

    // 인스턴스를 만들 수 없도록 강제
    private UtilityClass() {
        throw new AssertionError();
    }

    public static String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        // UtilityClass는 static으로 사용 권장
        String hello = UtilityClass.hello();

        // 권장되지 않는다.
//        UtilityClass utilityClass = new UtilityClass();
//        utilityClass.hello();
    }
}