package lab3.fabrics;

import lab3.fabrics.points.RandomPointGenerator;
import lab3.fabrics.points.RightTrianglePointsFabric;
import lab3.shapes.circles.Circle;
import lab3.shapes.triangles.BlackTriangle;
import lab3.shapes.triangles.Triangle;

public class WhiteFactory extends BaseFactory {

    public WhiteFactory() {
        super(new RightTrianglePointsFabric(50, 100),
                new RandomPointGenerator(100));
    }

//    @Override
//    public Circle createCircle() {
//        return null;
//    }

    @Override
    public Triangle createTriangle() {
        return new BlackTriangle(trianglePointsFabric.getPoints());
    }
}
