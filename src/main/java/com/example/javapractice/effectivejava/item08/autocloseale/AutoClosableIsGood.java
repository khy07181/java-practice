package com.example.javapractice.effectivejava.item08.autocloseale;

import java.io.*;

public class AutoClosableIsGood implements Closeable {

    private BufferedReader reader;

    public AutoClosableIsGood(String path) {
        try {
            this.reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(path);
        }
    }

    @Override
    public void close() {
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}