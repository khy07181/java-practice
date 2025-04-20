package behavioral_patterns.mediator.airport;

public class AirportControlTower implements AirportMediator {
    private boolean isRunwayAvailable = true;

    public boolean isRunwayAvailable() {
        return isRunwayAvailable;
    }

    public void setRunwayAvailability(boolean status) {
        isRunwayAvailable = status;
    }
}
