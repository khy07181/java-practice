package item05.staticutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SpellCheckerTest {

    @Test
    void isValid() {
        assertTrue(SpellChecker.isValid("test"));
    }

}
