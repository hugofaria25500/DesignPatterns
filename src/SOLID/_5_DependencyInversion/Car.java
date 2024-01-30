package SOLID._5_DependencyInversion;

public class Car {
//SINCE THE CAR CLASS DEPENDS ON AN ABSTRACT CLASS WE JUST NEED TO CHANGE OR USE ANOTHER ENGINE INTERFACE CLASS
    EngineInterface engine;

    public Car(EngineInterface engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

}
