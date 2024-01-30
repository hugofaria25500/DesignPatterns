package Creational._2_SimpleFactory;

public class Main {
//## CREATIONAL - SIMPLE FACTORY ## //

    public static void main(String[] args) {
    //MAIN CLASS TO DEMONSTRATE THE USAGE OF THE FACTORY AND PRODUCTS

        //CREATE A FACTORY
        ProductFactory productFactory = new ProductFactory();

        //CREATE A PRODUCT
        Product productA = productFactory.createProduct("A");
        productA.doSomething();

        //CREATE A PRODUCT
        Product productB = productFactory.createProduct("B");
        productB.doSomething();
    }
}
