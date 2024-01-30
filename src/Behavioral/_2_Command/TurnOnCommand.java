package Behavioral._2_Command;

public class TurnOnCommand implements Command{
// Concrete command - TurnOnCommand

    private ElectronicDevice electronicDevice;

    public TurnOnCommand(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.turnOn();
    }
}
