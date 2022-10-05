package lab3.fabrics;

import lab3.fabrics.points.PointsFabric;
import lab3.shapes.circles.Circle;
import lab3.shapes.circles.WhiteCircle;
import lab3.shapes.triangles.Triangle;
import lab3.shapes.triangles.WhiteTriangle;

public class WhiteFactory extends BaseFactory {

    public WhiteFactory() {
        super(new PointsFabric(20));
    }

    @Override
    public Circle createCircle() {
        return new WhiteCircle(pointsFabric.getPoints(2));
    }

    @Override
    public Triangle createTriangle() {
        return new WhiteTriangle(pointsFabric.getPoints(3));
    }
}
