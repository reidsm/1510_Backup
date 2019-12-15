import java.util.Random;
public class Mathematics {

	public static final double PI = 3.14159;
	public static final double ONE_FOOT_TO_KILOMETRE_RATIO = 0.0003048;
	public double getCircleArea(double d) {
		return PI * d * d;
	}
	public double getSquareArea(double d) {
		return d * d;
	}
	public double add(double d, double e) {
		return (d + e);
	}
	public double multiply(double d, double e) {
		return (d * e);
	}
	public double subtract(double d, double e) {
		return (d - e);
	}
	public double divide(int i, int j) {
		int result;
		
		if(j == 0) {
			result = 0;
		} else {
			result = (i/j);
		}
		
		return result;
	}
	public int absoluteValue(int i) {
		return Math.abs(i);
	}
	public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
		Random rand = new Random();
		
		int result = 0;
		
		while(result == 0 || result == 15) {
			result = rand.nextInt(11) + 10;
		}
		
		return result;
	}
	public double convertFeetToKilometres(double d) {
		return d * ONE_FOOT_TO_KILOMETRE_RATIO;
	}
	public int sumOfInts(int i) {
		int sum = 0;
		
		for(int j = 0; j <= i; j++) {
			sum += j;
		}
		
		if(sum < 0) {
			sum = 0;
		}
		
		return sum;
	}
	public boolean isPositive(int i) {
		return (i > 0);
	}
	public boolean isEven(int i) {
		return (i % 2 == 0);
	}
	public int sumOfProducts(int i, int j) {
		int result = 0;
		
		for(int k = j; k <= Math.abs(i); k = k + j) {
			result += k;
		}
		
		if(i < 0) {
			result = result * -1;
		}
		
		return result;
	}
	
	public int sumOfEvens(int i) {
		int result = 0;
		for(int j = 0; j <= Math.abs(i); j++) {
			if(j % 2 == 0) {
				result += j;
			}
		}
		if(i < 0) {
			result = result * -1;
		}
		return result;
	}

}
