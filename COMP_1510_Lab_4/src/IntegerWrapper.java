import java.util.Scanner;
/*
 * This class is designed to wrap integers. 
 * 
 * @author Scott Reid
 * @version 1.0
 * */
public class IntegerWrapper {

    /*
     * This method drives the program.
     * 
     * @param args unused.
     * */
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to convert to binary, octal, and hex");
        int input = scan.nextInt();
        
        Integer num = input;
        
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toHexString(num));
        System.out.println(Integer.toOctalString(num));
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        System.out.println("Enter a number");
        String input2 = scan.next();
        System.out.println("Enter another number");
        String input3 = scan.next();
        
        Integer num2 = Integer.parseInt(input2);
        Integer num3 = Integer.parseInt(input3);
        
        int sum = Integer.sum(num2, num3);
        System.out.println(sum);
    }
    
}
