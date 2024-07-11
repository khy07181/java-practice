package creational_patterns.factory_method;

public class AirplaneFactory extends TransportFactory {

    @Override
    public Transport createTransport(int capacity, double speed) {
        return new Airplane(capacity, speed);
    }
}
