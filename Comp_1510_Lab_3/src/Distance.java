import java.util.Scanner;
import java.text.DecimalFormat;
public class Distance {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter an x, y coordinate in the format 'x y' (separate the x and y with one space)");
    
    double x1 = scan.nextDouble();
    double y1 = scan.nextDouble();
    
    System.out.println("Enter another x, y coordinate in the format 'x y' (separate the x and y with one space)");
    
    double x2 = scan.nextDouble();
    double y2 = scan.nextDouble();
    
    double xdiff = x1 - x2;
    double ydiff = y1 - y2;
    
    double xdiffSq = Math.pow(xdiff, 2);
    double ydiffSq = Math.pow(ydiff, 2);
    
    double ans = Math.sqrt(xdiffSq + ydiffSq);
    
    DecimalFormat decimal = new DecimalFormat("#.##");
    
    System.out.println("The distance between the two points is " + decimal.format(ans));
}
}
