package q4;

import java.util.ArrayList;
import q3.Student;
/**
 * <p>This program defines the course class. The course class
 * has a name, and contains a list of up to 5 students
 * who are enrolled in the course.</p>
 *
 * @author Scott Reid A01160090
 * @version 1.0
 */
public class Course {
     /**
     * This constant integer keeps track of the maximum number of 
     * students who can be enrolled in this course. 
     */
     public static final int MAX_STUDENTS = 5;
     /**
     * This ArrayList keeps track of the list of students enrolled 
     * in the course. 
     */
     private ArrayList<Student> studentList = new ArrayList<Student>();
     /**
     * This String represents the name of the course. 
     */
     private String courseName;

     /**
     * This int keeps track of the number of students actually
     * enrolled in the course.
     */
     private int numStudents;


     /**
     * <p>This is the constructor for the course method. It 
     * initializes the courseName to the name of the course 
     * passed into it.</p>
     *
     * @param courseName is a String that represents the name
     * of the course.
     */
    public Course(String courseName) {
        this.courseName = courseName;
    }
     /**
     * <p>The addStudent method enrolls a new student in this course.</p>
     *
     * @param student is a Student that is to be enrolled in the
     * course.
     */
    public void addStudent(Student student) {
        if (this.numStudents <= MAX_STUDENTS) {
            studentList.add(student);
            numStudents++;
        } else {
            throw new IllegalArgumentException("A max of " + MAX_STUDENTS 
                    + " are allowed in this course.");
        }
    }
     /**
     * <p>The average method calculates the aggregated average
     * of all students enrolled in this course.</p>
     *
     * @return a double representing the average grades of the 
     * students enrolled in this course.
     */
    public double average() {
        double studentAverage = 0;

        for (int i = 0; i < studentList.size(); i++) {
            studentAverage += studentList.get(i).average();
        }
        return studentAverage / studentList.size();
    }
     /**
     * <p>The roll method functions similarly to a toString method.
     * It prints out the student names that are enrolled in the course.</p>
     *
     */
    public void roll() {

        String roll = "The class roll is: ";

        for (int i = 0; i < studentList.size(); i++) {
            roll += studentList.get(i).getName() + ", ";
        }
        System.out.println(roll);
    }
}
