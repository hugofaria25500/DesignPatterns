package Behavioral._4_Mediator;

public interface Device {
// Colleague interface
    void setMediator(HomeAutomationMediator mediator);
    void triggerEvent(String event);
}
