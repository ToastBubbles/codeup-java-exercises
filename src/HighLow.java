import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number.
//        All user inputs are validated.
//                If user's guess is less than the number, it outputs "HIGHER".
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number, the game should declare "GOOD GUESS!"
        game(1000000);
    }
    public static void game(int max){
        int counts = 0;
        boolean isPLaying = true;
        int closestHigh = max;
        int closestLow = 0;
        System.out.printf("pick a noomber between 0 and %d%n", max);
        int rand = (int) (Math.random() * max);
        Scanner sc = new Scanner(System.in);

        while (isPLaying){
            counts++;
            int userInp = sc.nextInt();
            sc.nextLine();
            if(userInp > rand){
                System.out.println("target number is lower");
                if(userInp < closestHigh) closestHigh = userInp;
                System.out.printf("your number is between %d and %d %n", closestLow,closestHigh);
            }
            if(userInp < rand){
                System.out.println("target number is higher");
                if(userInp > closestLow) closestLow = userInp;

                System.out.printf("your number is between %d and %d %n", closestLow,closestHigh);
            }
            if(userInp == rand){
                System.out.printf("bingo, you got it with only %d guesses", counts);
                isPLaying = false;
            }
        }
    }
}
