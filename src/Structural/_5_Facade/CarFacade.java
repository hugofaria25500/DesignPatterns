package Structural._5_Facade;

public class CarFacade {
// Facade class

    private Engine engine;
    private AirConditioning ac;
    private Lights lights;

    public CarFacade() {
        this.engine = new Engine();
        this.ac = new AirConditioning();
        this.lights = new Lights();
    }

    // Facade method to start the car
    public void startCar() {
        engine.start();
        ac.turnOn();
        lights.turnOn();
        System.out.println("Car started and ready to drive");
    }

    // Facade method to stop the car
    public void stopCar() {
        engine.stop();
        ac.turnOff();
        lights.turnOff();
        System.out.println("Car stopped");
    }
}
