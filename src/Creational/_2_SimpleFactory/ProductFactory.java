package Creational._2_SimpleFactory;

public class ProductFactory implements ProductFactoryInterface{
//CONCRETE IMPLEMENTATION OF PRODUCT FACTORY

    @Override
    public Product createProduct(String type) {
        if (type.equals("A")) {
            return new ProductA();
        } else if(type.equals("B")) {
            return new ProductB();
        } else {
            throw new IllegalArgumentException("Invalidate Type Of Product..");
        }
    }
}
