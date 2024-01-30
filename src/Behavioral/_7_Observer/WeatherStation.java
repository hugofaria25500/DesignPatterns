package Behavioral._7_Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherData{
// Concrete Subject

    private List<WeatherObserver> observers;
    private int temperature;
    private int humidity;
    private int windSpeed;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity, windSpeed);
        }
    }

    // Method to simulate updating weather data
    public void setWeatherData(int temperature, int humidity, int windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        notifyObservers();
    }
}
