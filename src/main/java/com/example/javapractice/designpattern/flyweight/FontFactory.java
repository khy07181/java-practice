package com.example.javapractice.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    private static Map<String, Font> cache = new HashMap<>();

    public static Font of(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        }
        String[] split = font.split(":");
        Font newFont = new Font(split[0], Integer.parseInt(split[1]));
        cache.put(font, newFont);

        return newFont;
    }

}
