package com.example.javapractice.common.methodreference;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class PersonTest {

    private List<Person> people = new ArrayList<>();

    @BeforeEach
    void beforeEach() {
        people.add(new Person(LocalDate.of(1995, 3, 17)));
        people.add(new Person(LocalDate.of(1995, 11, 21)));
        people.add(new Person(LocalDate.of(1959, 1, 10)));
        people.add(new Person(LocalDate.of(1963, 4, 20)));
    }

    @Test
    void anonymousInnerClass() {
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.birthday.compareTo(b.birthday);
            }
        });

        people.forEach(person -> System.out.println(person.getAge()));
    }

    @Test
    void lambda() {
        people.sort((a, b) -> a.birthday.compareTo(b.birthday));

        people.forEach(person -> System.out.println(person.getAge()));
    }

    @Test
    void methodReference() {
        people.sort(Person::compareByAge);

        people.forEach(person -> System.out.println(person.getAge()));
    }

}