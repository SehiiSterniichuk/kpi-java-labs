package lab3.shapes.circles;

import lab3.Color;
import lab3.Point;
import lab3.shapes.Shape;

import java.util.ArrayList;

public abstract class Circle extends Shape {
    public Circle(Color color, ArrayList<Point> verticies) {
        super(color, verticies);
        if (verticies.size() != 2 || getSquare() == 0.0) {
            throw new IllegalArgumentException("Center and the point on the circle are the same! This is not a circle");
        }
    }

    @Override
    public Double getSquare() {
        return Math.PI * Math.pow(length(vertices.get(0), vertices.get(1)),2);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "\n\tCenter: " + vertices.get(0) +
                "\n\tPoint on circle: " + vertices.get(1) +
                "\n\tsquare: " + getSquare() +
                "\n}";
    }
}
