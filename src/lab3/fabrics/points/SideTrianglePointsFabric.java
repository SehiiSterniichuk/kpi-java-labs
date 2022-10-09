package lab3.fabrics.points;

import lab3.Point;

import java.util.List;

import static java.lang.Math.abs;

public abstract class SideTrianglePointsFabric extends CorrectPointsFabricForBuildingShapes {

    private int diffMax;
    private int diffMin;

    private final RandomPointGenerator pointGenerator;

    public SideTrianglePointsFabric(int diffMin, int diffMax, int maxAbsoluteValueForStartPoint) {
        if (!checkDiff(diffMax, diffMin)) {
            throw new IllegalArgumentException("False range");
        }
        setDiff(diffMax, diffMin);
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

    public static boolean checkDiff(int diffMax, int diffMin) {
        return diffMax > diffMin && diffMax == abs(diffMax) && diffMin == abs(diffMin);
    }

    public void setDiff(int diffMax, int diffMin) {
        this.diffMax = diffMax;
        this.diffMin = diffMin;
    }

    protected abstract int getRandomDiff();
}
