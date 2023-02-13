import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInp = sc.nextInt();
        sc.nextLine();
        getInteger(1,10,userInp);
//    Addition(10,5);
//    Subtraction(10,5);
//    Division(10,5);
//    Multiplication(10,5);
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
