package Creational._4_Prototype;

import Creational._3_FactoryMethod.Product;

public interface Prototype {
//PROTOTYPE INTERFACE DECLARING THE CLONE METHOD

    Prototype clone();
    void setDetails(String details);
    void printDetails();

}
