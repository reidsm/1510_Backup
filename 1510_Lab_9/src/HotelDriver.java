
public class HotelDriver {

	public static void main(String[] args) {
		CatHotel catLand = new CatHotel("NipLand");
		
		Cat one = new Cat("Chewinder", 6);
		Cat two = new Cat("Toffee", 15);
		Cat three = new Cat("", 4);
		Cat four = new Cat("Zeus", 7);
		Cat five = new Cat("Youngling", -1);
		
		catLand.addCat(one);
		catLand.addCat(two);
		catLand.addCat(three);
		catLand.addCat(four);
		catLand.addCat(five);
		
		System.out.println(catLand.printGuestList());
		System.out.println(catLand.guestCount());
		System.out.println(catLand.removeOldGuests(12));
		System.out.println(catLand.printGuestList());
		
	}
	
}
