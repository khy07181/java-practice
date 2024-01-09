package item02.hierarchicalbuilder;

import static item02.hierarchicalbuilder.NewYorkPizza.Size.SMALL;
import static item02.hierarchicalbuilder.Pizza.Topping.HAM;
import static item02.hierarchicalbuilder.Pizza.Topping.ONION;
import static item02.hierarchicalbuilder.Pizza.Topping.SAUSAGE;

class PizzaTest {
    public static void main(String[] args) {
        NewYorkPizza pizza = new NewYorkPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}
