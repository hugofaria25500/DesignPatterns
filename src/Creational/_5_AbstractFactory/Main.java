package Creational._5_AbstractFactory;

public class Main {
//## CREATIONAL - ABSTRACT FACTORY ## //

    public static void main(String[] args) {
    //CLIENT CODE USING ABSTRACT FACTORY

        //CREATE A UI FACTORY
        UIFactory windowsUIfactory = new WindowsUIFactory();
        UIFactory linuxUIfactory = new LinuxUIFactory();

        //CREATE PRODUCTS
        Button windowsButton = windowsUIfactory.createButton();
        TextBox windowsTextBox = windowsUIfactory.createTextBox();

        Button linuxButton = linuxUIfactory.createButton();
        TextBox linuxTextBox = linuxUIfactory.createTextBox();

        //INTERACT WITH PRODUCTS
        windowsButton.click();
        windowsTextBox.type();

        linuxButton.click();
        linuxTextBox.type();


    }
}
