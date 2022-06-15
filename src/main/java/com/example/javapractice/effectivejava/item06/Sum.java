package com.example.javapractice.effectivejava.item06;

public class Sum {

    static Long wrapperType;

    static long primitiveType;

    public static long sum() {
        primitiveType = 0L;

        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            primitiveType += i;
        }

        return primitiveType;
    }

    public static long autoBoxingSum() {
        wrapperType = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            wrapperType += i;
        }
        return wrapperType;
    }

}

