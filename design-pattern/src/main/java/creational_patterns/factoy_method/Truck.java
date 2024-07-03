package creational_patterns.factoy_method;

public class Truck implements Transport {

    private int capacity;

    private double speed;

    public Truck(int capacity, double speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    @Override
    public void deliver() {
        System.out.println("Delivering goods by truck");
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
