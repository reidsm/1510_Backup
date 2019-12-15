import java.util.Scanner;
/**
 * This program converts numbers from base 10 to base B (with some restrictions).
 * @author: Scott Reid
 * @version 1
*/
public class BaseConvert {

    public static void main(String[] args) {
        /**
         * Drives the program.
         * @param args unused
         */
        int base10number; // the number in base 10
        int base; // the new base
        int maximumNumber = 0; // the maximum number that will fit
        // in 4 digits in the new base
        int place0; // digit in the 1's (base^0) place
        int place1;
        int place2;
        int place3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Base Conversion Program");
        System.out.print("Please enter a base (2-9): ");
        base = scan.nextInt();
        maximumNumber = (int) Math.pow(base, 4) - 1;
        System.out.println(maximumNumber);
        // Calculate the correct value to store in maxNumber DONE
        System.out.println("The max base 10 number to convert for that base is " +
        maximumNumber);
        System.out.print("Please enter a base 10 number to convert: ");
        base10number = scan.nextInt();
        // Assign the user's input to the base10number variable
        // Do the conversion
        place0 = base10number%base;
        // First compute place0--the units place. Remember this comes
        // from the first division so it is the remainder when the
        // base 10 number is divided by the base (HINT %).
        base10number = base10number/base;
        // Then compute the quotient (integer division / will do it!)-
        // You can either store the result back in base10Num or declare a
        // new variable for the quotient
        place1 = base10number%base;
        // Now compute place1--this is the remainder when the quotient
        // from the preceding step is divided by the base.
        base10number = base10number/base;
        place2 = base10number%base;
        base10number = base10number/base;
        place3 = base10number%base;
        // Then compute the new quotient
        // Repeat the idea from above to compute place2 and the next quotient
        // Repeat again to compute place3
        // Print the result
        //String baseBNumber = new String(""); // the number in the new base
        String baseBNumber = "" + place3 + place2 + place1 + place0;
        System.out.println(baseBNumber);
        scan.close();
    }
    
}
