package lab3.fabrics;

import lab3.fabrics.points.CirclePointsFabric;
import lab3.fabrics.points.quadrangle.RectanglePointsFabric;
import lab3.fabrics.points.triangles.RightTrianglePointsFabric;
import lab3.shapes.circles.BlackCircle;
import lab3.shapes.circles.Circle;
import lab3.shapes.quadrangles.BlackQuadrangle;
import lab3.shapes.quadrangles.Quadrangle;
import lab3.shapes.triangles.BlackTriangle;
import lab3.shapes.triangles.Triangle;

public class BlackFactory extends BaseFactory {
    public BlackFactory() {

        super(new CirclePointsFabric(100),
                new RightTrianglePointsFabric(50, 100, 1000),
                new RectanglePointsFabric(50, 100, 1000));
    }

    @Override
    public Circle createCircle() {

        return new BlackCircle(getCirclePointsGenerator().getPoints());
    }

    @Override
    public Triangle createTriangle() {
        return new BlackTriangle(getTrianglePointsFabric().getPoints());
    }

    public Quadrangle createQuadrangle() {
        return new BlackQuadrangle(getQuadranglePointsFabric().getPoints());
    }
}
