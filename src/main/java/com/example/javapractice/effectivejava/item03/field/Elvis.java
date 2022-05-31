package com.example.javapractice.effectivejava.item03.field;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

    public static final Elvis INSTANCE = new Elvis();

    private static boolean created;

    private Elvis() {
        if (created) {
            throw new UnsupportedOperationException("can't be created by constructor.");
        }
        created = true;
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public void sing() {
        System.out.println("I'll have a blue~ Christmas without you~");
    }

    // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성해야 한다!
    public static void main(String[] args) {
        Elvis.INSTANCE.leaveTheBuilding();
    }

    // 역직렬화 시 기존의 instance를 사용할 수 있게 해준다.
    private Object readResolve() {
        return INSTANCE;
    }

}
