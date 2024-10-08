package creational_patterns.factory_method.vehicle;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}
