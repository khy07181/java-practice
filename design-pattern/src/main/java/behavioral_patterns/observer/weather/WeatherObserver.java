package behavioral_patterns.observer.weather;

public interface WeatherObserver {
    void update(float temp, float humidity, float pressure);
}
