package Behavioral._7_Observer;

public class Main {
//Code Client

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Create displays and register them as observers
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        HumidityDisplay humidityDisplay = new HumidityDisplay();
        WindSpeedDisplay windSpeedDisplay = new WindSpeedDisplay();

        weatherStation.registerObserver(temperatureDisplay);
        weatherStation.registerObserver(humidityDisplay);
        weatherStation.registerObserver(windSpeedDisplay);

        // Simulate updating weather data
        weatherStation.setWeatherData(25, 60, 15);
        // Output:
        // Temperature Display: 25 degrees Celsius
        // Humidity Display: 60%
        // Wind Speed Display: 15 km/h

        // Unregister a display (remove observer)
        weatherStation.removeObserver(temperatureDisplay);

        // Simulate updating weather data again
        weatherStation.setWeatherData(28, 55, 20);
        // Output:
        // Humidity Display: 55%
        // Wind Speed Display: 20 km/h
    }
}
