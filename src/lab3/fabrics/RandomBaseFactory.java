package lab3.fabrics;

import lab3.fabrics.points.CorrectPointsFabricForBuildingShapes;

import java.util.List;

public abstract class RandomBaseFactory extends BaseFactory{

    private List<CorrectPointsFabricForBuildingShapes> trianglePointsFabrics;

    public RandomBaseFactory(List<CorrectPointsFabricForBuildingShapes> trianglePointsFabrics, CorrectPointsFabricForBuildingShapes circlePointsGenerator) {
        super(circlePointsGenerator);
        if(!setTrianglePointsFabrics(trianglePointsFabrics)){
            throw new IllegalArgumentException("trianglePointsFabrics list is wrong");
        }
    }
    @Override
    protected CorrectPointsFabricForBuildingShapes getTrianglePointsFabric() {
        int randIndex = rand.nextInt(trianglePointsFabrics.size());
        return trianglePointsFabrics.get(randIndex);
    }

    public boolean setTrianglePointsFabrics(List<CorrectPointsFabricForBuildingShapes> trianglePointsFabrics) {
        if(trianglePointsFabrics == null){
            return false;
        }
        while(trianglePointsFabrics.remove(null));
        if(trianglePointsFabrics.size() < 2){
            return false;
        }
        this.trianglePointsFabrics = trianglePointsFabrics;
        return true;
    }
}
