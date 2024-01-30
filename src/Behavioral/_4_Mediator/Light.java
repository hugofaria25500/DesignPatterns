package Behavioral._4_Mediator;

public class Light implements Device{
// Concrete colleague - Light

    private HomeAutomationMediator mediator;

    @Override
    public void setMediator(HomeAutomationMediator mediator) {
        this.mediator = mediator;
        mediator.registerDevice(this);
    }

    @Override
    public void triggerEvent(String event) {
        System.out.println("Light received event: " + event);
        // Handle events specific to Light
    }

    public void turnOn() {
        System.out.println("Light is turned on");
        mediator.notify(this, "turnOn");
    }

    public void turnOff() {
        System.out.println("Light is turned off");
        mediator.notify(this, "turnOff");
    }
}
