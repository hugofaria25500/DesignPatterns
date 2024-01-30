package Behavioral._8_State;

public class YellowState implements LightState{
// Concrete State - Yellow

    @Override
    public void handleSwitch(TrafficLightController context) {
        // Transition to the next state (Green)
        context.setLightState(new GreenState());
        System.out.println("Switching to Green state");
    }
}
