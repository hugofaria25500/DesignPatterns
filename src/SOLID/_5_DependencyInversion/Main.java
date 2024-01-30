package SOLID._5_DependencyInversion;

public class Main {
//## SOLID - DEPENDENCY INVERSION ## //
/* BASICALLY THE HIGH LEVEL CLASS SHOULDN'T DEPEND ON THE LOWER LEVEL CLASSES,
BOTH SHOULD IMPLEMENT ABSTRACT INTERFACES */
    
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.start();
    }
}
