package ca.bcit.comp1510.lab10;

import java.util.Scanner;

public class TestWalker {

	public static void main(String[] args) {
		RandomWalker testOne = new RandomWalker(10, 5);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the maximum number of steps a random walker can take: ");
		int testTwoMaxSteps = scan.nextInt();
		System.out.println("Now enter the boundary size of the room that the random walker will be in: ");
		int testTwoBoundarySize = scan.nextInt();
		
		RandomWalker testTwo = new RandomWalker(testTwoMaxSteps, testTwoBoundarySize);
		
		System.out.println("The first walker has these characteristics: " + testOne);
		System.out.println("The second walker has these characteristics: " + testTwo);
		
		//testOne.walk();
		testTwo.walk();
		
		System.out.print("The second walker has these characteristics: " + testTwo);
		System.out.println("The distance to the origin is: " + testTwo.getMaximumDistance());
		
	}
	
}
