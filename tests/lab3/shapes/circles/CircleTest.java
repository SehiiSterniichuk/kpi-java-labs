package lab3.shapes.circles;

import lab3.Point;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void checkVertices() {
        Point p1;
        p1 = new Point(0., 0.);
        List<Point> wrongList = List.of(p1, p1);
        assertThrows(Exception.class, () -> new BlackCircle(wrongList));
        List<Point> notFullList = List.of(p1);
        assertThrows(Exception.class, () -> new BlackCircle(notFullList));
    }
}