package Structural._7_Proxy;

public class Main {
// Client code

    public static void main(String[] args) {
        // Use the proxy to control access to the real subject
        Image imageProxy = new ImageProxy("large_image.jpg");

        // Displaying the image will trigger lazy loading if not loaded already
        imageProxy.display();

        // Subsequent calls will use the already loaded image
        imageProxy.display();
    }
}
