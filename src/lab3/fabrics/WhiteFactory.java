package lab3.fabrics;

import lab3.fabrics.points.CirclePointsFabric;
import lab3.fabrics.points.LeftTrianglePointsFabric;
import lab3.fabrics.points.RightTrianglePointsFabric;
import lab3.shapes.circles.Circle;
import lab3.shapes.circles.WhiteCircle;
import lab3.shapes.triangles.Triangle;
import lab3.shapes.triangles.WhiteTriangle;

import java.util.List;

public class WhiteFactory extends RandomBaseFactory {

    public WhiteFactory() {
        super(List.of(new RightTrianglePointsFabric(50, 100, 1000),
                        new LeftTrianglePointsFabric(50, 100, 1000)),
                new CirclePointsFabric(100));
    }

    @Override
    public Circle createCircle() {
        return new WhiteCircle(circlePointsGenerator.getPoints());
    }

    @Override
    public Triangle createTriangle() {
        return new WhiteTriangle(getTrianglePointsFabric().getPoints());
    }
}
