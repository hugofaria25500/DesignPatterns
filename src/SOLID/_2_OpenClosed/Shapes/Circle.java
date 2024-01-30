package SOLID._2_OpenClosed.Shapes;

import SOLID._2_OpenClosed.Shape;

public class Circle implements Shape {
//IMPLEMENTS SHAPE INTERFACE IN ORDER TO CREATE A DYNAMIC AND FLEXIBLE SHAPE (CIRCLE)

    @Override
    public void processShape() {
        System.out.println("Processing Circle...");
    }
}
