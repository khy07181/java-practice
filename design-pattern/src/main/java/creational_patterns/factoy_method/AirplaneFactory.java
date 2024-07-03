package creational_patterns.factoy_method;

public class AirplaneFactory extends TransportFactory {

    @Override
    public Transport createTransport(int capacity, double speed) {
        return new Airplane(capacity, speed);
    }
}
