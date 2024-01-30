package Behavioral._1_ChainOfResponsability;

public class Manager implements Approver{
// Concrete handler - Manager

    private Approver successor;

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }
    @Override
    public void processRequest(Request request) {
        if (request.getContent().startsWith("Manager")) {
            System.out.println("Manager approves the request: " + request.getContent());
        } else if (successor != null) {
            successor.processRequest(request);
        } else {
            System.out.println("Request cannot be approved at this level");
        }
    }
}
