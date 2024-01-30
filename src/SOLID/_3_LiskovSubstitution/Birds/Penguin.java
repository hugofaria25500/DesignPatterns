package SOLID._3_LiskovSubstitution.Birds;

import SOLID._3_LiskovSubstitution.Bird;

public class Penguin implements Bird {
//SINCE PENGUIN INST A FLY BIRD THEN IT SHOULD IMPLEMENTS THE BIRD INTERFACE DIRECTLY
    @Override
    public void makeSound() {
        System.out.println("Penguin is making a sound...");
    }
}
