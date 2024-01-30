package Structural._4_Composite;

public class Main {
//Client Code

    public static void main(String[] args) {
        // Create individual shapes
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Create a composite shape and add individual shapes
        CompositeShape composite = new CompositeShape();
        composite.addShape(circle);
        composite.addShape(rectangle);

        // Draw individual shapes
        circle.draw();
        rectangle.draw();

        System.out.println();

        // Draw the composite shape, which internally draws individual shapes
        composite.draw();
    }
}
