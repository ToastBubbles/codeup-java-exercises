package shapes;

public class Rectangle extends Quadrilateral{
//    protected double width;
//    protected double length;
//    public Rectangle(){
//        this.length = 0;
//        this.width = 0;
//    }
//
//    public Rectangle(double w, double l){
//        this.length = l;
//        this.width = w;
//    }
//
//    public double getArea(){
//    return this.width * this.length;
//    }
//    public double getPerimeter(){
//        return (2*this.length)+(2*this.width);
//    }


    @Override
    public double getPerimeter() {
        return this.length *2 + this.width*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }
}
