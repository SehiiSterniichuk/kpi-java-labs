package lab3.shapes.triangles;

import lab3.Color;
import lab3.Point;
import lab3.shapes.Shape;

import java.util.List;

public abstract class Triangle extends Shape {

    public Triangle(Color color, List<Point> vertices) {
        super(color, vertices);
    }

    public static double calculateSquareOfTriangle(double x1, double y1, double x2,
                                                   double y2, double x3, double y3) {
        return 0.5 * (x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2));
    }

    public static double calculateSquareOfTriangle(List<Point> points) {
        return calculateSquareOfTriangle(points.get(0).x(), points.get(0).y(),
                points.get(1).x(), points.get(1).y(),
                points.get(2).x(), points.get(2).y());
    }

    public static double calculateSquareOfTriangle(Triangle triangle) {
        return calculateSquareOfTriangle(triangle.getVertices());
    }

    @Override
    public Double calculateSquare() {
        return calculateSquareOfTriangle(this);
    }

    @Override
    public boolean checkVertices(List<Point> vertices) {
        if (vertices.size() != 3) {
            System.out.println("Triangle must have 3 vertices instead of " + vertices.size());
            return false;
        }
        if (calculateSquareOfTriangle(vertices) <= 0) {
            System.out.println("Square of this triangle less than 0");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "\n\tA: " + vertices.get(0) +
                "\n\tB: " + vertices.get(1) +
                "\n\tC: " + vertices.get(2) +
                "\n\tsquare: " + calculateSquare() +
                "\n}";
    }
}
