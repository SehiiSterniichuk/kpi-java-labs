package lab3.fabrics;

import lab3.fabrics.points.CirclePointsFabric;
import lab3.fabrics.points.LeftTrianglePointsFabric;
import lab3.fabrics.points.RightTrianglePointsFabric;
import lab3.shapes.circles.BlackCircle;
import lab3.shapes.circles.Circle;
import lab3.shapes.triangles.BlackTriangle;
import lab3.shapes.triangles.Triangle;

import java.util.List;

public class BlackFactory extends RandomBaseFactory {

    public BlackFactory() {
        super(List.of(new RightTrianglePointsFabric(50, 100, 1000),
                        new LeftTrianglePointsFabric(50, 100, 1000)),
                new CirclePointsFabric(100));
    }

    @Override
    public Circle createCircle() {
        return new BlackCircle(circlePointsGenerator.getPoints());
    }

    @Override
    public Triangle createTriangle() {
        return new BlackTriangle(getTrianglePointsFabric().getPoints());
    }
}
