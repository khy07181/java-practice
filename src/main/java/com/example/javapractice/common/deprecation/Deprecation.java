package com.example.javapractice.common.deprecation;

// 항상 name을 받아서 생성하도록 기본 생성자를 deprecated
public class Deprecation {

    private String name;

    /**
     * @deprecated in favor of
     * {@link #Deprecation(String)}
     */
    @Deprecated(forRemoval = true)
    public Deprecation() {
    }

    public Deprecation(String name) {
        this.name = name;
    }

}