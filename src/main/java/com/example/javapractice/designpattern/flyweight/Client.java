package com.example.javapractice.designpattern.flyweight;

public class Client {

    public static void main(String[] args) {
        Character character1 = new Character('h', "white", FontFactory.of("nanum:12"));
        Character character2 = new Character('h', "white", FontFactory.of("nanum:12"));
        Character character3 = new Character('h', "white", FontFactory.of("nanum:12"));
    }
}
