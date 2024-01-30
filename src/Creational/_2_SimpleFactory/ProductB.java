package Creational._2_SimpleFactory;

public class ProductB implements Product{
//CONCRETE IMPLEMENTATION OF PRODUCT
    @Override
    public void doSomething() {
        System.out.println("Creating Product B...");
    }
}
