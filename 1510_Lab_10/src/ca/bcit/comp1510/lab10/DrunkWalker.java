package ca.bcit.comp1510.lab10;

import java.util.Scanner;

public class DrunkWalker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number representing the boundary: ");
		int boundary = scan.nextInt();
		System.out.println("Enter a number representing the number of steps for the drunk: ");
		int numSteps = scan.nextInt();
		System.out.println("Enter the number of simulations to run: ");
		int numSimulations = scan.nextInt();
		
		int fallCount = 0;
		
		for (int i = 0; i < numSimulations; i++) {
			RandomWalker drunkenFool = new RandomWalker(numSteps, boundary);
			drunkenFool.walk();
			boolean fellInLake = (drunkenFool.getCurrentSteps() < numSteps);
			
			if (fellInLake) {
				fallCount++;
			}
		}
		System.out.println("The drunken fool fell " + fallCount + " times.");
	}
	
}
