package q1;
import java.util.Scanner;

/**
 * This program asks a user for a double amount, converts the amount to cents, 
 * and then divides up the cents into different denominations of 
 * bills and coins. 
 *
 * @author Scott Reid A01160090 Set D
 * @version 2.0. Added Math.round() to integer pennies to
 * remove floating point errors.
 */
public class Change {
    
    /**
     * This is the main method. It asks for a dollar input and converts
     * the amount to pennies. Then, it divides the pennies amount 
     * into different denominations of bills and coins, re-assigning
     * the remaining pennies at each stage to the difference between
     * the previous remainder minus 
     * the number of [bill size] * [bill denomination].
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        final int hundred = 100;
        final int tenDenom = 1000;
        final int fiveDenom = 500;
        final int twoDenom = 200;
        final int quarterDenom = 25;
        final int dimeDenom = 10;
        final int nickelDenom = 5;
        
        Scanner howMuch = new Scanner(System.in);
        System.out.println("Please enter a monetary amount:");

        double amount = howMuch.nextDouble();
        
        double convertedAmount = amount * hundred;
        double roundedAmount = Math.round(convertedAmount);
        
        int pennies = (int) roundedAmount;
        
        int numberOfTens = pennies / tenDenom;
        int penniesRemaining = pennies - numberOfTens * tenDenom;
        
        int numberOfFives = penniesRemaining / fiveDenom;
        penniesRemaining = penniesRemaining - numberOfFives * fiveDenom;
        
        int numberOfTwos = penniesRemaining / twoDenom;
        penniesRemaining = penniesRemaining - numberOfTwos * twoDenom;
        
        int numberOfOnes = penniesRemaining / hundred;
        penniesRemaining = penniesRemaining - numberOfOnes * hundred;
        
        int numberOfQuarters = penniesRemaining / quarterDenom;
        penniesRemaining = penniesRemaining - numberOfQuarters 
                * quarterDenom;
        
        int numberOfDimes = penniesRemaining / dimeDenom;
        penniesRemaining = penniesRemaining - numberOfDimes * dimeDenom;
        
        int numberOfNickels = penniesRemaining / nickelDenom;
        penniesRemaining = penniesRemaining - numberOfNickels * nickelDenom;
        
        System.out.println("Your change is " + numberOfTens + " tens, " 
                + numberOfFives + " fives, " + numberOfTwos + " toonies, " 
                + numberOfOnes + " loonies, " + numberOfQuarters
                + " quarters, " + numberOfDimes + " dimes, " 
                + numberOfNickels + " nickels, and " + penniesRemaining 
                + " pennies.");
        
        System.out.println("Question one was called and ran sucessfully.");
        
        howMuch.close();
    }


        
    }



