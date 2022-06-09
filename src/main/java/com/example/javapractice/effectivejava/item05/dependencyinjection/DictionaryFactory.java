package com.example.javapractice.effectivejava.item05.dependencyinjection;

import com.example.javapractice.effectivejava.item05.DefaultDictionary;

public class DictionaryFactory {
    public static DefaultDictionary get() {
        return new DefaultDictionary();
    }
}