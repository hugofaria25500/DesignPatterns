package Creational._3_FactoryMethod;

public class ProductBFactory implements ProductFactory{
//CONCRETE IMPLEMENTATION OF PRODUCT FACTORY OF PRODUCT B

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
