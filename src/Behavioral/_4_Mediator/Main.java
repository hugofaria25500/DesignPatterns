package Behavioral._4_Mediator;

public class Main {
//Client Code

    public static void main(String[] args) {
        // Create mediator
        HomeAutomationMediator smartHomeMediator = new SmartHomeMediator();

        // Create devices and associate them with the mediator
        Light light = new Light();
        light.setMediator(smartHomeMediator);

        Thermostat thermostat = new Thermostat();
        thermostat.setMediator(smartHomeMediator);

        SecurityCamera securityCamera = new SecurityCamera();
        securityCamera.setMediator(smartHomeMediator);

        // Trigger events through the devices
        light.turnOn();
        thermostat.adjustTemperature();
        securityCamera.activateSecurityMode();
    }
}
