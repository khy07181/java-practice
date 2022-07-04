package com.example.javapractice.effectivejava.item10.inheritance;

import com.example.javapractice.effectivejava.item10.Color;
import com.example.javapractice.effectivejava.item10.Point;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ColorPointTest {

    @Test
    void violate_symmetry() {
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);

        assertThat(p.equals(cp)).isTrue();
        assertThat(cp.equals(p)).isTrue();
    }

    @Test
    void violate_transitivity() {
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

        assertThat(p1.equals(p2)).isTrue();
        assertThat(p2.equals(p3)).isTrue();
        assertThat(p1.equals(p3)).isFalse();
    }

}