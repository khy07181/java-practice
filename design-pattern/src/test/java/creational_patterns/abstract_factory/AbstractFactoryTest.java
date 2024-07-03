package creational_patterns.abstract_factory;

import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

    @Test
    void abstractFactoryTest() {
        CarFactory usFactory = new USCarFactory();
        CarFactory euFactory = new EUCarFactory();

        Car usCar = new Car(usFactory);
        usCar.assemble();

        Car euCar = new Car(euFactory);
        euCar.assemble();
    }
}
