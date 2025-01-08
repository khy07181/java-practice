package behavioral_patterns.observer.weather;

import org.junit.jupiter.api.Test;

class WeatherTest {

    @Test
    void observer() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        StatisticDisplay statisticsDisplay = new StatisticDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData. registerObserver(forecastDisplay);

        weatherData.setMeasurements (80, 65, 30.4f);
    }

}
