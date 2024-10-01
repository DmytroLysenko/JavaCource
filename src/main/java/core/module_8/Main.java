package src.main.java.core.module_8;

import src.main.java.core.module_8.figures.Circle;
import src.main.java.core.module_8.figures.Oval;
import src.main.java.core.module_8.figures.Rectangle;
import src.main.java.core.module_8.figures.Square;
import src.main.java.core.module_8.figures.Triangle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Oval oval = new Oval();

        circle.printShapeName();
        rectangle.printShapeName();
        square.printShapeName();
        triangle.printShapeName();
        oval.printShapeName();
    }
}
