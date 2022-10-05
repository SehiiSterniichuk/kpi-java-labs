package lab3.fabrics.points;

import lab3.Point;

import java.util.List;

public class RightTrianglePointsFabric implements PointsFabric {

    private final int diff;

    private final RandomPointGenerator pointGenerator;

    public RightTrianglePointsFabric(int diff, int maxAbsoluteValueForStartPoint) {
        this.diff = diff;
        pointGenerator = new RandomPointGenerator(maxAbsoluteValueForStartPoint);
    }

    @Override
    public List<Point> getPoints() {
        Point randPoint1, randPoint2, randPoint3;
        randPoint1 = pointGenerator.getPoint();
        randPoint2 = new Point(randPoint1.x(), randPoint1.y() + diff);
        randPoint3 = new Point(randPoint1.x() + diff, randPoint1.y() + diff);
        return List.of(randPoint1, randPoint2, randPoint3);
    }

}
