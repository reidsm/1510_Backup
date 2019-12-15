package q3;
import java.util.Scanner;
/**
 * <p>This program is designed to test the MIXCharacter and 
 * Message classes. It creates a message of MIXChars out of a 
 * user input string which triggers a packing process,
 * and then calls the Message classes' toString method
 * to decode the now encoded string of characters.</p>
 *
 * @author Scott Reid A01160090
 * @version 1.0
 */
public class TestMIXChar {

    /**
     * <p>The main method asks the user for input, creates a method
     * object with that input, prints out the long[] array (the)
     * encoded message, and then prints out the decoded string.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to convert");
        String input = scan.nextLine();
        Message m = new Message(input);
        System.out.println(m.toLongs());
        System.out.println(m);
    
        System.out.println("Question three was called and ran sucessfully.");
        scan.close();
    }
    
}
