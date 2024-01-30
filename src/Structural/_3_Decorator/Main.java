package Structural._3_Decorator;

public class Main {
// Client code

    public static void main(String[] args) {

        // Create a car with GPS and Sunroof
        Vehicle decoratedCar = new SunroofDecorator(new GPSDecorator(new Car()));
        decoratedCar.assemble();
        ((VehicleDecorator) decoratedCar).addFeature(); // Access specific features

        System.out.println();

        // Create a bicycle with Electric Engine
        Vehicle decoratedBicycle = new ElectricEngineDecorator(new Bicycle());
        decoratedBicycle.assemble();
        ((VehicleDecorator) decoratedBicycle).addFeature(); // Access specific features
    }
}
