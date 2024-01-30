package Behavioral._8_State;

public class GreenState implements LightState{
// Concrete State - Green

    @Override
    public void handleSwitch(TrafficLightController context) {
        // Transition to the next state (Red)
        context.setLightState(new RedState());
        System.out.println("Switching to Red state");
    }
}
