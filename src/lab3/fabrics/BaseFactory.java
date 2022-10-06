package lab3.fabrics;

import lab3.fabrics.points.CorrectPointsFabricForBuildingShapes;
import lab3.shapes.circles.Circle;
import lab3.shapes.triangles.Triangle;

import java.util.Random;

public abstract class BaseFactory {
    protected static final Random rand = new Random();
    protected CorrectPointsFabricForBuildingShapes circlePointsGenerator;

    protected BaseFactory(CorrectPointsFabricForBuildingShapes circlePointsGenerator) {
        if(setCirclePointsGenerator(circlePointsGenerator)){
            throw new IllegalArgumentException("circlePointsGenerator is wrong");
        }
    }


    protected abstract CorrectPointsFabricForBuildingShapes getTrianglePointsFabric();

    abstract public Circle createCircle();
    abstract public Triangle createTriangle();

    public boolean setCirclePointsGenerator(CorrectPointsFabricForBuildingShapes circlePointsGenerator) {
        if(circlePointsGenerator == null){
            return false;
        }
        this.circlePointsGenerator = circlePointsGenerator;
        return true;
    }
}
