package Structural._7_Proxy;

public class RealImage implements Image{
// Real subject - RealImage
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk: " + filename);
        // Simulate resource-intensive operation
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
