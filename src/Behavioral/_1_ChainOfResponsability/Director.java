package Behavioral._1_ChainOfResponsability;

public class Director implements Approver{
// Concrete handler - Director
    private Approver successor;

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    @Override
    public void processRequest(Request request) {
        if (request.getContent().startsWith("Director")) {
            System.out.println("Director approves the request: " + request.getContent());
        } else if (successor != null) {
            successor.processRequest(request);
        } else {
            System.out.println("Request cannot be approved at this level");
        }
    }
}
