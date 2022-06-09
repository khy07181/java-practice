package com.example.javapractice.effectivejava.item05.staticutils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SpellCheckerTest {

    @Test
    void isValid() {
        assertThat(SpellChecker.isValid("test")).isFalse();
    }

}