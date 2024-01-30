package SOLID._3_LiskovSubstitution;

import SOLID._3_LiskovSubstitution.Birds.Penguin;
import SOLID._3_LiskovSubstitution.Birds.Sparrow;

public class Main {
//## SOLID - LISKOV SUBSTITUTION ## //
/* IT STATES THAT A CLASS THAT IS A SUBCLASS OF ANOTHER CLASS SHOULD BE ABLE
TO BE USED INTERCHANGEABLY WITH ITS SUPERCLASS WITHOUT CAUSING ISSUES */

    public static void main(String[] args) {
        FlyBird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.makeSound();
        sparrow.fly();
        penguin.makeSound();
    }
}
