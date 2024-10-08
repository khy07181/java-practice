package creational_patterns.factory_method.vehicle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VehicleFactoryTest {

    @Test
    @DisplayName("Car 와 Motorcycle 객체를 직접 사용하지 않고 Factory 를 통해 생성")
    void factoryMethod() {
        VehicleFactory carFactory = new CarFactory();
        carFactory.deliverVehicle();

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.deliverVehicle();
    }

}
