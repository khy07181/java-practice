package behavioral_patterns.observer.weather;

public class CurrentConditionDisplay implements WeatherObserver {

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Current: " + temp + "F, " + humidity + "% humidity");
    }

}
