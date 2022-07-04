package com.example.javapractice.effectivejava.item10.composition;

import com.example.javapractice.effectivejava.item10.Color;
import com.example.javapractice.effectivejava.item10.Point;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ColorPointTest {

    @Test
    void equals() {
        Point p1 = new Point(1,  0);
        Point p2 = new ColorPoint(1, 0, Color.RED).asPoint();

        assertThat(p1.equals(p2)).isTrue();
        assertThat(p2.equals(p1)).isTrue();
    }

}