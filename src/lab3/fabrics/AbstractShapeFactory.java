package lab3.fabrics;

import lab3.Color;

public class AbstractShapeFactory {
    public static BaseFactory getFactory(Color color) {
        return switch (color) {
            case BLACK  -> new BlackFactory();
            case WHITE  -> new WhiteFactory();
            case PURPLE -> new PurpleFactory();
        };
    }
}
