import java.util.Scanner;
public class FunWithStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        
        System.out.println("What is your favorite book?");
        input = scan.nextLine();
        //next() stops at whitepace
        
        int l = input.length();
        
        System.out.println(input);
        System.out.println(l);
        
        boolean startsThe = input.startsWith("The");
        System.out.println("Does the title start with 'The'? " + startsThe);
        
        input.toUpperCase();
        //doesn't change input
        System.out.println(input);
        System.out.println(input.toUpperCase());
        
        String trimmedUserInput = input.trim();
        int trimmedLength = trimmedUserInput.length();
        
        System.out.println(trimmedUserInput);
        System.out.println(trimmedLength);
        
        String lowerCaseInput = trimmedUserInput.toLowerCase();
        System.out.println(lowerCaseInput);
        
        String firstChar = lowerCaseInput.substring(0,1);
        String upperFirst = firstChar.toUpperCase();
        System.out.println(upperFirst);
        String lastChar = lowerCaseInput.substring(l-1, l);
        String upperLast = lastChar.toUpperCase();
        System.out.println(upperLast);
        
        String middle = lowerCaseInput.substring(1,l-1);
        
        System.out.println(upperFirst + middle + upperLast);
        
    }
}
