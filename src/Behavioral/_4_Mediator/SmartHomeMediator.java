package Behavioral._4_Mediator;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeMediator implements HomeAutomationMediator{
// Concrete mediator - SmartHomeMediator

    private List<Device> devices = new ArrayList<>();

    @Override
    public void registerDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void notify(Device sender, String event) {
        for (Device device : devices) {
            if (device != sender) {
                device.triggerEvent(event);
            }
        }
    }
}
