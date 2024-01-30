package Behavioral._8_State;

public class RedState implements LightState{
// Concrete State - Red
    @Override
    public void handleSwitch(TrafficLightController context) {
        // Transition to the next state (Yellow)
        context.setLightState(new YellowState());
        System.out.println("Switching to Yellow state");
    }
}
