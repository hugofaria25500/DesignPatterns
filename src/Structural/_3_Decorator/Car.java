package Structural._3_Decorator;

public class Car implements Vehicle{
// Concrete component - Car

    @Override
    public void assemble() {
        System.out.println("Assembling Car ..");
    }
}
