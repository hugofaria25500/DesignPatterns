package Structural._2_Bridge;

public class DirectorXRenderer implements Renderer{
// Concrete implementation - DirectXRenderer
    @Override
    public void render() {
        System.out.println("Rendering with DirectX");
    }
}
