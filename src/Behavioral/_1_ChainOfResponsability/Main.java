package Behavioral._1_ChainOfResponsability;

public class Main {
//Client Code

    public static void main(String[] args) {
        // Create and assemble the chain of handlers
        Manager manager = new Manager();
        Director director = new Director();
        VicePresident vicePresident = new VicePresident();

        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);

// Initiate the request and pass it to the first handler in the chain
        Request request1 = new Request("Manager level request");
        manager.processRequest(request1);

        System.out.println();

// Initiate another request
        Request request2 = new Request("Director level request");
        manager.processRequest(request2);

        System.out.println();

// Initiate another request
        Request request3 = new Request("Vice President level request");
        manager.processRequest(request3);

    }
}
