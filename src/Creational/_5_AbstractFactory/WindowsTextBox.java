package Creational._5_AbstractFactory;

public class WindowsTextBox implements TextBox{
//CONCRETE PRODUCT FOR WINDOWS PLATFORM
    @Override
    public void type() {
        System.out.println("Windows Text Box Typing..");
    }
}
