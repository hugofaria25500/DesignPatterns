package Behavioral._4_Mediator;

public interface HomeAutomationMediator {
// Mediator interface
    void registerDevice(Device device);
    void notify(Device sender, String event);
}
