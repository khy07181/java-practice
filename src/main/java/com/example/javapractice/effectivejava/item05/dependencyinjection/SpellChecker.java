package com.example.javapractice.effectivejava.item05.dependencyinjection;

import com.example.javapractice.effectivejava.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public SpellChecker(Supplier<Dictionary> dictionarySupplier) {
        this.dictionary = dictionarySupplier.get();
    }

    public boolean isValid(String word) {
        // SpellChecker 코드

        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        // SpellChecker 코드

        return dictionary.closeWordsTo(typo);
    }
}
