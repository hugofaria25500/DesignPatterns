package Structural._1_Adapter;

public class Main {
// Client code that expects the target interface
    public static void main(String[] args) {

        // Create an instance of the adaptee
        Adaptee adaptee = new Adaptee();

        // Create an adapter, passing the adaptee instance
        Target adapter = new Adapter(adaptee);

        // Use the adapter through the target interface
        adapter.request();
    }
}
