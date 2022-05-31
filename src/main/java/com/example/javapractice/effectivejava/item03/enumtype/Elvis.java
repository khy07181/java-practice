package com.example.javapractice.effectivejava.item03.enumtype;

public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("기다려, 지금 나갈께!");
    }

    // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성해야 한다!
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
