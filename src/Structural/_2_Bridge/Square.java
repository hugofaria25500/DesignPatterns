package Structural._2_Bridge;

public class Square implements Shape{
// Refined abstraction - Square

    private Renderer renderer;

    public Square (Renderer renderer) {
        this.renderer = renderer;
    }

    // Implement high-level operation using the renderer
    @Override
    public void draw() {
        System.out.println("Drawing Square ..");
        renderer.render();
    }
}
