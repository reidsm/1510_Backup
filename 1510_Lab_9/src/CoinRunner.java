
public class CoinRunner {

	public static void main(String[] args) {
		Coin luckyQuarter = new Coin();
		int finalCount = 0;
		int currentCount = 0;
		
		for (int i = 0; i < 100; i++) {
			luckyQuarter.flip();
			System.out.println(luckyQuarter);
			
			if (luckyQuarter.isHeads()) {
				currentCount++;
				System.out.println("The current tally is: " + currentCount);
				
				if (currentCount > finalCount) {
					finalCount = currentCount;
					System.out.println("The final Count is: " + finalCount);
				}
				
			} else {
				currentCount = 0;
			}
		}
		System.out.println(finalCount);
	}
}
