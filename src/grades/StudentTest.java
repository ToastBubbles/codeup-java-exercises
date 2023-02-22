package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("jakobie");
        s1.addGrade(30);
        s1.addGrade(40);
//        s1.addGrade(99);
        System.out.println(s1.getGradeAverage());
    }
}
