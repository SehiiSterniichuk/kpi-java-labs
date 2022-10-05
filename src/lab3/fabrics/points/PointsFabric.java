package lab3.fabrics.points;

import lab3.Point;

import java.util.ArrayList;

public class PointsFabric {
    private final RandomPointGenerator pointGenerator;

    public PointsFabric(int num) {
        pointGenerator = new RandomPointGenerator(num);
    }

    public ArrayList<Point> getPoints(int num){
        ArrayList<Point> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++){
            list.add(pointGenerator.getPoint());
        }
        return list;
    }
}
