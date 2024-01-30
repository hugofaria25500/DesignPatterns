package Structural._3_Decorator;

public class GPSDecorator implements VehicleDecorator{
// Concrete decorator - GPSDecorator
    private Vehicle vehicle;

    public GPSDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void assemble() {
        vehicle.assemble();
        System.out.println("Adding GPS to the vehicle");
    }

    @Override
    public void addFeature() {
        System.out.println("GPS feature added");
    }
}
