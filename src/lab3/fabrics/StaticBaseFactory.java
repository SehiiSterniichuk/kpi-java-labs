package lab3.fabrics;

import lab3.fabrics.points.CorrectPointsFabricForBuildingShapes;


public abstract class StaticBaseFactory extends BaseFactory {

    private CorrectPointsFabricForBuildingShapes trianglePointsFabric;

    public StaticBaseFactory(CorrectPointsFabricForBuildingShapes trianglePointsFabric, CorrectPointsFabricForBuildingShapes circlePointsGenerator) {
        super(circlePointsGenerator);
        if (trianglePointsFabric == null) {
            throw new IllegalArgumentException("trianglePointsFabric is null");
        }
        setTrianglePointsFabric(trianglePointsFabric);
    }

    public void setTrianglePointsFabric(CorrectPointsFabricForBuildingShapes trianglePointsFabric) {
        this.trianglePointsFabric = trianglePointsFabric;
    }


    @Override
    protected CorrectPointsFabricForBuildingShapes getTrianglePointsFabric() {
        return this.trianglePointsFabric;
    }
}
