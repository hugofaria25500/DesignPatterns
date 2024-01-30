package Structural._4_Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements Shape{
// Composite component - CompositeShape
    private List<Shape> shapes = new ArrayList<>();

    // Method to add a shape to the composition
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    // Method to remove a shape from the composition
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void draw() {
        System.out.println("Drawing CompositeShape");
        // Draw all shapes in the composition
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
