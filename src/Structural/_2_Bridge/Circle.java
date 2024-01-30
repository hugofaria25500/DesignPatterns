package Structural._2_Bridge;

public class Circle implements Shape{
// Refined abstraction - Circle
    private Renderer renderer;

    public Circle(Renderer renderer) {
        this.renderer = renderer;
    }

    // Implement high-level operation using the renderer
    @Override
    public void draw() {
        System.out.println("Drawing Circle ..");
        renderer.render();
    }
}
