import java.util.*;

public class Test {

    public static int[] nums = {1,2,3};
    public static List<Integer> myList = new ArrayList<>();


    public static void main(String[] args) {
        listAdjuster(myList);
    }
    private static void listAdjuster(List<Integer> listFella){
        while (listFella.size() < 10){
            listFella.add(retRand());
        }

        for (Integer integer : listFella) {
//            System.out.println(integer);
        }
        System.out.println(Math.round(Math.random()*100));

    }
    private static int retRand(){

        return (int) (Math.random()*100);
    }

    private static void prInt(int num){
        System.out.println(num + " is your number");

    }
}
