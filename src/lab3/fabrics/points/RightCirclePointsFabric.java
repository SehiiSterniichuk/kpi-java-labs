package lab3.fabrics.points;

import lab3.Point;

import java.util.List;

public class RightCirclePointsFabric implements PointsFabric{

    private final RandomPointGenerator pointGenerator;

    public RightCirclePointsFabric(int maxAbsoluteValueForStartPoint) {
        pointGenerator = new RandomPointGenerator(maxAbsoluteValueForStartPoint);
    }

    @Override
    public List<Point> getPoints() {
        Point centre, pointOnCircle;
        centre = pointGenerator.getPoint();
        pointOnCircle = pointGenerator.getPoint();
        return List.of(centre, pointOnCircle);
    }
}
