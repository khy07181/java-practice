package com.example.javapractice.effectivejava.item01;

import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class Settings {

    private static final Settings SETTINGS = new Settings();

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    // 호출 될 때마다 인스턴스를 새로 생성하지 않아도 된다.
    public static Settings instance() {
        return SETTINGS;
    }

}
