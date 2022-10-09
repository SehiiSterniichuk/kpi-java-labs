package lab3.shapes.circles;

import lab3.Color;
import lab3.Point;

import java.util.List;

public class BlackCircle extends Circle{

    public BlackCircle(List<Point> vertices) {  //centre, point on circle
        super(Color.BLACK, vertices);
    }
}
