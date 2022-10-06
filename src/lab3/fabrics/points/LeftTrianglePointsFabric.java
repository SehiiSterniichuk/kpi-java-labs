package lab3.fabrics.points;

public class LeftTrianglePointsFabric extends SideTrianglePointsFabric{
    public LeftTrianglePointsFabric(int diffMin, int diffMax, int maxAbsoluteValueForStartPoint) {
        super(diffMin, diffMax, maxAbsoluteValueForStartPoint);
    }

    @Override
    protected int getRandomDiff(){
        return -rand.nextInt(getDiffMax() - getDiffMin() + 1) + getDiffMin();
    }
}
