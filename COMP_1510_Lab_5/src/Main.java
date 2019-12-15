import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
        
        //DEATH STAR
        System.out.println("Please enter an x value for a prototype Death Star:");
        int xCoord = scan.nextInt();
        System.out.println("Please enter an y value for a prototype Death Star:");
        int yCoord = scan.nextInt();
        System.out.println("Please enter an z value for a prototype Death Star:");
        int zCoord = scan.nextInt();
        System.out.println("Please enter a value for a prototype Death Star radius:");
        double radius = scan.nextDouble();
       
        Sphere deathStar = new Sphere(xCoord, yCoord, zCoord, radius);
        System.out.println(deathStar);
        
        //BORG CUBE
        System.out.println("Please enter an x value for a borg cube:");
        double xCoordCube = scan.nextDouble();
        System.out.println("Please enter an y value for a borg cube:");
        double yCoordCube = scan.nextDouble();
        System.out.println("Please enter an z value for a borg cube:");
        double zCoordCube = scan.nextDouble();
        System.out.println("Please enter a value for a borg cube edge length:");
        double edgeLength = scan.nextDouble();
        
        Cube borgCube = new Cube(xCoordCube, yCoordCube, zCoordCube, edgeLength);
        System.out.println(borgCube);
        
        //ICE CREAM CONE
        System.out.println("Please enter height for an ice cream cone:");
        double heightCone = scan.nextDouble();
        System.out.println("Please enter a value for an ice cream cone radius:");
        double radiusCone = scan.nextDouble();
        
        Cone iceCream = new Cone(radiusCone, heightCone);
        System.out.println(iceCream);
        
        /*
        Name name = new Name("Scott", "Michael", "Reid");
        Name name2 = new Name("Scott", "Michael", "Reid");
        Name name3 = new Name("Honk", "The", "Goose");
        
        System.out.println(name.length());
        System.out.println(name.initials());
        System.out.println(name.nameChar(5));
        System.out.println(name.recordName());
        System.out.println(name.firstEquals("Oink"));
        System.out.println(name.nameEquals(name3));
        */
    }
}
