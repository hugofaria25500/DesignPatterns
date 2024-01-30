package Behavioral._2_Command;

public class Main {
//Client Code

    public static void main(String[] args) {
        // Create electronic device and commands
        ElectronicDevice electronicDevice = new ElectronicDevice();
        Command turnOnCommand = new TurnOnCommand(electronicDevice);
        Command turnOffCommand = new TurnOffCommand(electronicDevice);
        Command changeVolumeCommand = new ChangeVolumeCommand(electronicDevice, 5);

        // Configure invoker (remote control)
        RemoteControl remoteControl = new RemoteControl();

        // Associate commands with invoker buttons
        remoteControl.setCommand(turnOnCommand);

        // Press the button to execute the command
        remoteControl.pressButton();

        // Associate another command and press the button
        remoteControl.setCommand(changeVolumeCommand);
        remoteControl.pressButton();
    }
}
