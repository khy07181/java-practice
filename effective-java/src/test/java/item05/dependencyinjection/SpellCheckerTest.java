package item05.dependencyinjection;

import item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(DefaultDictionary::new);
        spellChecker.isValid("test");
    }

}
