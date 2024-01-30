package SOLID._2_OpenClosed;

import SOLID._2_OpenClosed.Shapes.Circle;
import SOLID._2_OpenClosed.Shapes.Rectangle;

public class Main {
//## SOLID - OPEN CLOSED ## //
// IT STATES THAT A CLASS SHOULD BE OPEN FOR EXTENSION AND CLOSED FOR MODIFICATION

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        rectangle.processShape();
        circle.processShape();
    }



}
