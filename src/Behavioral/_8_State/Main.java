package Behavioral._8_State;

public class Main {
//Code Client

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLightController();

        trafficLight.displayState(); // Initial state: Red

        // Simulate traffic light changes
        trafficLight.switchToNextState(); // Switch to Yellow
        trafficLight.displayState();

        trafficLight.switchToNextState(); // Switch to Green
        trafficLight.displayState();

        trafficLight.switchToNextState(); // Switch to Red
        trafficLight.displayState();
    }
}
