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
        fizzBuzz();
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

}
