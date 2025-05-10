public final class Triangle extends Figure {
    private final double base;
    private final double height;

    Triangle(double x, double y, double base, double height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase : " + base + "\nHeight : " + height;
    }
}
