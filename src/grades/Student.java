package grades;

import java.util.*;

public class Student {
    private String name;
//    private int grade;
    private List<Integer> grades;// = new ArrayList<>();

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }


    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double avg = 0;

        for(double grade : grades){
            avg += grade;
        }
        return avg/grades.size();
    }
}
