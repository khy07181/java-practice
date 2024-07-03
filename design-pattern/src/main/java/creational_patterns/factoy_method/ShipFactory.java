package creational_patterns.factoy_method;

public class ShipFactory extends TransportFactory {

    @Override
    public Transport createTransport(int capacity, double speed) {
        return new Ship(capacity, speed);
    }
}
