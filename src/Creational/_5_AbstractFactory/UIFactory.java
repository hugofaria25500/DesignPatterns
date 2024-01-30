package Creational._5_AbstractFactory;

public interface UIFactory {
//ABSTRACT FACTORY INTERFACE FOR CREATING PRODUCTS
    Button createButton();
    TextBox createTextBox();
}
