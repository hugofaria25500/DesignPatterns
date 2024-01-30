package Creational._4_Prototype;

import Creational._3_FactoryMethod.Product;

public class ProductB implements Prototype {
//CONCRETE IMPLEMENTATION OF PROTOTYPE - PRODUCT B

    private String details;

    public ProductB(String details) {
        this.details = details;
    }

    //CLONE METHOD TO CREATE A DEEP COPY
    @Override
    public Prototype clone() {
        return new ProductB(this.details);
    }

    @Override
    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public void printDetails() {
        System.out.println("ProductB details: " + details);
    }

}
