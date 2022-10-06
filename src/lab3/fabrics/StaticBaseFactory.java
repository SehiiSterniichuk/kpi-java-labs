package lab3.fabrics;

import lab3.fabrics.points.CorrectPointsFabricForBuildingShapes;


public abstract class StaticBaseFactory extends BaseFactory{

    private final CorrectPointsFabricForBuildingShapes trianglePointsFabric;

    public StaticBaseFactory(CorrectPointsFabricForBuildingShapes trianglePointsFabric, CorrectPointsFabricForBuildingShapes circlePointsGenerator) {
        super(circlePointsGenerator);
        this.trianglePointsFabric = trianglePointsFabric;
    }
    @Override
    protected CorrectPointsFabricForBuildingShapes getTrianglePointsFabric() {
        return this.trianglePointsFabric;
    }
}
