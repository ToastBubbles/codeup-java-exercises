import java.util.*;

public class ControlFlowExercises {
    /**
     * While
     *
     * Create an integer variable i with a value of 5.
     * Create a while loop that runs so long as i is less than or equal to 15
     * Each loop iteration, output the current value of i, then increment i by one.
     * Your output should look like this:
     *
     * 5 6 7 8 9 10 11 12 13 14 15
     *
     * Do While
     *
     * Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
     * Alter your loop to count backwards by 5's from 100 to -10.
     * Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
     *
     *  2
     *  4
     *  16
     *  256
     *  65536
     * For
     *
     * Refactor the previous two exercises to use a for loop instead.
     * @param args
     */
    public static void main(String[] args) {
        tableGen();
    }
    private static void whileLoop(){
        int i = 5;
        while (i <= 15){
            System.out.println(i);
            i++;
        }
    }
    private static void doWhileLoop(){
        double i = 2;
//        do {
//            System.out.println(i);
//            i+=2;
//        }while(i < 100);
        do {
            System.out.printf("%.0f%n",i);
            i = Math.pow(i, 2);
        }while(i <= 1000000);
    }
    private static void forLoop(){

        for(double i = 2; i<=1000000; i = Math.pow(i, 2)){

            System.out.printf("%.0f%n",i);
            ;}

    }

    /**
     * Write a program that prints the numbers from 1 to 100.
     * For multiples of three: print “Fizz” instead of the number.
     * For the multiples of five: print “Buzz”.
     * For numbers which are multiples of both three and five: print “FizzBuzz”.
     */
    private static void fizzBuzz(){
        int i = 1;
        while (i <=100){
            String output = "";
            if(i % 3 == 0){
                output = output.concat("fizz");
            }
            if(i % 5 == 0){
                output = output.concat("buzz");
            }
            if(output.length() > 0){
                System.out.println(output);
            }else{
                System.out.println(i);
            }
            i++;
        }
    }

    /**
     * Prompt the user to enter an integer.
     * Display a table of squares and cubes from 1 to the value entered.
     * Ask if the user wants to continue.
     * Assume that the user will enter valid data.
     * Only continue if the user agrees to.
     * number | squared | cubed
     * ------ | ------- | -----
     * 1      | 1       | 1
     * 2      | 4       | 8
     * 3      | 9       | 27
     * 4      | 16      | 64
     * 5      | 25      | 125
     */
    private static void tableGen(){

        System.out.println("Multiplication table");
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to go to? ");
        int userInt = sc.nextInt();
        sc.nextLine();
        askUser(sc,1, 1, userInt);

    }
    private static void askUser(Scanner sc, int number, int iteration, int userInt){
        System.out.printf(" %-7s| %-7s| %-7s%n", "number","squared","cubed");
        System.out.printf(" -------|--------|--------%n");
        while (number <= userInt * iteration){
            int square = (int) Math.pow(number,2);
            int cube = (int) Math.pow(number,3);
            System.out.printf(" %-7s| %-7s| %-7s%n", number,square,cube);
            number++;
        }

        System.out.println("Continue?");
        String userResp = sc.nextLine();

        if(userResp.equals("y")){
            System.out.println(number);
            askUser(sc, number, iteration+1, userInt);
        }
    }
//    private static void printTableLine(int i, int s, int c){
//
//        System.out.printf(" %-7s| %-7s| %-7s%n", i,s,c);
//    }


    /**
     *
     */
    private static void printGrade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade");
        int userResp = sc.nextInt();
        sc.nextLine();
        if(inRange(userResp, 88,100)){
            System.out.println("you got an A");
        }else if(inRange(userResp, 80,87)){
            System.out.println("you got an B");
        }
        else if(inRange(userResp, 67,79)){
            System.out.println("you got an C");
        }else if(inRange(userResp, 60,66)){
            System.out.println("you got an D");
        }
        else if(inRange(userResp, 0,59)){
            System.out.println("you got an F");
        }

//        System.out.println(userResp);
    }
    private static boolean inRange(int num, int low, int high){
        return low <= num && num <= high;
    }


}
