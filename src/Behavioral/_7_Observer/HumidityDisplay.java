package Behavioral._7_Observer;

public class HumidityDisplay implements WeatherObserver{
// Concrete Observer - Humidity Display

    @Override
    public void update(int temperature, int humidity, int windSpeed) {
        System.out.println("Humidity Display: " + humidity + "%");
    }
}
