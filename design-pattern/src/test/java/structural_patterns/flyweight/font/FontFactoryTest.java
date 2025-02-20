package structural_patterns.flyweight.font;

import org.junit.jupiter.api.Test;

class FontFactoryTest {

    @Test
    void flyweight() {
        Font font1 = FontFactory.getFont("Arial", 12, "Black");
        font1.apply("Hello, World!");

        Font font2 = FontFactory.getFont("Arial", 12, "Black");
        font2.apply("Hello, World!");

        Font font3 = FontFactory.getFont("Times New Roman", 14, "Blue");
        font3.apply("Design Patterns");

        Font font4 = FontFactory.getFont("Arial", 12, "Black");
        font4.apply("Another Text");
    }

}
