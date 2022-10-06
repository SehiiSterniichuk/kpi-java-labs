package lab3.fabrics;

import lab3.fabrics.points.CorrectPointsFabricForBuildingShapes;

import java.util.List;

public abstract class RandomBaseFactory extends BaseFactory{

    private List<CorrectPointsFabricForBuildingShapes> trianglePointsFabrics;

    public RandomBaseFactory(List<CorrectPointsFabricForBuildingShapes> trianglePointsFabrics, CorrectPointsFabricForBuildingShapes circlePointsGenerator) {
        super(circlePointsGenerator);
        this.trianglePointsFabrics = trianglePointsFabrics;
    }
    @Override
    protected CorrectPointsFabricForBuildingShapes getTrianglePointsFabric() {
        int randIndex = rand.nextInt(trianglePointsFabrics.size());
        return trianglePointsFabrics.get(randIndex);
    }
}
