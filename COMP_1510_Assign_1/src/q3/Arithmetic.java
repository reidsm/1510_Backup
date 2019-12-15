package q3;
import java.util.Scanner;
/**
 * This program reads two floating point numbers from the
 * user, then finds the sum, difference, quotient, and
 * product of the numbers. 
 *
 * @author Scott Reid A01160090 Set D
 * @version 1.0
 */
public class Arithmetic {
    /**
     * This is the entry point that gets called to run the program. First 
     * it reads two floating point numbers and adds them, subtracts them,
     * multiplies them, and, for good measure, then divides them. If the user
     * decides to try that this program will tell them that the quotient
     * is infinity. 
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a floating point number");

        float float1 = input.nextFloat();
        
        System.out.println("Please enter a second floating point number");

        float float2 = input.nextFloat();

        float sum = (float1) + (float2);
        System.out.println("The sum is " + sum);

        float difference = float1 - float2;
        System.out.println("The difference is " + difference);

        float product = float1 * float2;
        System.out.println("The product is " + product);
        
        float quotient = float1 / float2;
        System.out.println("The quotient is " + quotient);
        
        System.out.println("Question three was called and ran sucessfully.");
        
        input.close();
    }

}
