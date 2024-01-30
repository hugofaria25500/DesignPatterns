package SOLID._2_OpenClosed.Shapes;

import SOLID._2_OpenClosed.Shape;

public class Rectangle implements Shape {
//IMPLEMENTS SHAPE INTERFACE IN ORDER TO CREATE A DYNAMIC AND FLEXIBLE SHAPE (RECTANGLE)

    @Override
    public void processShape() {
        System.out.println("Processing Rectangle...");
    }
}
