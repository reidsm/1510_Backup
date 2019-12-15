import java.util.Scanner;
/**
 * This program creates a table of student grades.
 * @author: Scott Reid
 * @version 1
*/
public class Paint {
    public static void main(String[] args) {
        /**
         * Drives the program.
         * @param args unused
         */
        final int COVERAGE = 400;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter the room's length:");
        int length = myScanner.nextInt();
        System.out.println("Enter the room's width: ");
        int width = myScanner.nextInt();
        System.out.println("Enter the room's height: ");
        int height = myScanner.nextInt();
        System.out.println("How many coats should we paint: ");
        int coats = myScanner.nextInt();
        
        int surfaceArea = (length * width) + (2 * width * height) 
                + (2 * length * height);
        
        int coverageNeeded = surfaceArea * coats;
        
        //int cansOfPaintNeeded = coverageNeeded/COVERAGE;
        double doubleCansOfPaintNeeded = (double) coverageNeeded/COVERAGE;
        System.out.println("Cans of paint needed (rounded up to the nearest can): " 
        + Math.ceil(doubleCansOfPaintNeeded));
    }
}
