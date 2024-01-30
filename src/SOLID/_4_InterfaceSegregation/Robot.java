package SOLID._4_InterfaceSegregation;

public class Robot implements Workable{
//SINCE A ROBOT DOESN'T EAT OR SLEEP, IT ONLY IMPLEMENTS THE WORKABLE INTERFACE
    @Override
    public void work() {
        System.out.println("The Robot is working...");
    }
}
