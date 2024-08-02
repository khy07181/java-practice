package creational_patterns.template_method.cafe;

import org.junit.jupiter.api.Test;

class CafeTest {

    @Test
    void templateMethodTest() {
        Beverage tea = new Tea();
        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println();

        Beverage coffee = new Coffee();
        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
