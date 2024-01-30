package Creational._3_FactoryMethod;

public class Main {
//## CREATIONAL - FACTORY METHOD ## //

    public static void main(String[] args) {
    //CLIENT CODE USING FACTORY METHOD

        ProductFactory productAFactory = new ProductAFactory();
        Product productA = productAFactory.createProduct();
        productA.doSomething();

        ProductFactory productBFactory = new ProductBFactory();
        Product productB = productBFactory.createProduct();
        productB.doSomething();

    }
}
