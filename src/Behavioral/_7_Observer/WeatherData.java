package Behavioral._7_Observer;

public interface WeatherData {
// Subject Interface

    void registerObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}
