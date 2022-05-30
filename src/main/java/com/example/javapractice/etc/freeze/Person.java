package com.example.javapractice.etc.freeze;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private final String name;

    private final int birthYear;

    private final List<String> hobbies;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.hobbies = new ArrayList<>();
    }

    public static void main(String[] args) {
        Person person = new Person("hayoung", 1995);
    }
}