package creational_patterns.abstract_factory;

public class Car {

    private Engine engine;

    private Tire tire;

    private Body body;

    public Car(CarFactory factory) {
        this.engine = factory.createEngine();
        this.tire = factory.createTire();
        this.body = factory.createBody();
    }

    public void assemble() {
        engine.design();
        tire.design();
        body.design();
        System.out.println("Car assembly complete.");
    }
}
