package oop;

public class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public void printSummary(){
        float priceFormat = costInCents/100F;
        if(wouldRecommend)
            System.out.printf("The %s cost $%.2f and is recommended%n", nameOfDish, priceFormat);
        else
            System.out.printf("The %s cost $%.2f and is not recommended%n", nameOfDish, priceFormat);
    }


    public String getNameOfDish(){
        return nameOfDish;
    }
    public int getCostInCents(){
        return costInCents;
    }
    public boolean getWouldRecommend(){
        return wouldRecommend;
    }

    public void setCostInCents(int cost){
        costInCents = cost;
    }
    public void setNameOfDish(String name){
        nameOfDish = name;

    }
    public void setWouldRecommend(boolean recommend){
        wouldRecommend = recommend;
    }
}
