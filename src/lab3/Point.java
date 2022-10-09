package lab3;

public record Point(Double x, Double y) {
    @Override
    public String toString() {
        return "(x = " + x + "; y = " + y + ")";
    }
}
