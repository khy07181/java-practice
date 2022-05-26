package com.example.javapractice.effectivejava.item01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SettingsTest {

    @Test
    @DisplayName("Settings는 항상 같은 instance가 호출된다.")
    void constructor() {
        System.out.println(Settings.instance());
        System.out.println(Settings.instance());
        System.out.println(Settings.instance());
        System.out.println(Settings.instance());
        System.out.println(Settings.instance());
    }

}