package lab3.shapes.triangles;

import lab3.Point;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void checkVertices() {
        Point p1, p2, p3;
        p1 = new Point(0., 0.);
        p2 = new Point(1., 0.);
        p3 = new Point(3., 0.);
        List<Point> wrongList = List.of(p1, p2, p3);
        assertFalse(Triangle.checkTriangleVertices(wrongList));
        List<Point> notFullList = List.of(p1, p2);
        assertFalse(Triangle.checkTriangleVertices(notFullList));
    }
}