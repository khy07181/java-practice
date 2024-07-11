package creational_patterns.factory_method;

public class TruckFactory extends TransportFactory {

    @Override
    public Transport createTransport(int capacity, double speed) {
        return new Truck(capacity, speed);
    }
}
