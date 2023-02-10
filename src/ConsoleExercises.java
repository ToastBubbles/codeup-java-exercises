import java.util.Arrays;
import java.util.Scanner;

public class ConsoleExercises {


    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.\n", pi);


        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter an Interger.");
//        sc.next();
//        int userInt = sc.nextInt();
//        System.out.println(userInt);

//        String word1 = sc.nextLine();
//        String word2 = sc.nextLine();
//        String word3 = sc.nextLine();
//
//        System.out.println(word1 + "\n" + word2 + "\n" + word3);


        System.out.println("enter length of obj: ");
        double leng = Double.parseDouble(sc.nextLine());
        System.out.println("enter width: ");
        double wid = Double.parseDouble(sc.nextLine());
        System.out.println((leng+wid)*2);
        System.out.println((leng*wid));

    }
}
