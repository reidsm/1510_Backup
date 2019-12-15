package q4;

import q3.Address;
import q3.Student;

/**
 * <p>This is the driver method for the course class. It is designed to test
 * the course class.</p>
 *
 * @author Scott Reid A01160090
 * @version 1.0
 */
public class TestCourse {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.
     * It instantiates some address objects and student objects, along with a 
     * course object, and then enrolls the student objects in the course.
     * It then prints out the roll and the class average.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int highScore = 95;
        final int midScore = 85;
        final int lowScore = 75;
    
        Address school =
                new Address("3700 Willingdon Ave.", "Burnaby", 
                        "BC", "V5G 3H2");

        Address jHome =
                new Address("21 Jump Street", "Langley", 
                        "BC", "V3A 6K6");
        Student john = new Student("John", "Smith", jHome, 
                school, highScore, midScore, lowScore);

        Address mHome =
                new Address("123 Main Street", "North Pole", 
                        "NU", "H0H 0H0");
        Student marsha = new Student("Marsha", "Jones", mHome, 
                school, highScore, midScore, lowScore);

        Student scott = new Student("Scott", "Reid", jHome, 
                school, highScore, midScore, lowScore);
        Student paul = new Student("Paul", "Roni", jHome, 
                school, highScore, midScore, lowScore);
        Student chandler = new Student("Chandler", "Bing", jHome, 
                school, highScore, midScore, lowScore);
        Student cto = new Student("CTO", "Yu", jHome, 
                school, highScore, midScore, lowScore);
        Student palroni = new Student("Stef", "Warren", jHome, 
                school, highScore, midScore, lowScore);
    
        Course programming = new Course("Programming");
        programming.addStudent(john);
        programming.addStudent(marsha);
        programming.addStudent(scott);
        programming.addStudent(paul);
        programming.addStudent(chandler);

        System.out.println();

        programming.roll();

        System.out.println("The class average is: " + programming.average());
        System.out.println("Question four was called and ran sucessfully.");
    }

};
