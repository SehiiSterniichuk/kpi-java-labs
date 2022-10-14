package lab3.fabrics.points.quadrangle;

import lab3.Point;
import lab3.fabrics.points.RandomPointGenerator;

import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

public class RectanglePointsFabric implements QuadranglePointsFabric {
    private static final Random rand = new Random();
    private int diffMax;
    private int diffMin;
    private final RandomPointGenerator pointGenerator;

    public RectanglePointsFabric(int diffMin, int diffMax, int maxAbsoluteValueForStartPoint) {
        if (!checkDiff(diffMax, diffMin)) {
            throw new IllegalArgumentException("False range");
        }
        setDiff(diffMax, diffMin);
        pointGenerator = new RandomPointGenerator(abs(maxAbsoluteValueForStartPoint));
    }

    @Override
    public List<Point> getPoints() {
        int randomDiff = getRandomDiff();
        Point randPoint = pointGenerator.getPoint();

        return List.of(randPoint,
                new Point(randPoint.x(), randPoint.y() + randomDiff),
                new Point(randPoint.x() + randomDiff, randPoint.y() + randomDiff),
                new Point(randPoint.x() + randomDiff, randPoint.y()));
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

    private int getRandomDiff() {
        return rand.nextInt(getDiffMax() - getDiffMin() + 1) + getDiffMin();
    }
}
