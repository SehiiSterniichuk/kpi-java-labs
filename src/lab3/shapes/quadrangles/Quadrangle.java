package lab3.shapes.quadrangles;

import lab3.Color;
import lab3.Point;
import lab3.shapes.Shape;

import java.util.List;

public abstract class Quadrangle extends Shape {

    public Quadrangle(Color color, List<Point> vertices) {
        super(color, vertices);
    }

    public static double calculateSquareOfQuadrangle(double x1, double y1, double x2, double y2,
                                                     double x3, double y3, double x4, double y4) {
        return 0.5 * (Math.abs((x1 * y2 - y1 * x2) + (x2 * y3 - y2 * x3) +
                (x3 * y4 - y3 * x4) + (x4 * y1 - y4 * x1)));
    }

    public static double calculateSquareOfQuadrangle(List<Point> points) {
        return calculateSquareOfQuadrangle(
                points.get(0).x(), points.get(0).y(),
                points.get(1).x(), points.get(1).y(),
                points.get(2).x(), points.get(2).y(),
                points.get(3).x(), points.get(3).y());
    }

    public static double calculateSquareOfQuadrangle(Quadrangle quadrangle) {
        return calculateSquareOfQuadrangle(quadrangle.getVertices());
    }

    @Override
    public Double calculateSquare() {
        return calculateSquareOfQuadrangle(this);
    }

    @Override
    public boolean checkVertices(List<Point> vertices) {
        return checkQuadrangleVertices(vertices);
    }

    public static boolean checkQuadrangleVertices(List<Point> vertices) {
        if (vertices.size() != 4) {
            System.out.println("Rectangle must have 4 vertices instead of " + vertices.size());
            return false;
        }
        if (isCollinear(vertices)) {
            System.out.println("Given points do not form a quadrangle, " +
                    "because three of them lie on the same straight line");
            return false;
        }
        if (calculateSquareOfQuadrangle(vertices) <= 0) {
            System.out.println("Square of this circle is less than 0");
            return false;
        }
        return true;
    }

    public static boolean isCollinear(List<Point> vertices) {
        return (collinearityOfThreePoints(vertices.get(0).x(), vertices.get(0).y(),
                vertices.get(1).x(), vertices.get(1).y(),
                vertices.get(2).x(), vertices.get(2).y()) ||
                collinearityOfThreePoints(vertices.get(0).x(), vertices.get(0).y(),
                        vertices.get(1).x(), vertices.get(1).y(),
                        vertices.get(3).x(), vertices.get(3).y()) ||
                collinearityOfThreePoints(vertices.get(0).x(), vertices.get(0).y(),
                        vertices.get(2).x(), vertices.get(2).y(),
                        vertices.get(3).x(), vertices.get(3).y()) ||
                collinearityOfThreePoints(vertices.get(1).x(), vertices.get(1).y(),
                        vertices.get(2).x(), vertices.get(2).y(),
                        vertices.get(3).x(), vertices.get(3).y()));
    }

    public static boolean collinearityOfThreePoints(double x1, double y1,
                                                    double x2, double y2,
                                                    double x3, double y3) {
        return ((y2 - y1) / (x3 - x1) == (y3 - y1) / (x2 - x1));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "\n\tA: " + vertices.get(0) +
                "\n\tB: " + vertices.get(1) +
                "\n\tC: " + vertices.get(2) +
                "\n\tD: " + vertices.get(3) +
                "\n\tsquare: " + calculateSquare() +
                "\n}";
    }
}
