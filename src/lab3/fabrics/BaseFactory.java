package lab3.fabrics;

import lab3.fabrics.points.PointsFabric;
import lab3.shapes.circles.Circle;
import lab3.shapes.triangles.Triangle;

public abstract class BaseFactory {

    protected final PointsFabric pointsFabric;

    public BaseFactory(PointsFabric pointsFabric) {
        this.pointsFabric = pointsFabric;
    }

    abstract public Circle createCircle();
    abstract public Triangle createTriangle();
}
