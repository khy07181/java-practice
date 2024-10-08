package creational_patterns.factory_method.vehicle;

public abstract class VehicleFactory {

    abstract Vehicle createVehicle();

    public void deliverVehicle() {
        Vehicle vehicle = createVehicle();
        System.out.println("Delivering the vehicle:");
        vehicle.drive();
    }
}
