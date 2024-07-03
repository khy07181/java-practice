package creational_patterns.abstract_factory;

public class USCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new USEngine();
    }

    @Override
    public Tire createTire() {
        return new USTire();
    }

    @Override
    public Body createBody() {
        return new USBody();
    }
}
