package shapes;

public class Square extends Quadrilateral{
//    double side;
//    public Square(double side){
//        this.side = side;
////        this.width = side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return side*4;
//    }
////    perimeter = 4 x side
////    area = side ^ 2
//
//
//    @Override
//    public double getArea() {
//        return Math.pow(side,2);
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
        this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
}
