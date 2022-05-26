package com.example.javapractice.effectivejava.item01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloServiceFactoryTest {

    @Test
    @DisplayName("입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.")
    void HelloServiceFactory() {
        // given
        HelloService ko = HelloServiceFactory.of("ko");

        // when
        String hello = ko.hello();

        // then
        assertThat(hello).isEqualTo("안녕하세요.");
    }

}