package lab3.fabrics;

import lab3.fabrics.points.CorrectPointsFabricForBuildingShapes;
import lab3.shapes.circles.Circle;
import lab3.shapes.triangles.Triangle;

import java.util.List;
import java.util.Random;

public abstract class BaseFactory {
    protected static final Random rand = new Random();

    private List<CorrectPointsFabricForBuildingShapes> trianglePointsFabrics;
    protected final CorrectPointsFabricForBuildingShapes circlePointsGenerator;

    public BaseFactory(List<CorrectPointsFabricForBuildingShapes> trianglePointsFabrics, CorrectPointsFabricForBuildingShapes circlePointsGenerator) {
        this.trianglePointsFabrics = trianglePointsFabrics;
        this.circlePointsGenerator = circlePointsGenerator;
    }

    protected CorrectPointsFabricForBuildingShapes getTrianglePointsFabric() {
        int randIndex = rand.nextInt(trianglePointsFabrics.size());
        return trianglePointsFabrics.get(randIndex);
    }

    abstract public Circle createCircle();
    abstract public Triangle createTriangle();
}
