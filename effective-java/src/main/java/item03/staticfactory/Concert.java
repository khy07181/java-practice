package item03.staticfactory;

import java.util.function.Supplier;

public class Concert {

    public void start(Supplier<Singer> singerSupplier) {
        Singer singer = singerSupplier.get();
        singer.sing();
    }

}
