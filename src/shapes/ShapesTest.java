package shapes;

public class ShapesTest {
    /**
     * create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
     * verify that the getPerimeter and getArea methods return 18 and 20, respectively.
     * create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
     * verify that the getPerimeter and getArea methods return 20 and 25, respectively.
     * @param args
     */
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getPerimeter());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
        Measurable myShape;// = new Square();
        Square sq = new Square();
        Rectangle rect = new Rectangle();
        sq.setWidth(4);
        rect.setWidth(3);
        rect.setLength(12);
        myShape = rect;
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


    }
}
