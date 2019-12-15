package q3;

/**
 * <p>This is a driver method for the Student class. It is designed to test
 * the methods of the student class.</p>
 *
 * @author Scott Reid A01160090
 * @version 1.0
 */
public class TestStudent {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.
     * It creates some Student objects and updates some test scores. </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int highScore = 95;
        final int midScore = 85;
        final int lowScore = 75;
        final int three = 3;
        final int highestScore = 98;
    
         Address school =
                 new Address("3700 Willingdon Ave.", "Burnaby", 
                         "BC", "V5G 3H2");

         Address jHome =
                 new Address("21 Jump Street", "Langley", 
                         "BC", "V3A 6K6");
         Student john = new Student("John", "Smith", jHome, school, 
                 highScore, midScore, lowScore);

         Address mHome =
                 new Address("123 Main Street", "North Pole", 
                         "NU", "H0H 0H0");
         Student marsha = new Student("Marsha", "Jones", mHome, 
                 school, highScore, midScore, lowScore);

         Student scott = new Student("Scott", "Reid", jHome, school, 
                 highScore, midScore, lowScore);
         Student paul = new Student("Paul", "Roni", jHome, school, 
                 highScore, midScore, lowScore);
         Student chandler = new Student("Chandler", "Bing", jHome, school, 
                 highScore, midScore, lowScore);
         Student cto = new Student("CTO", "Yu", jHome, school, 
                 highScore, midScore, lowScore);
         Student palroni = new Student("Stef", "Warren", jHome, school, 
                 highScore, midScore, lowScore);

         marsha.setTestScore(three, highestScore);

         System.out.println(john);
         System.out.println();
         System.out.println(marsha);
         System.out.println();
         System.out.println(scott);
         System.out.println();
         System.out.println(paul);
         System.out.println();
         System.out.println(chandler);

        System.out.println("Question three was called and ran sucessfully.");
    }

};
