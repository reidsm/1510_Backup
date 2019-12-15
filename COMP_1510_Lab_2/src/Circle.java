import java.util.Scanner;
/**
 * This program calculates some important values for a circle. 
 * @author: Scott Reid
 * @version 1
*/
public class Circle {
    public static void main(String[] args) {
      /**
       * Drives the program.
       * @param args unused
       */
        final double PI = 3.14159;
        double radius;
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a radius for a circle. It should be commesurate with the size of pizza you feel like eating right now. ");
        
        radius = myScanner.nextDouble();
        double doubleRadius = radius * 2;
        
        double circumference = 2*PI*radius;
        double area = PI*radius*radius;
        
        System.out.println("Your pizza has a circumference of: " + circumference);
        System.out.println("Your pizza has an area of: " + area);
        
        double doubleCircumference = 2*PI*doubleRadius;
        double doubleArea = PI*doubleRadius*doubleRadius;
        
        System.out.println("If your pizza had a radius of " + radius + " then your pizza would" + 
        " have a circumference of " + doubleCircumference);
        System.out.println("If your pizza had a radius of " + radius + " then your pizza would" + 
        " have an area of " + doubleArea);
        
        System.out.println("If you double the radius, the circumference " +
        "would be " + doubleCircumference/circumference + " times bigger");
        System.out.println("If you double the radius, the area " +
        "would be " + doubleArea/area + " times bigger");
    }
}
