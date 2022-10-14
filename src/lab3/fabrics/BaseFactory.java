package lab3.fabrics;

import lab3.fabrics.points.CorrectPointsFabricForBuildingShapes;
import lab3.fabrics.points.quadrangle.QuadranglePointsFabric;
import lab3.fabrics.points.triangles.TrianglePointsFabric;
import lab3.shapes.circles.Circle;
import lab3.shapes.quadrangles.Quadrangle;
import lab3.shapes.triangles.Triangle;

public abstract class BaseFactory {
    private CorrectPointsFabricForBuildingShapes circlePointsGenerator;

    private TrianglePointsFabric trianglePointsFabric;

    private QuadranglePointsFabric quadranglePointsFabric;

    protected BaseFactory(CorrectPointsFabricForBuildingShapes circlePointsGenerator,
                          TrianglePointsFabric trianglePointsFabric, QuadranglePointsFabric quadranglePointsFabric) {
        if (!checkCirclePointsGenerator(circlePointsGenerator)) {
            throw new IllegalArgumentException("circlePointsGenerator is wrong");
        } else if (!checkTrianglePointsGenerator(trianglePointsFabric)) {
            throw new IllegalArgumentException("trianglePointsFabric is wrong");
        } else if (!checkQuadranglePointsGenerator(quadranglePointsFabric)) {
            throw new IllegalArgumentException("quadranglePointsFabric is wrong");
        }
        setTrianglePointsFabric(trianglePointsFabric);
        setCirclePointsGenerator(circlePointsGenerator);
        setQuadranglePointsFabric(quadranglePointsFabric);
    }

    abstract public Circle createCircle();

    abstract public Triangle createTriangle();

    abstract public Quadrangle createQuadrangle();

    public boolean checkCirclePointsGenerator(CorrectPointsFabricForBuildingShapes circlePointsGenerator) {
        return circlePointsGenerator != null;
    }

    public boolean checkTrianglePointsGenerator(TrianglePointsFabric trianglePointsFabric) {
        return trianglePointsFabric != null;
    }

    public boolean checkQuadranglePointsGenerator(QuadranglePointsFabric quadranglePointsFabric) {
        return quadranglePointsFabric != null;
    }


    public void setTrianglePointsFabric(TrianglePointsFabric trianglePointsFabric) {
        this.trianglePointsFabric = trianglePointsFabric;
    }

    public void setCirclePointsGenerator(CorrectPointsFabricForBuildingShapes circlePointsGenerator) {
        this.circlePointsGenerator = circlePointsGenerator;
    }

    public void setQuadranglePointsFabric(QuadranglePointsFabric quadranglePointsFabric) {
        this.quadranglePointsFabric = quadranglePointsFabric;
    }

    public CorrectPointsFabricForBuildingShapes getTrianglePointsFabric() {
        return this.trianglePointsFabric;
    }

    public CorrectPointsFabricForBuildingShapes getCirclePointsGenerator() {
        return circlePointsGenerator;
    }

    public CorrectPointsFabricForBuildingShapes getQuadranglePointsFabric() { return quadranglePointsFabric;
    }
}
