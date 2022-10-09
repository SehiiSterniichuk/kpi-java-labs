package lab3.fabrics.points;

import lab3.Point;

import java.util.List;
import java.util.Random;

public abstract class CorrectPointsFabricForBuildingShapes {
    static protected final Random rand = new Random();

    abstract public List<Point> getPoints();
}
