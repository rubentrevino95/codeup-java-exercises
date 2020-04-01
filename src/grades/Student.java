package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList <Integer> grades;

//  CONSTRUCTOR
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

//  METHODS
    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum/grades.size();
    }
//  MAIN
    public static void main(String[] args) {
        Student student1 = new Student("Ruben");
        student1.addGrade(100);
        student1.addGrade(100);
        student1.addGrade(95);
        student1.addGrade(100);
        System.out.println(student1.getGradeAverage());
    }
}
