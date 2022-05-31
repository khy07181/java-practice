package com.example.javapractice.effectivejava.item03;

import com.example.javapractice.effectivejava.item03.field.IElvis;

public class MockElvis implements IElvis {

    @Override
    public void leaveTheBuilding() {

    }

    @Override
    public void sing() {
        System.out.println("You ain't nothing' but a hound dog.");
    }
}