package Structural._3_Decorator;

public class ElectricEngineDecorator implements VehicleDecorator{
// Concrete decorator - ElectricEngineDecorator
    private Vehicle vehicle;

    public ElectricEngineDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void assemble() {
        vehicle.assemble();
        System.out.println("Adding Electric Engine to the vehicle");
    }

    @Override
    public void addFeature() {
        System.out.println("Electric Engine feature added");
    }
}
