public final class Rectangle extends Figure{
    private final double width;
    private final double length;

    Rectangle(double x,  double y, double width, double length) {
        super(x, y);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area(){
        return width * length;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nLength: " + length;
    }
}
