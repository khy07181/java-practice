package structural_patterns.decorator.cafe;

import org.junit.jupiter.api.Test;

class CoffeeDecoratorTest {

    @Test
    void decorator() {
       Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + ": " + simpleCoffee.getCost());

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.getDescription() + ": " + milkCoffee.getCost());

        Coffee sugarCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(sugarCoffee.getDescription() + ": " + sugarCoffee.getCost());
    }

}
