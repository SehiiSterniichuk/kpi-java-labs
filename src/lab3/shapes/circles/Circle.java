package lab3.shapes.circles;

import lab3.Color;
import lab3.Point;
import lab3.shapes.Shape;

import java.util.List;

public abstract class Circle extends Shape {
    public Circle(Color color, List<Point> points) {
        super(color, points);
    }
}
