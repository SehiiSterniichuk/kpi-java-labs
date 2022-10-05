package lab3.fabrics.points;

import lab3.Point;

import java.util.List;

public class CirclePointsFabric implements PointsFabric{

    private final RandomPointGenerator pointGenerator;

    public CirclePointsFabric(int maxAbsoluteValueForStartPoint) {
        pointGenerator = new RandomPointGenerator(maxAbsoluteValueForStartPoint);
    }

    @Override
    public List<Point> getPoints() {
        Point centre, pointOnCircle;
        centre = pointGenerator.getPoint();
        do {
            pointOnCircle = pointGenerator.getPoint();
        } while (pointOnCircle.equals(centre));
        return List.of(centre, pointOnCircle);
    }
}
