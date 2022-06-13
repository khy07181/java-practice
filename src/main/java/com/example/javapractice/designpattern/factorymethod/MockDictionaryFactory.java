package com.example.javapractice.designpattern.factorymethod;

public class MockDictionaryFactory implements DictionaryFactory {

    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }

}