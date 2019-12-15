package ca.bcit.comp1510.lab11;

public class Average {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0; i < args.length; i++) {
			int castedString = Integer.parseInt(args[i]);
			sum += castedString;
		}
		
		System.out.println(sum / (args.length));
	}
	
}
