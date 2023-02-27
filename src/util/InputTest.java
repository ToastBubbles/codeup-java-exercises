package util;

public class InputTest {

    public static void main(String[] args) {
        Input in1 = new Input();
        if(in1.yesNo(in1.getString())){
            System.out.println("enter a num between 0 and 10...");
            int userNum = in1.getInt();
            while (!in1.getInt(userNum, 0,10)){
                System.out.println("ha, wrong");
                System.out.println("enter a num between 0 and 10...");
                userNum = Integer.valueOf(in1.getString());

            }
            System.out.println("enter a num with a decimal between 0 and 1...");
            /**
             * Integer.valueOf(String s);
             * Double.valueOf(String s);
             */
            double userDub = Double.valueOf(in1.getString());
            while (!in1.getDouble(userDub, 0,1)){
                System.out.println("ha, wrong");
                System.out.println("enter a num with a decimal between 0 and 1...");
                userDub = Double.valueOf(in1.getString());

            }
            System.out.println("gg");


        }else {
            System.out.println("goodbye");
        }
    }
}
