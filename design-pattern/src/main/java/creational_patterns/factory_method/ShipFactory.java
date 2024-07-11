package creational_patterns.factory_method;

public class ShipFactory extends TransportFactory {

    @Override
    public Transport createTransport(int capacity, double speed) {
        return new Ship(capacity, speed);
    }
}
