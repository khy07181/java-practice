package behavioral_patterns.mediator.airport;

public class Runway {

    private final AirportMediator mediator;

    public Runway(AirportMediator mediator) {
        this.mediator = mediator;

    }

    public void clear() {
        System.out.println("Runway is clear.");
        mediator.setRunwayAvailability(true);
    }
}
