package com.example.javapractice.effectivejava.item03;

import com.example.javapractice.effectivejava.item03.field.Concert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    @Test
    void perform() {
        // 싱글톤 객체가 아닌 Interface를 구현한 Mock 객체를 사용하면 client 테스트가 쉬워진다.
        Concert concert = new Concert(new MockElvis());
        concert.perform();

        assertTrue(concert.isLightsOn());
        assertTrue(concert.isMainStateOpen());
    }

}