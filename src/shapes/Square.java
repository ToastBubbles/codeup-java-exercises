package shapes;

public class Square extends Rectangle{
    double side;
    public Square(double side){
        this.side = side;
//        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }
//    perimeter = 4 x side
//    area = side ^ 2


    @Override
    public double getArea() {
        return Math.pow(side,2);
    }
}
