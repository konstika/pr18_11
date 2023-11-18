public class Circle extends GeometryObject{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    void setScale(double scale) {
        this.r*=scale;
    }

    @Override
    double getSquare() {
        this.square = Math.PI*Math.pow(r,2);
        return square;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", square=" + square +
                '}';
    }
}
