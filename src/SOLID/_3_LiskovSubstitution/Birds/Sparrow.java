package SOLID._3_LiskovSubstitution.Birds;

import SOLID._3_LiskovSubstitution.FlyBird;

public class Sparrow implements FlyBird {
//SINCE SPARROW IS A FLY BIRD THEN IT COULD IMPLEMENT THE FLYBIRD INTERFACE TO ACCESS THOSE METHODS

    @Override
    public void makeSound() {
        System.out.println("Sparrow is making a sound...");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}
