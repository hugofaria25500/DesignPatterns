package SOLID._1_SingleResponsability;

public class Database {
//EACH CLASS SHOULD HAVE ONLY AND JUST ONLY A SINGLE RESPONSIBILITY

    public void saveEmployee (Employee employee) {
        System.out.println("Employee saved in the database.." + "\n" +
        "Employee ID: " + employee.getId() + "\n" +
        "Employee Name: " + employee.getName());
    }
}
