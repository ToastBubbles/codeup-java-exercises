package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);
    public Input(){
//        System.out.println("start?");
//        String userInp = scanner.nextLine();
////        System.out.println(yesNo(userInp));
//        if(yesNo(userInp)){
//            int userInt = scanner.nextInt();
//            scanner.next();
//            if(getInt(userInt, 0, 10)){
//
//            }
//        }
//
    }
//
    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo(String input) {
        return input.equals("y") || input.equals("yes");
//        return false;
    }

    public boolean getInt(int input, int min, int max) {
        return input > min && input < max;
    }

    public int getInt() {
        int out = scanner.nextInt();
        scanner.nextLine();
        return out;
    }

    public boolean getDouble(double input, double min, double max) {
        return input > min && input < max;
    }

    public double getDouble() {
        double out = scanner.nextDouble();
        scanner.nextLine();
        return out;
    }
}