package lab3.fabrics;

import lab3.fabrics.points.PointsFabric;
import lab3.shapes.circles.BlackCircle;
import lab3.shapes.circles.Circle;
import lab3.shapes.triangles.BlackTriangle;
import lab3.shapes.triangles.Triangle;

public class BlackFactory extends BaseFactory {

    public BlackFactory() {
        super(new PointsFabric(20));
    }

    @Override
    public Circle createCircle() {
        return new BlackCircle(pointsFabric.getPoints(2));
    }

    @Override
    public Triangle createTriangle() {
        return new BlackTriangle(pointsFabric.getPoints(3));
    }
}
