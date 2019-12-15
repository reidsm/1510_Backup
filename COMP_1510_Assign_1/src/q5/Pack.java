package q5;
import java.util.Scanner;
/**
 * This program accepts a string of 5 letters and converts them to chars. 
 * Then, it converts these characters to MIX characters (which are 
 * integers) and converts these values to a base 56 number. Then, it 
 * performs the reverse algorithm and prints out the original string. 
 *
 * @author Scott Reid A01160090 Set D
 * @version 1.0
 */
public class Pack {
    /**
     * This is the entry point that gets called to run the program.
     * First, it asks the user for a string of 5 letters A-I. Then, it pulls
     * apart the string into chars and assigns them a numerical value based
     * on Knuth's MIX computer. Then it converts these values, representing 
     * a base 56 number, to a base 10 number and prints it out. Then,
     * it does that same algorithm in reverse and prints out the 
     * original string 
     * of characters. 
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        final int three = 3;
        final int four = 4;
        final int base = 56;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 letters between A and I");
        String input = scan.nextLine();

        char c1 = input.charAt(0);
        char c2 = input.charAt(1);
        char c3 = input.charAt(2);
        char c4 = input.charAt(three);
        char c5 = input.charAt(four);

        int mix1 = c1 - 'A' + 1;
        int mix2 = c2 - 'A' + 1;
        int mix3 = c3 - 'A' + 1;
        int mix4 = c4 - 'A' + 1;
        int mix5 = c5 - 'A' + 1;

        int base10num = ((mix1 * base * base * base * base) 
                + (mix2 * base * base * base) 
                + (mix3 * base * base) + (mix4 * base) 
                + mix5 * 1);
        
        System.out.println("The encoded integer is: " + base10num);

        int place5 = base10num % base;
        int place4 = (base10num / base) % (base);
        int place3 = (base10num / (base * base)) % (base);
        int place2 = (base10num / (base * base * base)) % (base);
        int place1 = (base10num / (base * base * base * base)) % (base);

        char d1 = (char) (place1 - 1 + 'A');
        char d2 = (char) (place2 - 1 + 'A');
        char d3 = (char) (place3 - 1 + 'A');
        char d4 = (char) (place4 - 1 + 'A');
        char d5 = (char) (place5 - 1 + 'A');

        System.out.println("The decoded base 56 number is: " + d1 + d2 
                + d3 + d4 + d5);
        
        scan.close();
    }

}
