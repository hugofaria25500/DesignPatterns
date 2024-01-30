package Creational._4_Prototype;

public class Main {
//## CREATIONAL - PROTOTYPE ## //

    public static void main(String[] args) {
    //CLIENT CODE USING PROTOTYPES

        //CREATE PROTOTYPES
        Prototype prototypeA = new ProductA("Original Details for ProductA");
        Prototype prototypeB = new ProductB("Original Details for ProductB");

        //CREATE CLONES
        Prototype cloneA = prototypeA.clone();

        Prototype cloneB = prototypeB.clone();
        cloneB.setDetails("Modified details for ProductB");

        cloneA.printDetails();
        cloneB.printDetails();

        System.out.println(prototypeA.hashCode());
        System.out.println(cloneA.hashCode());
    }
}
