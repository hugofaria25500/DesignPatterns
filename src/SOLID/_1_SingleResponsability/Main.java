package SOLID._1_SingleResponsability;

public class Main {
//## SOLID - SINGLE RESPONSIBILITY ## //
// IT STATES THAT A CLASS SHOULD HAVE ONLY ONE REASON TO CHANGE

    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"John Doe", 1000);
        Employee employee2 = new Employee(2,"Thomas Guller", 1500);

        employee1.calculateSalary();
        employee2.calculateSalary();

        Database database = new Database();
        database.saveEmployee(employee1);
        database.saveEmployee(employee2);
    }
}
