package Behavioral._8_State;

public class TrafficLightController implements TrafficLight{
// Context Implementation

    private LightState currentState;

    public TrafficLightController() {
        // Initial state: Red
        this.currentState = new RedState();
    }

    @Override
    public void switchToNextState() {
        // Delegate the switch operation to the current state
        currentState.handleSwitch(this);
    }

    @Override
    public void displayState() {
        System.out.println("Current state: " + currentState.getClass().getSimpleName());
    }

    // Setter to update the current state
    public void setLightState(LightState state) {
        this.currentState = state;
    }
}
