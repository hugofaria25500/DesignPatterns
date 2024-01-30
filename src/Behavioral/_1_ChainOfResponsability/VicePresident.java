package Behavioral._1_ChainOfResponsability;

public class VicePresident implements Approver{
// Concrete handler - Vice President
    @Override
    public void processRequest(Request request) {
        System.out.println("Vice President approves the request: " + request.getContent());
    }
}
