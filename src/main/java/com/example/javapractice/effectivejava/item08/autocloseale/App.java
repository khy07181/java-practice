package com.example.javapractice.effectivejava.item08.autocloseale;

public class App {

    public static void main(String[] args) {
        try(AutoClosableIsGood good = new AutoClosableIsGood("")) {
            // 자원 반납 처리가 된다.
        }
    }
}