package Behavioral._7_Observer;

public class WindSpeedDisplay implements WeatherObserver{
// Concrete Observer - Wind Speed Display

    @Override
    public void update(int temperature, int humidity, int windSpeed) {
        System.out.println("Wind Speed Display: " + windSpeed + " km/h");
    }
}
