package q4;
import java.util.Scanner;
/**
 * This program takes a number from a user that represents the 
 * side length of a cube and cubes it to find the area of a cube. 
 *
 * @author Scott Reid A01160090 Set D
 * @version 1.0
 */
public class Cube {
    
    /**
     * This is the entry point that gets called to run the program.
     * It asks for the user to input the length of a side of a 
     * cube. Then, it cubes this number to find out the volume
     * of the cube. Then, it calculates the surface area of the
     * cube using the same user input. 
     *
     * @param args unused.
     */
    
    public static void main(String[] args) {
        final int cubeSides = 6;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer representing "
                + "the side length of a cube:");

        int sideLength = input.nextInt();
        
        int volume = sideLength * sideLength * sideLength;
        
        int surfaceArea = (sideLength * sideLength) * cubeSides;
        
        System.out.println("The volume of this cube is " + volume);
        System.out.println("The surface area of this cube is " + surfaceArea);
        System.out.println("Question four was called and ran sucessfully.");
        
        input.close();
    }

}
