package Behavioral._7_Observer;

public class TemperatureDisplay implements WeatherObserver{
// Concrete Observer - Temperature Display

    @Override
    public void update(int temperature, int humidity, int windSpeed) {
        System.out.println("Temperature Display: " + temperature + " degrees Celsius");
    }
}
