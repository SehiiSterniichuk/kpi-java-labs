package lab3.fabrics;

import lab3.fabrics.points.CirclePointsFabric;
import lab3.fabrics.points.triangles.RandomTrianglePointsFabric;
import lab3.shapes.circles.Circle;
import lab3.shapes.circles.WhiteCircle;
import lab3.shapes.triangles.Triangle;
import lab3.shapes.triangles.WhiteTriangle;


public class WhiteFactory extends BaseFactory {

    public WhiteFactory() {
        super(new CirclePointsFabric(100),
                new RandomTrianglePointsFabric(150));
    }

    @Override
    public Circle createCircle() {
        return new WhiteCircle(getCirclePointsGenerator().getPoints());
    }

    @Override
    public Triangle createTriangle() {
        return new WhiteTriangle(getTrianglePointsFabric().getPoints());
    }
}
