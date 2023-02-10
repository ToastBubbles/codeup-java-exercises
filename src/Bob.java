import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bob");
        String userInp = sc.nextLine();
        if(userInp.endsWith("?")){
            System.out.println("sure");
        }else if(userInp.endsWith("!")){
            System.out.println("!!!");
        } else if (userInp.equals("")) {
            System.out.println("ok");

        } else {
            System.out.println("whatever");
        }
    }
}
