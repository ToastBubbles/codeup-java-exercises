public class Product {
    /* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, find average price that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */
    private String name;
    private int priceInCents;

    public Product(String name, int price){
        this.name = name;
        this.priceInCents = price;
    }
    public static int findAveragePrice(Product[] products){
        int total = 0;

        for(Product prod : products){
            total += prod.priceInCents;
        }
        return total/products.length;
    }

    public static void main(String[] args) {
        Product p1 = new Product("prod1",500);
        Product p2 = new Product("prod2",450);
        Product p3 = new Product("prod3",670);
        Product p4 = new Product("prod4",200);
        Product p5 = new Product("prod5",530);
        Product[] prods = {p1,p2,p3,p4,p5};
        System.out.println(findAveragePrice(prods));



    }
}
