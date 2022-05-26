package com.example.javapractice.common.interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Interface_default_static_method {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);

        System.out.println(numbers);

        // default method
        Comparator<Integer> desc = ((o1, o2) -> o2 - o1);
        Comparator<Integer> asc = desc.reversed();
        numbers.sort(asc);

        System.out.println(numbers);

        // static method
        Comparator<Integer> reverseOrder = Comparator.reverseOrder();
        numbers.sort(reverseOrder);

        System.out.println(numbers);
    }

}
