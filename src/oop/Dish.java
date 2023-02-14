package oop;

public class Dish {
    int costInCents;
    String nameOfDish;
    boolean wouldRecommend;

    public void printSummary(){
        float priceFormat = costInCents/100F;
        if(wouldRecommend)
            System.out.printf("The %s cost $%.2f and is recommended", nameOfDish, priceFormat);
        else
            System.out.printf("The %s cost $%.2f and is not recommended", nameOfDish, priceFormat);
    }
}
