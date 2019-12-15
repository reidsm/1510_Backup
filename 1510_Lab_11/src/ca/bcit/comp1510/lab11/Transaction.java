package ca.bcit.comp1510.lab11;

import java.util.Arrays;

public class Transaction {

	private Item[] cart;
	private double totalPrice;
	private int itemCount;
	
	public Transaction(int cartSize) {
		this.cart = new Item[cartSize];
		this.totalPrice = 0;
		this.itemCount = 0;
	}
	
	public void addToCart(String itemName, double itemPrice, int itemQuantity) {
		
		if (this.itemCount == this.cart.length) {
			System.out.println("I am increasing the size of the cart");
			increaseSize();

		} else {
		
		Item item = new Item(itemName, itemPrice, itemQuantity);
		
		this.cart[itemCount] = item;
		
		this.totalPrice += itemPrice * itemQuantity;;
		this.itemCount++;
		
		}
	}
	
	public void addToCart(Item item) {
		
		if (this.itemCount == this.cart.length) {
			System.out.println("Attempted to increase the size of the cart");
			increaseSize();
			
			this.cart[itemCount] = item;
			
			this.totalPrice += item.getPrice() * item.getQuantity();
			this.itemCount++;

		} else {
			
			this.cart[itemCount] = item;
			
			this.totalPrice += item.getPrice() * item.getQuantity();
			this.itemCount++;
		}
		
	}
	
	public void increaseSize() {
			
			int newCartSize = this.cart.length + 3;
			Item[] newCart = new Item[newCartSize];
			
			for (int i = 0; i < (this.cart.length); i++) {
				newCart[i] = this.cart[i];
			}
			
			this.cart = newCart;
	}
	
	public double getTotalPrice() {
		return this.totalPrice;
	}
	
	public int getItemCount() {
		int itemCount = 0;
		for (int i = 0; i < this.itemCount; i++) {
			itemCount += cart[i].getQuantity();
		}
		
		return itemCount;
	}

	@Override
	public String toString() {
		return "Transaction [cart=" + Arrays.toString(cart) + ", totalPrice=" + totalPrice + ", itemCount=" + itemCount
				+ "]";
	}
	
	
	
}
