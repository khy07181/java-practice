package com.example.javapractice.effectivejava.item10;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

class EqualsInJavaTest {

    @Test
    void equals() throws MalformedURLException {
        long time = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(time);
        Date date = new Date(time);

        // 대칭성 위배
        assertThat(date.equals(timestamp)).isTrue();
        assertThat(timestamp.equals(date)).isFalse();

        // 일관성 위배 가능성이 있다.
        URL google1 = new URL("https", "about.google", "/products/");
        URL google2 = new URL("https", "about.google", "/products/");
        assertThat(google1.equals(google2)).isTrue();
    }

}