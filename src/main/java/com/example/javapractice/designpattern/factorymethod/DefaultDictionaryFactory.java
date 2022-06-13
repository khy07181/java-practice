package com.example.javapractice.designpattern.factorymethod;

public class DefaultDictionaryFactory implements DictionaryFactory {

    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }

}