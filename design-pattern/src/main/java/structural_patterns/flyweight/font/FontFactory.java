package structural_patterns.flyweight.font;

import java.util.HashMap;

public class FontFactory {

    private static final HashMap<String, Font> fontMap = new HashMap<>();

    public static Font getFont(String font, int size, String color) {
        String key = font + size + color;
        Font concreteFont = fontMap.get(key);

        if (concreteFont == null) {
            concreteFont = new ConcreteFont(font, size, color);
            fontMap.put(key, concreteFont);
            System.out.println("Creating a new font: " + key);

            return concreteFont;
        }

        System.out.println("Returning font: " + key);
        return concreteFont;
    }
}
