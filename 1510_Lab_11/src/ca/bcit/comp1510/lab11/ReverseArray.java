package ca.bcit.comp1510.lab11;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean keepGoing = true;
		
		do {
			
			System.out.println("Do you want to see a magic trick? Y/N ");
			String input = scan.next().trim().toUpperCase();
			
			if (input.equals("Y")) {
				
				keepGoing = true;
				System.out.println("I will now create a second version of you.");
				System.out.println("How many digits are there in your social security number?");
				int arraySize = scan.nextInt();
				int[] ssn = new int[arraySize];
				populateArray(ssn);
				System.out.println("Your ssn forwards is " + Arrays.toString(ssn));
				reverseArray(ssn);
				System.out.println("Your ssn backwards is " + Arrays.toString(ssn));
				System.out.println("In 48 hours there will be two of you.");
				System.out.println();
				System.out.println("To quote the legendary Bruce:");
				System.out.println("Isn't that fantastic?!");
				System.out.println();
				
			} else {
				
				keepGoing = false;
				System.out.println("No fun. Bye.");
			}
			
		} while (keepGoing);
	}
	
	public static int[] populateArray(int[] ssn) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < ssn.length; i++) {
			
			System.out.println("What is the " + (i + 1) + " digit in your social security number?");
			int userInput = scan.nextInt();
			ssn[i] = userInput;
			
			while (userInput > 9) {
				System.out.println("A digit is a number between 0 and 9. Enter digit " + (i + 1) + " again.");
			}
		}
		return ssn;
	}
	
	public static int[] reverseArray(int[] ssn) {
		
		int firstHalfOfArray = ssn.length/2;
		
		for (int i = 0; i < firstHalfOfArray; i++) {
			
			int indexComplement = ssn.length - (1 + i);
			swap(ssn, i, indexComplement);
		}
		
		return ssn;
		
	}
	
	public static void swap(int[] ssn, int i, int indexComplement) {
		int preswapFirstDigit = ssn[i];
		int preswapSecondDigit = ssn[indexComplement];
		
		ssn[i] = preswapSecondDigit;
		ssn[indexComplement] = preswapFirstDigit;
	}
	
}
