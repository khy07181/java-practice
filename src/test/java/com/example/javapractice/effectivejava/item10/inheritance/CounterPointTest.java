package com.example.javapractice.effectivejava.item10.inheritance;

import com.example.javapractice.effectivejava.item10.Point;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterPointTest {

    @Test
    void equals() {
        Point p1 = new Point(1,  0);
        Point p2 = new CounterPoint(1, 0);

        assertThat(CounterPoint.onUnitCircle(p1)).isTrue();

        // Point의 equals가 getClass를 사용해 작성되었다면 false - 리스코프 치환 원칙 위배
        assertThat(CounterPoint.onUnitCircle(p2)).isTrue();
    }
}