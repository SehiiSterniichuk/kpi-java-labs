package lab3.fabrics;

import lab3.fabrics.points.RightCirclePointsFabric;
import lab3.fabrics.points.RightTrianglePointsFabric;
import lab3.shapes.circles.BlackCircle;
import lab3.shapes.circles.Circle;
import lab3.shapes.triangles.BlackTriangle;
import lab3.shapes.triangles.Triangle;

public class BlackFactory extends BaseFactory {

    public BlackFactory() {
        super(new RightTrianglePointsFabric(50, 100),
                new RightCirclePointsFabric(100));
    }

    @Override
    public Circle createCircle() {
        return new BlackCircle(circlePointsGenerator.getPoints());
    }

    @Override
    public Triangle createTriangle() {
        return new BlackTriangle(trianglePointsFabric.getPoints());
    }
}
