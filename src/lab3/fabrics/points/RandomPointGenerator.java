package lab3.fabrics.points;

import lab3.Point;

import java.util.Random;

public class RandomPointGenerator {
    private static final Random rand = new Random();

    private final int maxAbsoluteValue;

    public RandomPointGenerator(int maxAbsoluteValue) {
        this.maxAbsoluteValue = maxAbsoluteValue;
    }

    public Point getPoint(){
        int x = rand.nextInt() % maxAbsoluteValue;
        int y = rand.nextInt() % maxAbsoluteValue;
        return new Point(x + rand.nextDouble(),y + rand.nextDouble());
    }
}
