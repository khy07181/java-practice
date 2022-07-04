package com.example.javapractice.effectivejava.item10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CaseInsensitiveStringTest {

    @Test
    void violate_symmetry() {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String polish = "polish";
        System.out.println(cis.equals(polish));

        assertThat(cis.equals(polish)).isTrue();

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);

        assertThat(list.contains(polish)).isFalse();
    }

    @Test
    void correct() {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        CaseInsensitiveString cis2 = new CaseInsensitiveString("polish");
        String polish = "polish";

        assertThat(cis.equals(polish)).isTrue();
        assertThat(cis2.equals(cis)).isTrue();

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);

        assertThat(list.contains(polish)).isFalse();
    }
}