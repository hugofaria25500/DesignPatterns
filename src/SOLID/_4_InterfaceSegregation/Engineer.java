package SOLID._4_InterfaceSegregation;

public class Engineer implements Workable, Eatable, Sleepable{
//ENGINEER CLASS THAT IMPLEMENTS ALL THE EXISTING INTERFACES

    @Override
    public void eat() {
        System.out.println("The Engineer is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("The Engineer is sleeping...");
    }

    @Override
    public void work() {
        System.out.println("The Engineer is working...");
    }
}
