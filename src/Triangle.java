public class Triangle extends GeometryObject {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void setScale(double scale) {
        this.a *= scale;
        this.b *= scale;
        this.c *= scale;
    }

    @Override
    double getSquare() {
        double p =  (a + b + c) / (double)2;
        this.square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", square=" + square +
                '}';
    }
}
