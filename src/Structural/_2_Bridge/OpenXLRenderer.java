package Structural._2_Bridge;

public class OpenXLRenderer implements Renderer{
// Concrete implementation - OpenGLRenderer
    @Override
    public void render() {
        System.out.println("Rendering with OpenGL");
    }
}
