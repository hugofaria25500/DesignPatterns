package Behavioral._2_Command;

public class TurnOffCommand implements Command{
// Concrete command - TurnOffCommand

    private ElectronicDevice electronicDevice;

    public TurnOffCommand(ElectronicDevice electronicDevice) {
       this.electronicDevice = electronicDevice;
    }
    @Override
    public void execute() {
        electronicDevice.turnOff();
    }
}
