package Structural._3_Decorator;

public class SunroofDecorator implements VehicleDecorator{
// Concrete decorator - SunroofDecorator
    private Vehicle vehicle;

    public SunroofDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void assemble() {
        vehicle.assemble();
        System.out.println("Adding Sunroof to the vehicle");
    }

    @Override
    public void addFeature() {
        System.out.println("Sunroof feature added");
    }
}
