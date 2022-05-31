package com.example.javapractice.common.functionalinterface;

import com.example.javapractice.common.methodreference.Person;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// java에서 기본으로 제공해주는 functional interface 중 4개
public class DefaultFunctions {

    Function<Integer, String> intToString = Object::toString;

    Supplier<Person> personSupplier = Person::new;
    Function<LocalDate, Person> personFunction = Person::new;

    Consumer<Integer> integerConsumer = System.out::println;

    Predicate<Person> predicate;

}