package creational_patterns.factoy_method;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class FactoryMethodTest {

    @Test
    void factoryMethod() {
        TransportFactory truckFactory = new TruckFactory();
        TransportFactory shipFactory = new ShipFactory();
        TransportFactory airplaneFactory = new AirplaneFactory();

        Transport truck = truckFactory.createTransport(10, 80.0);
        Transport ship = shipFactory.createTransport(200, 30.0);
        Transport airplane = airplaneFactory.createTransport(50, 600.0);

        then(truck.getClass()).isEqualTo(Truck.class);
        then(ship.getClass()).isEqualTo(Ship.class);
        then(airplane.getClass()).isEqualTo(Airplane.class);
    }

}
