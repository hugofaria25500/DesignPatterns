package Behavioral._2_Command;

public class ElectronicDevice {
    public void turnOn() {
        System.out.println("Electronic Device is turned on");
    }

    public void turnOff() {
        System.out.println("Electronic Device is turned off");
    }

    public void changeVolume(int level) {
        System.out.println("Volume changed to " + level);
    }
}
