package SOLID._5_DependencyInversion;

public class Engine implements EngineInterface {
//IMPLEMENTS THE ENGINE INTERFACE AND OVERRIDE THE START METHOD
    @Override
    public void start() {
        System.out.println("Starting engine...");
    }
}
