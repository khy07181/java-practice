package structural_patterns.composite;

import org.junit.jupiter.api.Test;
import structural_patterns.composite.game.Bag;
import structural_patterns.composite.game.Item;

class CompositeTest {

    @Test
    void composite() {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        System.out.println(doranBlade.getPrice());
        System.out.println(bag.getPrice());
    }

}
