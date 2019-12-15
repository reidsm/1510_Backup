package ca.bcit.comp1510.lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NameDriver {

	public static void main(String[] args) {
		
		ArrayList<Name> arr = new ArrayList<Name>();
		
		Name nameOne = new Name("Scott", "M", "Reid");
		Name nameTwo = new Name("Sam", "", "Assuncao");
		Name nameThree = new Name("Daniil", "P", "Molchanov");
		Name nameFour = new Name("Gurjot", "", "Sandher");
		Name nameFive = new Name("Puru", "G", "Garg");
		
		arr.add(nameOne);
		arr.add(nameTwo);
		arr.add(nameThree);
		arr.add(nameFour);
		arr.add(nameFive);
		
		Collections.sort(arr);
		
		System.out.println(arr);
		
		
	}
	
}
