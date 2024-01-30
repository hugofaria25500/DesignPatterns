package Creational._3_FactoryMethod;

public class ProductA implements Product{
//CONCRETE IMPLEMENTATION OF A PRODUCT
    @Override
    public void doSomething() {
        System.out.println("Creating Product A...");
    }
}
