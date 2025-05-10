public final class Rectangle extends Figure{
    private final double width;
    private final double length;

    Rectangle(double x,  double y) {
        super(x, y);
        this.width = x;
        this.length = y;
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
