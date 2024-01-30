package Creational._5_AbstractFactory;

public class LinuxUIFactory implements UIFactory{
//CONCRETE FACTORY FOR LINUX PLATFORM
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LinuxTextBox();
    }
}
