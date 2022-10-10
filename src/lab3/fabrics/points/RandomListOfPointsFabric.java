package lab3.fabrics.points;

import lab3.Point;

import java.util.ArrayList;
import java.util.List;

public class RandomListOfPointsFabric {
    private final RandomPointGenerator pointGenerator;

    public RandomListOfPointsFabric(int maxAbsoluteValue) {
        pointGenerator = new RandomPointGenerator(maxAbsoluteValue);
    }

    public List<Point> getPoints(int num) {
        ArrayList<Point> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            list.add(pointGenerator.getPoint());
        }
        return list;
    }
}
