package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    /**
     * protected properties for length and width.
     * a constructor that accepts two numbers for the length and width and sets those properties.
     * methods for getting the length and width.
     * abstract methods for setting the length and width.
     */
    protected double length;
    protected double width;
    public Quadrilateral(){

    }

    public Quadrilateral (double l, double w){
        this.length = l;
        this.width = w;
    }


    public double getLength() {
        return this.length;
    }


    public double getWidth() {
        return this.width;
    }
    abstract void setLength(double length);
    abstract void setWidth(double width);
}
