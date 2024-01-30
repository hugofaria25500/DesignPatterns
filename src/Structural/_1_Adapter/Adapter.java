package Structural._1_Adapter;

public class Adapter  implements Target{
// Adapter class that implements the target interface and contains an instance of the adaptee
    private Adaptee adaptee;

    // Constructor to initialize the adapter with an instance of the adaptee
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    // Implement the target interface by translating the request to the adaptee's specific method
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
