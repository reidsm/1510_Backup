package ca.bcit.comp1510.lab11;

public class Item {

	private final String name;
	private final double price;
	private final int quantity;
	
	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 1;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
