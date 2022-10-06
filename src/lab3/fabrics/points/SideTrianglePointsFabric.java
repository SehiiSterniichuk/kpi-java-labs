package lab3.fabrics.points;

import lab3.Point;

import java.util.List;

public abstract class SideTrianglePointsFabric extends CorrectPointsFabricForBuildingShapes {

    private int diffMax;
    private int diffMin;

    private final RandomPointGenerator pointGenerator;

    public SideTrianglePointsFabric(int diffMin, int diffMax, int maxAbsoluteValueForStartPoint) {
        this.diffMax = diffMax;
        this.diffMin = diffMin;
        pointGenerator = new RandomPointGenerator(maxAbsoluteValueForStartPoint);
    }

    @Override
    public List<Point> getPoints() {
        Point randPoint1, randPoint2, randPoint3;
        randPoint1 = pointGenerator.getPoint();
        int randomDiff = getRandomDiff();
        randPoint2 = new Point(randPoint1.x(), randPoint1.y() + randomDiff);
        randPoint3 = new Point(randPoint1.x() + randomDiff, randPoint1.y() + randomDiff);
        return List.of(randPoint1, randPoint2, randPoint3);
    }

    public int getDiffMax() {
        return diffMax;
    }

    public int getDiffMin() {
        return diffMin;
    }


    protected abstract int getRandomDiff();
}
