package Creational._4_Prototype;

import Creational._3_FactoryMethod.Product;

public class ProductA implements Prototype{
//CONCRETE IMPLEMENTATION OF PROTOTYPE - PRODUCT A
    private String details;

    public ProductA(String details) {
        this.details = details;
    }

    //CLONE METHOD TO CREATE A DEEP COPY
    @Override
    public Prototype clone() {
        return new ProductA(this.details);
    }

    @Override
    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public void printDetails() {
        System.out.println("ProductA details: " + details);
    }
}
