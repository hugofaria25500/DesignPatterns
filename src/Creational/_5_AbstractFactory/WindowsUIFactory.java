package Creational._5_AbstractFactory;

public class WindowsUIFactory implements UIFactory{
//CONCRETE FACTORY FOR WINDOWS PLATFORM
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
