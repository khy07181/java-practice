package creational_patterns.abstract_factory;

public interface CarFactory {
    Engine createEngine();
    Tire createTire();
    Body createBody();
}
