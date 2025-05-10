public sealed abstract class Figure permits Circle, Rectangle, Triangle {
    private final double x, y;

    Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract double area();

    @Override
    public String toString() {
        return String.format("%s (x = %.2f, y = %.2f) Area: %.2f", getClass().getSimpleName(), x, y, area());
    }
}
