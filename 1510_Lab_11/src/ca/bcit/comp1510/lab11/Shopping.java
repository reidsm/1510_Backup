package ca.bcit.comp1510.lab11;
import java.util.Scanner;
public class Shopping {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Item crossbow = new Item("Crossbow", 40.00);
		Item pig = new Item("Pig", 199.99);
		Item log = new Item("Firewood", 5.19, 5);
		Item matches = new Item("Match", 0.05, 10);
		Item vegetable = new Item("Vegetables", 1.15, 8);
		
		int sentinel = 1;
		
		System.out.println("Your pregnant wife told you to go to the store and pick up some bacon.");
		System.out.println("The store is out of bacon, so you have to improvise.");
		System.out.println("What would you like to buy?");
		
		Transaction shoppingCart = new Transaction(0);
		
		do {
			
			System.out.println();
			System.out.println("1. Add a crossbow to your cart.");
			System.out.println("2. Add a pig to your cart.");
			System.out.println("3. Add some firewood to your cart.");
			System.out.println("4. Add some matches to your cart.");
			System.out.println("5. Add some veggies to your cart.");
			System.out.println("0. Check out.");
			
			int choice = scan.nextInt();
			
			switch (choice) {
			
			case 1:
				shoppingCart.addToCart(crossbow);
				System.out.println("attempted to add " + crossbow.toString() + " to the cart");
				break;
			case 2:
				shoppingCart.addToCart(pig);
				break;
			case 3:
				shoppingCart.addToCart(log);
				break;
			case 4:
				shoppingCart.addToCart(matches);
				break;
			case 5:
				shoppingCart.addToCart(vegetable);
				break;
			default: 
				sentinel = 0;
				System.out.println("Did you find everything you needed today?");
					break;
			}
			System.out.println(shoppingCart);
		} while(sentinel != 0);
		
		checkout(shoppingCart);
	}
	
	public static void checkout(Transaction shoppingCart) {
		double total = shoppingCart.getTotalPrice();
		int totalQuantity = shoppingCart.getItemCount();
		
		System.out.println("You bought " + totalQuantity + " total items and owe " + total);
	}
}
