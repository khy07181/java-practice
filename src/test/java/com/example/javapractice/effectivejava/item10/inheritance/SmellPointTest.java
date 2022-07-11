package com.example.javapractice.effectivejava.item10.inheritance;

import com.example.javapractice.effectivejava.item10.Color;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SmellPointTest {

    @Test
    @Disabled // stackOverflow 발생
    void stackOverflow() {
        SmellPoint p1 = new SmellPoint(1, 0, "sweat");
        ColorPoint p2 = new ColorPoint(1, 0, Color.RED);
        p1.equals(p2);
    }

}