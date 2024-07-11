package creational_patterns.factory_method;

public abstract class TransportFactory {

    public abstract Transport createTransport(int capacity, double speed);

}
