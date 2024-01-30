package Structural._2_Bridge;

public class Main {
// Client code

    public static void main(String[] args) {
        // Create instances of shapes with different renderers
        Shape circleWithOpenGL = new Circle(new OpenXLRenderer());
        Shape squareWithDirectorX = new Square(new DirectorXRenderer());

        // Draw shapes with their respective renderers
        circleWithOpenGL.draw();
        squareWithDirectorX.draw();
    }
}
