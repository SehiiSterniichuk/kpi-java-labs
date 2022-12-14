package lab3.shapes;

import lab3.Color;
import lab3.Point;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    private final Color color;

    protected List<Point> vertices;


    public Shape(Color color, List<Point> vertices) {
        this.color = color;
        if (!checkVertices(vertices)) {
            throw new IllegalArgumentException("Invalid vertices");
        }
        this.vertices = vertices;
    }

    abstract public Double calculateSquare();

    public List<Point> getVertices() {
        return new ArrayList<>(vertices);
    }

    abstract public boolean checkVertices(List<Point> vertices);

    public void setVertices(List<Point> vertices) {
        this.vertices = vertices;
    }

    public Color getColor() {
        return color;
    }
}
