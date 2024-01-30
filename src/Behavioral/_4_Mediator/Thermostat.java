package Behavioral._4_Mediator;

public class Thermostat implements Device{
// Concrete colleague - Thermostat

    private HomeAutomationMediator mediator;

    @Override
    public void setMediator(HomeAutomationMediator mediator) {
        this.mediator = mediator;
        mediator.registerDevice(this);
    }

    @Override
    public void triggerEvent(String event) {
        System.out.println("Thermostat received event: " + event);
        // Handle events specific to Thermostat
    }

    public void adjustTemperature() {
        System.out.println("Thermostat is adjusting temperature");
        mediator.notify(this, "adjustTemperature");
    }
}
