package item03.staticfactory;

import org.junit.jupiter.api.Test;

class MetaElvisTest {

    @Test
    void generic_singleton_factory() {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();

        System.out.println(elvis1);
        System.out.println(elvis2);

        elvis1.say("hello");
        elvis2.say(100);
    }

}
