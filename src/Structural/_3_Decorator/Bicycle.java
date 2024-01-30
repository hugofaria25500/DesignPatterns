package Structural._3_Decorator;

public class Bicycle implements Vehicle{
// Concrete component - Bicycle
    @Override
    public void assemble() {
        System.out.println("Assembling Bicycle ..");
    }
}
