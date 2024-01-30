package Creational._5_AbstractFactory;

public class LinuxButton implements Button{
//CONCRETE PRODUCT FOR LINUX PLATFORM

    @Override
    public void click() {
        System.out.println("Linux Button Clicked..");
    }
}
