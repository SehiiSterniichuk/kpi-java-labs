package lab3.shapes.triangles;

import lab3.Color;
import lab3.Point;
import lab3.shapes.Shape;

import java.util.ArrayList;

public abstract class Triangle extends Shape {

    public Triangle(Color color, ArrayList<Point> vertices) {
        super(color, vertices);
        if (
                vertices.size() != 3 || getSquare() == 0.0
                || (length(vertices.get(0),vertices.get(1)) + length(vertices.get(1),vertices.get(2)) <= length(vertices.get(0),vertices.get(2)))
                || (length(vertices.get(0),vertices.get(1)) + length(vertices.get(0),vertices.get(2)) <= length(vertices.get(1),vertices.get(2)))
                || (length(vertices.get(0),vertices.get(2)) + length(vertices.get(1),vertices.get(2)) <= length(vertices.get(0),vertices.get(1)))
        )
            throw new IllegalArgumentException("Wrong vertexes for triangle!");

    }

    @Override
    public Double getSquare() {
        double firstMultiple =  (vertices.get(0).x() - vertices.get(2).x()) * (vertices.get(1).y() - vertices.get(0).y());
        double secondMultiple = (vertices.get(0).x() - vertices.get(1).x()) * (vertices.get(2).y() - vertices.get(0).y());
        return 0.5 * Math.abs(firstMultiple - secondMultiple);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "\n\tA: " + vertices.get(0) +
                "\n\tB: " + vertices.get(1) +
                "\n\tC: " + vertices.get(2) +
                "\n\tsquare: " + getSquare() +
                "\n}";
    }
}
