package com.example.javapractice.effectivejava.item05.dependencyinjection;

import com.example.javapractice.effectivejava.item05.MockDictionary;
import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(MockDictionary::new);
        spellChecker.isValid("test");
    }

}
