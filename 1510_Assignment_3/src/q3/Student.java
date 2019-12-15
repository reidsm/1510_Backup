package q3;
import java.text.DecimalFormat;
/**
 * <p>This is a class definition for Student objects. Students
 * have a first name, last name, and contain Address objects. They
 * also have three doubles representing three test scores.</p>
 *
 * @author Scott Reid A01160090
 * @version 1.0
 */
public class Student {
     /**
      * This constant represents the highest score possible 
      * on a test.
      */
     public static final int MAX_SCORE = 100;
     /**
      * This constant represents the total number
      * of tests the student class keeps track of.
      */
     public static final int NUM_TESTS = 3;
     /**
     * This String represents the student's first name.  
     */
     private String firstName;
     /**
      * This String represents the last name of the student.
      */
     private String lastName;
     /**
      * This Address represents the student's home address.
      */
     private Address homeAddress;
     /**
      * This Address represents the student's school address.
      */
     private Address schoolAddress;
     /**
      * This double represents the student's first test score.
      */
     private double testOne;
     /**
      * This double represents the student's second test score.
      */
     private double testTwo;
     /**
      * This double represents the student's third test score.
      */
     private double testThree;

     /**
     * <p>This is the student constructor which accepts a value for all
     * instance variables. It throws illegal argument exceptions
     * when the test score is not between 0 and 100.</p>
     *
     * @param firstName is a String that represents the student's first name. 
     * @param lastName is a String that represents the student's last name.
     * @param homeAddress is an Address that represents the students address. 
     * @param schoolAddress is an Address for the school.
     * @param testOne is a double representing the student's first test score.
     * @param testTwo is a double representing the student's second test score.
     * @param testThree is a double representing the student's third test score.
     */
     public Student(String firstName, String lastName, Address homeAddress, 
             Address schoolAddress, double testOne, 
             double testTwo, double testThree) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.homeAddress = homeAddress;
         this.schoolAddress = schoolAddress;
         
         if (testOne >= 0 && testOne <= MAX_SCORE) {
             this.testOne = testOne;
         } else {
             throw new IllegalArgumentException("The score must be between"
                     + " '0' and '100'");
         }
         
         if (testTwo >= 0 && testTwo <= MAX_SCORE) {
             this.testTwo = testTwo;
         } else {
             throw new IllegalArgumentException("The score must be between "
                     + "'0' and '100'");
         }
         
         if (testThree >= 0 && testThree <= MAX_SCORE) {
             this.testThree = testThree;
         } else {
             throw new IllegalArgumentException("The score must be between "
                     + "'0' and '100'");
         }
      }
     /**
     * <p>This overloaded constructor does not accept parameters for 
     * the test scores.</p>
     *
     * @param firstName is a String representing the student's first name.
     * @param lastName is a String representing the student's last name.
     * @param homeAddress is an Address that represents the students 
     * home address. 
     * @param schoolAddress is an Address that represents the 
     * student's school address.
     */
     public Student(String firstName, String lastName, 
             Address homeAddress, Address schoolAddress) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.homeAddress = homeAddress;
         this.schoolAddress = schoolAddress;
         this.testOne = 0;
         this.testTwo = 0;
         this.testThree = 0;
     }
     /**
     * <p>This zero parameter overloaded constructor initializes 
     * the name to John Doe, the addresses to a fake address, 
     * and the test scores
     * to 0.</p>
     */
     public Student() {
         this.firstName = "John";
         this.lastName = "Doe";
         this.homeAddress = new Address("1111 Main Street", 
                 "Vancouver", 
             "CA", "V1V 1A1");
         this.schoolAddress = new Address("2222 Main Street", 
                 "Vancouver", 
             "CA", "V2V 2A2");
         this.testOne = 0;
         this.testTwo = 0;
         this.testThree = 0;
        }
     /**
     * <p>This is a mutator which changes the value of one of the test
     * scores.</p>
     *
     * @param testNum is an int representing the test number 
     * to have its score changed.
     * @param testScore is a double value representing the test score.
     */
     public void setTestScore(int testNum, double testScore) {
         final int three = 3;
         if (testScore >= 0 && testScore <= MAX_SCORE) {
             if (testNum == 1) {
                 this.testOne = testScore;
             } else if (testNum == 2) {
                 this.testTwo = testScore;
             } else if (testNum == three) {
                 this.testThree = testScore;
             } else {
                 throw new IllegalArgumentException("The test number must be " 
                     + "'1', '2', or '3'");
             }
        } else {
             throw new IllegalArgumentException("The score must be between '0' "
                + "and '100'");
        }
    }
     /**
     * <p>The average method calculates the average of 
     * all three test scores.</p>
     *
     * @return a double that is the average test score of this student.
     */
    public double average() {
        return ((this.testOne + this.testTwo + this.testThree) / NUM_TESTS);
    }
    /**
     * <p>This is an accessor for the first and last name fields.</p>
     *
     * @return a String that represents the student's full name.
     */
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * <p>This is a standard toString method that prints out all of the
     * student's instance variables as one string.</p>
     *
     * @return a String describing the state of this Student object.
     */
    public String toString() {
        DecimalFormat fmt = new DecimalFormat("##.####");

        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress;
        result += "\nThe test one score is " + this.testOne;
        result += "\nThe test two score is " + this.testTwo;
        result += "\nThe test three score is " + this.testThree;
        result += "\nThe test average for " + this.firstName + " is " 
            + fmt.format(average());
        
        return result;
        }

}
