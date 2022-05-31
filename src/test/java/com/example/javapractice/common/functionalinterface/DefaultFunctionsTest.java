package com.example.javapractice.common.functionalinterface;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.*;

class DefaultFunctionsTest {

    @Test
    void test() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1995, 3, 17));
        dates.add(LocalDate.of(1995, 11, 21));
        dates.add(LocalDate.of(1959, 1, 10));
        dates.add(LocalDate.of(1963, 4, 20));

        List<Integer> before1995 = dates.stream()
                .filter(d -> d.isBefore(LocalDate.of(1995, 1, 1)))
                .map(LocalDate::getYear)
                .collect(toList());

        before1995.forEach(System.out::println);
    }

}