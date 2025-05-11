public final class Triangle extends Figure {
    private final double a;
    private final double b;
    private final double c;

    Triangle(double x, double y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double area() {
        // s = semiperimeter
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c)); // Heron's formula
    }

    @Override
    public String toString() {
        return String.format("%s\nA: %.2f\nB: %.2f\nC: %.2f", super.toString(), a, b, c);
    }
}
