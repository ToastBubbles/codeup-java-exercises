package grades;
import java.util.*;

public class GradesApplication {
    static HashMap<String, Student> students = new HashMap<>();

    public static final String RED_BOLD = "\033[1;31m";
    public static final String RESET = "\033[0m";

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Student s1 = new Student("jakobie");
        Student s2 = new Student("jakob");
        Student s3 = new Student("jake");
        Student s4 = new Student("jakie");
        setGrades(s1);
        setGrades(s2);
        setGrades(s3);
        setGrades(s4);
        students.put("gamerBoi", s1);
        students.put("gamerBoi1", s2);
        students.put("jake1994", s3);
        students.put("jokobIsANoob", s4);
//        System.out.println(students.toString());
        runApp();


    }

    private static void runApp(){
        boolean running = true;
        System.out.println("App started...");

        while (running) {
            System.out.printf("%s%s%s%n",RED_BOLD,"Select a student...",RESET);
            students.forEach((key, value) -> System.out.printf("%s%n",key));
            String ui = sc.nextLine();
            if (students.containsKey(ui)) {
//            System.out.print(ui);
                printSpecific(students.get(ui));
                System.out.printf("%s%s%s%n",RED_BOLD,"Continue..? (Y/N)",RESET);
                ui = sc.nextLine();
                if(ui.equals("no") || ui.equalsIgnoreCase("n")){
                    running = false;
                }
            }else {
                System.out.printf("%s%s%s%n",RED_BOLD,"Enter a correct username...",RESET);
            }



//            sc.nextLine();
    }


    }
    private static void printSpecific(Student s){
        System.out.printf("%s has a grade average of %.2f%n",s.getName(),s.getGradeAverage());
    }
    private static void printAll(){
        students.forEach(
                (key, value)
                        -> System.out.printf("%s (%s) has an average of %.2f%n",key, value.getName(),value.getGradeAverage()));
    }
    private static void setGrades(Student s){
        int i = 0;
        while (i < 4) {
            s.addGrade(randgrade());
            i++;
        }
    }

    private static int randgrade(){
        return (int) (Math.random()*100);
    }
}
