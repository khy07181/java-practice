package behavioral_patterns.mediator.airport;

import org.junit.jupiter.api.Test;

class AirportMediatorTest {

    @Test
    void mediator() {
        AirportMediator controlTower = new AirportControlTower();

        Flight flight1 = new Flight(controlTower, "KE123");
        Flight flight2 = new Flight(controlTower, "0Z456");
        Runway runway = new Runway(controlTower);

        flight1.land();
        flight2.land();
        runway.clear();
        flight2.land();
    }

}
