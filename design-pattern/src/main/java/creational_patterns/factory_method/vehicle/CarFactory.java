package creational_patterns.factory_method.vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
