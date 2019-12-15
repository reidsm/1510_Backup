package q2;
import java.util.Scanner;
/**
 * This program takes in a number of seconds from the user, divides 
 * it into hours, minutes, and seconds, and then formats the output
 * as a time in HH:MM:SS.
 *
 * @author Scott Reid A01160090 Set D
 * @version 1.0
 */
public class SecondsConvert {
    
    /**
     * This is the main method. It prompts the user for
     * input (in seconds), then finds out how many hours can
     * fit in the number of seconds provided. Then,
     * it multiplies the number of hours by the
     * number of seconds in an hour and subtracts it
     * from the input to determine the remainder.
     * Then, it finds out how many minutes can fit in the
     * remaining seconds, and finds out how many seconds
     * are left by subtracting the number of minutes *
     * the 60 seconds and subtracting that from the remainder.
     * And voila, that remainder is our number of seconds.
     * Then, the main method formats the answer into HH:MM:SS.
     * 
     * @param args unused.
     */
    
    public static void main(String[] args) {
        final int secondsMinute = 60;
        final int secondsHour = 3600;
        
        Scanner secondsInput = new Scanner(System.in);
        System.out.println("Please enter the number of seconds you" 
        + "want to convert to hh:mm:ss");

        int seconds = secondsInput.nextInt();
        
        int hours = seconds / secondsHour;
        
        int remainingSeconds = seconds - (hours * secondsHour);
        
        int minutes = remainingSeconds / secondsMinute;
        
        remainingSeconds = seconds - (hours * secondsHour
                + minutes * secondsMinute);
        
        System.out.println(hours + ":" + minutes + ":" + remainingSeconds);
        System.out.println("Question two was called and ran sucessfully.");
        
        secondsInput.close();
        }


        
    }

