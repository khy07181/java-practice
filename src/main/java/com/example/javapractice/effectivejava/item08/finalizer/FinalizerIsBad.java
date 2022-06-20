package com.example.javapractice.effectivejava.item08.finalizer;

public class FinalizerIsBad {

    @Override
    protected void finalize() throws Throwable {
        System.out.print("");
    }

}