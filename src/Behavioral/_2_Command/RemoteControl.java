package Behavioral._2_Command;

public class RemoteControl {
// Invoker - RemoteControl

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
