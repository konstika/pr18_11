public abstract class GeometryObject implements Comparable<GeometryObject> {

    double square;

    abstract void setScale(double scale);
    abstract double getSquare();

    @Override
    public int compareTo(GeometryObject o) {
        if (this.getSquare()>o.getSquare()){
            return 1;
        }
        else if (this.getSquare()<o.getSquare()){
            return -1;
        }
        return 0;
    }

}
