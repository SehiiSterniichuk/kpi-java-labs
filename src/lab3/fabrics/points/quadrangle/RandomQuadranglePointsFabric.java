package lab3.fabrics.points.quadrangle;

import lab3.Point;
import lab3.fabrics.points.RandomListOfPointsFabric;
import lab3.shapes.quadrangles.Quadrangle;

import java.util.List;

public class RandomQuadranglePointsFabric implements QuadranglePointsFabric {
    private final RandomListOfPointsFabric fabric;

    public RandomQuadranglePointsFabric(int maxAbsoluteValue) {
        fabric = new RandomListOfPointsFabric(maxAbsoluteValue);
    }

    @Override
    public List<Point> getPoints() {
        List<Point> points;
        do {
            points = fabric.getPoints(4);
        } while (!Quadrangle.checkQuadrangleVertices(points));
        return points;
    }
}
