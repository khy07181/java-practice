package com.example.javapractice.effectivejava.item05.staticutils;

import com.example.javapractice.effectivejava.item05.DefaultDictionary;
import com.example.javapractice.effectivejava.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    // 자원을 직접 명시
    private static final Dictionary dictionary = new DefaultDictionary();

    private SpellChecker() {
    }

    public static boolean isValid(String word) {
        // SpellChecker 코드

        return dictionary.contains(word);
    }

    public static List<String> suggestions(String typo) {
        // SpellChecker 코드

        return dictionary.closeWordsTo(typo);
    }
}