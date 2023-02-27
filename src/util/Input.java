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

    /**
     * Your getInt and getDouble methods should make sure that the value returned from the method is actually an int or a double.
     * You can do this by replacing the use of the Scanner nextInt() and nextDouble() methods with the existing getString()
     * method you created in a previous exercise using the following methods to convert the returned String into the desired datatype:
     *
     * Integer.valueOf(String s);
     * Double.valueOf(String s);
     *
     * @return
     */
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
//        try {
//
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        String input = this.getString();
        int out;
        try {
            out = Integer.valueOf(input);
            return out;
        }
        catch (Exception e){
            System.out.println(e);
        }
//        return input;
//        int out = scanner.nextInt();
//        scanner.nextLine();
        return 0;

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