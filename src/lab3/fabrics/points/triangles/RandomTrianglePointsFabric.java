package lab3.fabrics.points.triangles;

import lab3.Point;
import lab3.fabrics.points.RandomListOfPointsFabric;
import lab3.shapes.triangles.Triangle;

import java.util.List;

public class RandomTrianglePointsFabric implements TrianglePointsFabric {

    private final RandomListOfPointsFabric fabric;

    public RandomTrianglePointsFabric(int maxAbsoluteValue) {
        fabric = new RandomListOfPointsFabric(maxAbsoluteValue);
    }

    @Override
    public List<Point> getPoints() {
        List<Point> points;
        do {
            points = fabric.getPoints(3);
        } while (!Triangle.checkTriangleVertices(points));
        return points;
    }
}
