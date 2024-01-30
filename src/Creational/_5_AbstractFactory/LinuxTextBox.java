package Creational._5_AbstractFactory;

public class LinuxTextBox implements TextBox{
//CONCRETE PRODUCT FOR LINUX PLATFORM

    @Override
    public void type() {
        System.out.println("Linux Text Box Typing..");
    }
}
