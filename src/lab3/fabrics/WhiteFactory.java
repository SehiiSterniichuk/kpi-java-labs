package lab3.fabrics;

import lab3.fabrics.points.RightCirclePointsFabric;
import lab3.fabrics.points.RightTrianglePointsFabric;
import lab3.shapes.circles.Circle;
import lab3.shapes.circles.WhiteCircle;
import lab3.shapes.triangles.Triangle;
import lab3.shapes.triangles.WhiteTriangle;

public class WhiteFactory extends BaseFactory {

    public WhiteFactory() {
        super(new RightTrianglePointsFabric(50, 100),
                new RightCirclePointsFabric(100));
    }

    @Override
    public Circle createCircle() {
        return new WhiteCircle(circlePointsGenerator.getPoints());
    }

    @Override
    public Triangle createTriangle() {
        return new WhiteTriangle(trianglePointsFabric.getPoints());
    }
}
