package SOLID._4_InterfaceSegregation;

public class Main {
//## SOLID - INTERFACE SEGREGATION ## //
// IT SUGGESTS THAT A CLASS SHOULD NOT BE FORCED TO IMPLEMENT INTERFACES IT DOESN'T NEED

    public static void main(String[] args) {
        Robot robot = new Robot();
        Engineer engineer = new Engineer();

        robot.work();
        engineer.eat();
        engineer.work();
        engineer.sleep();
    }
}
