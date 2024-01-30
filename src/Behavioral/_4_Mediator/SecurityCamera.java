package Behavioral._4_Mediator;

public class SecurityCamera implements Device{
// Concrete colleague - SecurityCamera

    private HomeAutomationMediator mediator;

    @Override
    public void setMediator(HomeAutomationMediator mediator) {
        this.mediator = mediator;
        mediator.registerDevice(this);
    }

    @Override
    public void triggerEvent(String event) {
        System.out.println("Security Camera received event: " + event);
        // Handle events specific to Security Camera
    }

    public void activateSecurityMode() {
        System.out.println("Security Camera is in security mode");
        mediator.notify(this, "activateSecurityMode");
    }
}
