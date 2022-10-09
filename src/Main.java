import lab3.Color;
import lab3.fabrics.AbstractShapeFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's generate random black shapes...");
        System.out.println(AbstractShapeFactory.getFactory(Color.BLACK).createTriangle());
        System.out.println(AbstractShapeFactory.getFactory(Color.BLACK).createCircle());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("\nNow let's generate random white shapes...");
        System.out.println(AbstractShapeFactory.getFactory(Color.WHITE).createTriangle());
        System.out.println(AbstractShapeFactory.getFactory(Color.WHITE).createCircle());
    }
}
