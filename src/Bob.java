import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean chatting = true;
        System.out.println("bob");
        while (chatting){
            String userInp = sc.nextLine();
            if(userInp.endsWith("?")){
                System.out.println("sure");
            }else if(userInp.endsWith("!")){
                System.out.println("!!!");
            } else if (userInp.equals("")) {
                System.out.println("ok");
            } else if(userInp.equals("bye")) {
                System.out.println("cya");

                chatting = false;
            }else{
                System.out.println("whatever");
            }
        }

    }
}
