public class Rectangle extends GeometryObject{
    int a,b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void setScale(double scale) {
        this.a*=scale;
        this.b*=scale;
    }

    @Override
    double getSquare() {
        this.square = a*b;
        return square;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", square=" + square +
                '}';
    }
}
