package lab3.fabrics;

import lab3.fabrics.points.CirclePointsFabric;
import lab3.fabrics.points.quadrangle.QuadranglePointsFabric;
import lab3.fabrics.points.triangles.TrianglePointsFabric;
import lab3.shapes.circles.Circle;
import lab3.shapes.quadrangles.Quadrangle;
import lab3.shapes.triangles.Triangle;

public abstract class BaseFactory {
    private CirclePointsFabric circlePointsGenerator;

    private TrianglePointsFabric trianglePointsFabric;

    private QuadranglePointsFabric quadranglePointsFabric;

    protected BaseFactory(CirclePointsFabric circlePointsGenerator,
                          TrianglePointsFabric trianglePointsFabric, QuadranglePointsFabric quadranglePointsFabric) {
        if (!checkCirclePointsGenerator(circlePointsGenerator)) {
            throw new IllegalArgumentException("circlePointsGenerator is wrong");
        }
        if (!checkTrianglePointsGenerator(trianglePointsFabric)) {
            throw new IllegalArgumentException("trianglePointsFabric is wrong");
        }
        if (!checkQuadranglePointsGenerator(quadranglePointsFabric)) {
            throw new IllegalArgumentException("quadranglePointsFabric is wrong");
        }
        setTrianglePointsFabric(trianglePointsFabric);
        setCirclePointsGenerator(circlePointsGenerator);
        setQuadranglePointsFabric(quadranglePointsFabric);
    }

    abstract public Circle createCircle();

    abstract public Triangle createTriangle();

    abstract public Quadrangle createQuadrangle();

    public static boolean checkCirclePointsGenerator(CirclePointsFabric circlePointsGenerator) {
        return circlePointsGenerator != null;
    }

    public static boolean checkTrianglePointsGenerator(TrianglePointsFabric trianglePointsFabric) {
        return trianglePointsFabric != null;
    }

    public static boolean checkQuadranglePointsGenerator(QuadranglePointsFabric quadranglePointsFabric) {
        return quadranglePointsFabric != null;
    }


    public void setTrianglePointsFabric(TrianglePointsFabric trianglePointsFabric) {
        this.trianglePointsFabric = trianglePointsFabric;
    }

    public void setCirclePointsGenerator(CirclePointsFabric circlePointsGenerator) {
        this.circlePointsGenerator = circlePointsGenerator;
    }

    public void setQuadranglePointsFabric(QuadranglePointsFabric quadranglePointsFabric) {
        this.quadranglePointsFabric = quadranglePointsFabric;
    }

    public TrianglePointsFabric getTrianglePointsFabric() {
        return this.trianglePointsFabric;
    }

    public CirclePointsFabric getCirclePointsGenerator() {
        return circlePointsGenerator;
    }

    public QuadranglePointsFabric getQuadranglePointsFabric() {
        return quadranglePointsFabric;
    }
}
