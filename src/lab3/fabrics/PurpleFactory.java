package lab3.fabrics;

import lab3.fabrics.points.CirclePointsFabric;
import lab3.fabrics.points.quadrangle.RandomQuadranglePointsFabric;
import lab3.fabrics.points.triangles.RandomTrianglePointsFabric;
import lab3.shapes.circles.Circle;
import lab3.shapes.circles.PurpleCircle;
import lab3.shapes.quadrangles.PurpleQuadrangle;
import lab3.shapes.quadrangles.Quadrangle;
import lab3.shapes.triangles.PurpleTriangle;
import lab3.shapes.triangles.Triangle;

public class PurpleFactory extends BaseFactory {

    public PurpleFactory() {
        super(new CirclePointsFabric(100),
                new RandomTrianglePointsFabric(150),
                new RandomQuadranglePointsFabric(150));
    }

    @Override
    public Circle createCircle() {
        return new PurpleCircle(getCirclePointsGenerator().getPoints());
    }

    @Override
    public Triangle createTriangle() {
        return new PurpleTriangle(getTrianglePointsFabric().getPoints());
    }

    public Quadrangle createQuadrangle() {
        return new PurpleQuadrangle(getQuadranglePointsFabric().getPoints());
    }
}
