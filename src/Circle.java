public final class Circle extends Figure {
    private final double radius;

    Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + radius;
    }
}
