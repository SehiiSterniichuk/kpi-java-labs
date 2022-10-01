package lab3.fabrics;

import lab3.fabrics.points.PointsFabric;
import lab3.fabrics.points.RandomPointGenerator;
import lab3.shapes.circles.Circle;
import lab3.shapes.triangles.Triangle;

public abstract class BaseFactory {

    protected final PointsFabric trianglePointsFabric;
    protected final PointsFabric circlePointsGenerator;

    public BaseFactory(PointsFabric trianglePointsFabric, PointsFabric circlePointsGenerator) {
        this.trianglePointsFabric = trianglePointsFabric;
        this.circlePointsGenerator = circlePointsGenerator;
    }

    abstract public Circle createCircle();
    abstract public Triangle createTriangle();
}
