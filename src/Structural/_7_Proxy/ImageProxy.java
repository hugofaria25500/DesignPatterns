package Structural._7_Proxy;

public class ImageProxy implements Image{
// Proxy - ImageProxy

    private RealImage realImage;
    private String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    // Method to perform lazy loading of the real subject
    private void loadImage() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
    }

    @Override
    public void display() {
        // Defer loading until display is called
        loadImage();
        realImage.display();
    }
}
