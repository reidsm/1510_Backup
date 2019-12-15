/*
 * This class represents a name.
 * 
 * @author Scott Reid
 * @version 1.0
 * */
public class Student {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String studentNumber;
    private double gradePoint;
    
    public Student(String firstName, String lastName, String dateOfBirth, String studentNumber, double gradePoint) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.studentNumber = studentNumber;
        this.gradePoint = Math.round(gradePoint * 100.0) / 100.0;
    }
    
    public String getFirstName() {
        return this.firstName = firstName;
    }
    
    public String getLastName() {
        return this.lastName = lastName;
    }
    
    public String getDateOfBirth() {
        return this.dateOfBirth = dateOfBirth;
    }
    
    public String getStudentNumber() {
        return this.studentNumber = studentNumber;
    }
    
    public double getGradePoint() {
        return this.gradePoint = gradePoint;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    public void setGradePoint(double gradePoint) {
        this.gradePoint = Math.round(gradePoint * 100.0) / 100.0;
    }
    
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.dateOfBirth + " " + this.studentNumber + " " + this.gradePoint;
    }
    
}
