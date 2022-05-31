package com.example.javapractice.effectivejava.item03.enumtype;

import java.lang.reflect.Constructor;

// eReflection 내부적으로 만들 수 있게 허용하지 않아서 exception이 발생한다.
public class EnumElvisReflection {

    public static void main(String[] args) {
        try {
            Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor();
            System.out.println(declaredConstructor);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}