package lab3.fabrics;

import lab3.Color;

public class AbstractShapeFactory {
    public static BaseFactory getFactory(Color color) {
        if (Color.BLACK == color) {
            return new BlackFactory();
        } else return new WhiteFactory();
    }
}
