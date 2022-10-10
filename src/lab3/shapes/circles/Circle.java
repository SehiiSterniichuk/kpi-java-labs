package lab3.shapes.circles;

import lab3.Color;
import lab3.Point;
import lab3.shapes.Shape;

import java.util.List;

public abstract class Circle extends Shape {
    public Circle(Color color, List<Point> points) {
        super(color, points);
    }

    public static double calculateSquareOfCircle(List<Point> points) {
        return calculateSquareOfCircle(points.get(0).x(), points.get(0).y(),
                points.get(1).x(), points.get(1).y());
    }

    public static double calculateSquareOfCircle(double xC, double yC, double x1,
                                                 double y1) {
        double radius = Math.sqrt((xC - x1) * (xC - x1) + (yC - y1) * (yC - y1));
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Double calculateSquare() {
        return calculateSquareOfCircle(getVertices());
    }

    @Override
    public boolean checkVertices(List<Point> vertices) {
        if (vertices.size() != 2) {
            System.out.println("Circle must have 2 vertices instead of " + vertices.size());
            return false;
        } else if (calculateSquareOfCircle(vertices) <= 0) {
            System.out.println("Square of this circle is less than 0");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "\n\tCenter: " + vertices.get(0) +
                "\n\tPoint on circle: " + vertices.get(1) +
                "\n\tsquare: " + calculateSquare() +
                "\n}";
    }
}
