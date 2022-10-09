package lab3.fabrics;

import lab3.fabrics.points.CorrectPointsFabricForBuildingShapes;

import java.util.List;

public abstract class RandomBaseFactory extends BaseFactory {

    private List<CorrectPointsFabricForBuildingShapes> listOfTrianglePointsFabrics;

    public RandomBaseFactory(List<CorrectPointsFabricForBuildingShapes> listOfTrianglePointsFabrics, CorrectPointsFabricForBuildingShapes circlePointsGenerator) {
        super(circlePointsGenerator);
        if (!checkTrianglePointsFabrics(listOfTrianglePointsFabrics)) {
            throw new IllegalArgumentException("listOfTrianglePointsFabrics list is wrong");
        }
        setListOfTrianglePointsFabrics(listOfTrianglePointsFabrics);
    }

    @Override
    protected CorrectPointsFabricForBuildingShapes getTrianglePointsFabric() {
        int randIndex = rand.nextInt(listOfTrianglePointsFabrics.size());
        return listOfTrianglePointsFabrics.get(randIndex);
    }

    public boolean checkTrianglePointsFabrics(List<CorrectPointsFabricForBuildingShapes> listOfTrianglePointsFabrics) {
        return listOfTrianglePointsFabrics != null && listOfTrianglePointsFabrics.size() >= 2;
    }

    public void setListOfTrianglePointsFabrics(List<CorrectPointsFabricForBuildingShapes> listOfTrianglePointsFabrics) {
        this.listOfTrianglePointsFabrics = listOfTrianglePointsFabrics;
    }
}
