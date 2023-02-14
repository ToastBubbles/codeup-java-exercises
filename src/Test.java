import java.util.*;


public class Test {
    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
//  a greeting message to the user by either their first or first and last name.

// example: sayName("Justin") - "Hi Justin"
// example: sayName("Justin", "Reich") - "Hi Justin Reich"


// TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int[] nums = {1,2,3};
    public static List<Integer> myList = new ArrayList<>();


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String userResp = sc.nextLine();
//        sayHello(userResp);
//        sayHello("Justin");
//        sayHello("Justin", "Reich");
//        listAdjuster(myList);
//        Bob.main();




//        public class TernaryTester {
//     public static void main(String[] args) {
        int x = 5 * 4 % 3;
        System.out.println(x);
//        int t = "s";
        String tester = "tttt";
        tester = tester + x;
        System.out.println(tester);
//                    }
// }
    }
    public static void sayHello(String first){
        System.out.printf("hello %s", first);
    }
    public static void sayHello(String first, String last){
        System.out.printf("hello! %s %s", first, last);
    }
    private static void listAdjuster(List<Integer> listFella){
        while (listFella.size() < 10){
            listFella.add(retRand());
        }

        for (Integer integer : listFella) {
//            System.out.println(integer);
        }
        System.out.println(Math.round(Math.random()*100));

    }
    private static int retRand(){

        return (int) (Math.random()*100);
    }

    private static void prInt(int num){
        System.out.println(num + " is your number");

    }
}
