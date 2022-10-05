package lab3.shapes;

import lab3.Color;
import lab3.Point;

import java.util.ArrayList;

public abstract class Shape {
    private final Color color;

    protected ArrayList<Point> vertices;

    public Shape(Color color, ArrayList<Point> vertices) {
        this.color = color;
        this.vertices = vertices;
    }

    abstract public Double getSquare();

    public double length(Point a, Point b) {
        return Math.sqrt(Math.pow( (b.x() - a.x()), 2) + Math.pow( (b.y() - a.y()), 2));
    }
}
