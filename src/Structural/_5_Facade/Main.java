package Structural._5_Facade;

public class Main {
//Client Code

    public static void main(String[] args) {
        // Client interacts with the subsystems through the facade
        CarFacade carFacade = new CarFacade();

        // Start the car using the facade
        carFacade.startCar();

        System.out.println();

        // Stop the car using the facade
        carFacade.stopCar();
    }
}
