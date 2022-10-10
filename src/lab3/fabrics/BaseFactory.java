package lab3.fabrics;

import lab3.fabrics.points.CorrectPointsFabricForBuildingShapes;
import lab3.fabrics.points.triangles.TrianglePointsFabric;
import lab3.shapes.circles.Circle;
import lab3.shapes.triangles.Triangle;

public abstract class BaseFactory {
    private CorrectPointsFabricForBuildingShapes circlePointsGenerator;

    private TrianglePointsFabric trianglePointsFabric;


    protected BaseFactory(CorrectPointsFabricForBuildingShapes circlePointsGenerator,
                          TrianglePointsFabric trianglePointsFabric) {
        if (!checkCirclePointsGenerator(circlePointsGenerator)) {
            throw new IllegalArgumentException("circlePointsGenerator is wrong");
        } else if (!checkTrianglePointsGenerator(trianglePointsFabric)) {
            throw new IllegalArgumentException("trianglePointsFabric is wrong");
        }
        setTrianglePointsFabric(trianglePointsFabric);
        setCirclePointsGenerator(circlePointsGenerator);
    }

    abstract public Circle createCircle();

    abstract public Triangle createTriangle();


    public boolean checkCirclePointsGenerator(CorrectPointsFabricForBuildingShapes circlePointsGenerator) {
        return circlePointsGenerator != null;
    }

    public boolean checkTrianglePointsGenerator(TrianglePointsFabric trianglePointsFabric) {
        return trianglePointsFabric != null;
    }


    public void setTrianglePointsFabric(TrianglePointsFabric trianglePointsFabric) {
        this.trianglePointsFabric = trianglePointsFabric;
    }

    public void setCirclePointsGenerator(CorrectPointsFabricForBuildingShapes circlePointsGenerator) {
        this.circlePointsGenerator = circlePointsGenerator;
    }

    public CorrectPointsFabricForBuildingShapes getTrianglePointsFabric() {
        return this.trianglePointsFabric;
    }

    public CorrectPointsFabricForBuildingShapes getCirclePointsGenerator() {
        return circlePointsGenerator;
    }
}
