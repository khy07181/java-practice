package com.example.javapractice.common.serialization;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class BookTest {

    @Test
    void serialize() {
        Book book = new Book("123", "책 이름", "저자", LocalDate.of(2022, 5, 31));
        book.setNumberOfSold(200);

        book.serialize(book);
        Book deserializedBook = book.deserialize();

        System.out.println(book);
        System.out.println(deserializedBook);
    }

}