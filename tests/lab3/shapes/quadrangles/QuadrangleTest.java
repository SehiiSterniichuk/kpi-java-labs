package lab3.shapes.quadrangles;

import lab3.Point;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class QuadrangleTest {

    @Test
    public void checkVerticesNumber() {
        Point p1, p2, p3;
        p1 = new Point(0., 0.);
        p2 = new Point(1., 0.);
        p3 = new Point(3., 0.);
        List<Point> notFullList = List.of(p1, p2, p3);
        assertFalse(Quadrangle.checkQuadrangleVertices(notFullList));
    }

    @Test
    public void isCollinear1() {
        Point p1, p2, p3, p4;
        p1 = new Point(0., 0.);
        p2 = new Point(1., 0.);
        p3 = new Point(3., 0.);
        p4 = new Point(0., 1.);
        List<Point> wrongList = List.of(p1, p2, p3, p4);
        assertFalse(Quadrangle.checkQuadrangleVertices(wrongList));
    }

    @Test
    public void isCollinear2() {
        Point p1, p2, p3, p4;
        p1 = new Point(0., 0.);
        p2 = new Point(1., 0.);
        p3 = new Point(3., 1.);
        p4 = new Point(3., 0.);
        List<Point> wrongList = List.of(p1, p2, p3, p4);
        assertFalse(Quadrangle.checkQuadrangleVertices(wrongList));
    }

    @Test
    public void isCollinear3() {
        Point p1, p2, p3, p4;
        p1 = new Point(0., 0.);
        p2 = new Point(1., 1.);
        p3 = new Point(3., 0.);
        p4 = new Point(1., 0.);
        List<Point> wrongList = List.of(p1, p2, p3, p4);
        assertFalse(Quadrangle.checkQuadrangleVertices(wrongList));
    }

    @Test
    public void isCollinear4() {
        Point p1, p2, p3, p4;
        p1 = new Point(0., 1.);
        p2 = new Point(1., 0.);
        p3 = new Point(3., 0.);
        p4 = new Point(0., 0.);
        List<Point> wrongList = List.of(p1, p2, p3, p4);
        assertFalse(Quadrangle.checkQuadrangleVertices(wrongList));
    }
}