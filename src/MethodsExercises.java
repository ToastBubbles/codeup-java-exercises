import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many sides");
        int userInp = sc.nextInt();
        System.out.println("enter amount of dice");
        int userdice = sc.nextInt();

        sc.nextLine();
//        facotorial(userInp);
//        Dice(userInp);
        RollDice(userInp,userdice);

//        getInteger(1,10,userInp);
//    Addition(10,5);
//    Subtraction(10,5);
//    Division(10,5);
//    Multiplication(10,5);
    }
    public static void RollDice(int sides, int diceCount){
        int i = 1;
        System.out.print("You rolled a ");
        while (i <= diceCount){
            Dice(sides);
            if(i < diceCount){
                System.out.print(" and a ");
            }
            i++;
        }
    }
    public static int Dice(int sides){
        int number = (int)(Math.random()*sides+ 1);
        System.out.print(number);
        return number;
    }
    public static void facotorial(int val){
        int i = 1;
        double total = i;
        List<Integer> facts = new ArrayList<>();
        System.out.print("ur factorial is ");
        while (i <= val){
//            if (val%i==0){
//                facts.add(i);
//            }
            total *= i;

            if(i == val){
                System.out.println(i);
            }else {
                System.out.printf("%d x ", i);
            }
            facts.add(i);
            i++;
        }
//        while (i <= val){
//            if (val%i==0){
//                facts.add(i);
//            }
//            i++;
//        }

        System.out.println(total);
    }


    public static void getInteger(int min, int max, int userVal){


        if(userVal >= min && userVal <= max){
            System.out.println("number looks good, it is:");
            System.out.println(userVal);
//            return userVal;
        }else {
            System.out.printf("please enter a number between %d and %d", min,max);
//            getInteger(min, max);
//            return 0;
        }
    }
    public static void Addition(int x, int y){
        System.out.println(x + y);
    }
    public static void Subtraction(int x, int y){
        System.out.println(x - y);
    }
    public static void Division(int x, int y){
        System.out.println(x / y);
    }
    public static void Multiplication(int x, int y){
        System.out.println(x * y);
    }
}
