package com.example.javapractice.common.serialization;

import lombok.Getter;
import lombok.ToString;

import java.io.*;
import java.time.LocalDate;

@Getter
@ToString
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private String isbn;

    private String title;

    private String author;

    private LocalDate published;

    // 직렬화 제외
    private transient int numberOfSold;

    public Book(String isbn, String title, String author, LocalDate published) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.published = published;
    }

    public void setNumberOfSold(int numberOfSold) {
        this.numberOfSold = numberOfSold;
    }

    public void serialize(Book book) {
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("book.obj"))) {
            out.writeObject(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Book deserialize() {
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("book.obj"))) {
            return (Book) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
