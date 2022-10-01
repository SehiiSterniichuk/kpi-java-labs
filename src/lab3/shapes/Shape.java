package lab3.shapes;

import lab3.Color;
import lab3.Point;

import java.util.List;

public abstract class Shape {
    private final Color color;

    protected List<Point> vertices;

    protected Double square = 0.;

    public Shape(Color color, List<Point> vertices) {
        this.color = color;
        if (!setVertices(vertices)) {
            throw new RuntimeException("Invalid vertices");
        }
    }

    public Double getSquare() {
        return this.square;
    }

    public Color getColor() {
        return color;
    }

    abstract public boolean setVertices(List<Point> vertices);
}
