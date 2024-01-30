package Behavioral._2_Command;

public class ChangeVolumeCommand implements Command{
// Concrete command - ChangeVolumeCommand

    private ElectronicDevice electronicDevice;
    private int volume;

    public ChangeVolumeCommand(ElectronicDevice electronicDevice, int volume) {
        this.electronicDevice = electronicDevice;
        this.volume = volume;
    }
    @Override
    public void execute() {
        electronicDevice.changeVolume(volume);
    }
}
