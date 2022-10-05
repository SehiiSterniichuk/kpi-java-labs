package lab3.fabrics.points;

import lab3.Point;

import java.util.Random;

public record RandomPointGenerator(int maxAbsoluteValue) {
    private static final Random rand = new Random();

    public Point getPoint() {
        int x = rand.nextInt() % maxAbsoluteValue;
        int y = rand.nextInt() % maxAbsoluteValue;
        return new Point(x + rand.nextDouble(), y + rand.nextDouble());
    }
}
