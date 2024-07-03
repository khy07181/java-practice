package creational_patterns.factoy_method;

public class Ship implements Transport {

    private int capacity;

    private double speed;

    public Ship(int capacity, double speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    @Override
    public void deliver() {
        System.out.println("Delivering goods by ship");
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
