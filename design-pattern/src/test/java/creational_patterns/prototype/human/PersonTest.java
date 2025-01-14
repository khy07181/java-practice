package creational_patterns.prototype.human;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void prototype() {
        Person original = new Person("John", 30, "123 Main St");
        original.displayInfo();

        Person cloned = original.clone();
        cloned.updateAddress("456 Clone St");

        original.displayInfo();
        cloned.displayInfo();
    }

}
