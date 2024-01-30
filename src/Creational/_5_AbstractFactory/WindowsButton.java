package Creational._5_AbstractFactory;

public class WindowsButton implements Button{
//CONCRETE PRODUCT FOR WINDOWS PLATFORM

    @Override
    public void click() {
        System.out.println("Windows Button Clicked..");
    }
}
