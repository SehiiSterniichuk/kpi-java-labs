package lab3.shapes.triangles;

import lab3.Color;
import lab3.Point;
import lab3.shapes.Shape;

import java.util.List;

public abstract class Triangle extends Shape {

    public Triangle(Color color, List<Point> vertices) {
        super(color, vertices);
    }

    public static double calculateSquareOfTriangle(List<Point> points) {
        return calculateSquareOfTriangle(points.get(0).x(), points.get(0).y(),
                points.get(1).x(), points.get(1).y(),
                points.get(2).x(), points.get(2).y());
    }

    public static double calculateSquareOfTriangle(double x1, double y1, double x2,
                                                   double y2, double x3, double y3) {
        return 0.5 * (x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2));
    }

    @Override
    public boolean setVertices(List<Point> vertices) {
        if (vertices.size() != 3) {
            System.out.println("Triangle must have 3 vertices instead of " + vertices.size());
            return false;
        }
        double localSquare = calculateSquareOfTriangle(vertices);
        if (localSquare <= 0) {
            System.out.println("Square of this triangle less than 0");
            return false;
        }
        square = localSquare;
        this.vertices = vertices;
        return true;
    }
}
