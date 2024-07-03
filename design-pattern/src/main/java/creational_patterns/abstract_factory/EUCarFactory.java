package creational_patterns.abstract_factory;

public class EUCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new EUEngine();
    }

    @Override
    public Tire createTire() {
        return new EUTire();
    }

    @Override
    public Body createBody() {
        return new EUBody();
    }
}
