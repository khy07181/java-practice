package creational_patterns.factory_method;

public class Airplane implements Transport {

    private int capacity;

    private double speed;

    public Airplane(int capacity, double speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    @Override
    public void deliver() {
        System.out.println("Delivering goods by airplane");
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
