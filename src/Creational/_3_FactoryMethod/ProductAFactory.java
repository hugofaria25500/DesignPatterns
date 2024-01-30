package Creational._3_FactoryMethod;

public class ProductAFactory implements ProductFactory{
//CONCRETE IMPLEMENTATION OF PRODUCT FACTORY OF PRODUCT A
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
