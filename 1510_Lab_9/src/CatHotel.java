import java.util.ArrayList;
import java.util.Iterator;

public class CatHotel {

	private ArrayList<Cat> arr;
	private String hotelName;
	
	public CatHotel(String hotelName) {
		this.arr = new ArrayList<Cat>();
		this.hotelName = hotelName;
	}
	
	public void addCat(Cat cat) {
		this.arr.add(cat);
	}
	
	public void removeAllGuests() {
		this.arr.clear();
	}
	
	public int guestCount() {
		return this.arr.size();
	}
	
	public int removeOldGuests(int n) {
		ArrayList<Cat> chopBlock = new ArrayList<Cat>();
		
		Iterator<Cat> catIterator = this.arr.iterator();
		int killCount = 0;
		
		while (catIterator.hasNext()) {
			Cat temp = catIterator.next();
			if (temp.getAge() > n) {
				chopBlock.add(temp);
				killCount++;
			}
		}
		
		for (Cat old: chopBlock) {
			this.arr.remove(old);
		}
		//ok so what's the non-silly way of dealing with a concurrent modification exception?
		return killCount;
	}
	
	public String printGuestList() {
		String guestList = "";
		for (Cat c: this.arr) {
			guestList += c;
		}
		
		return "Hotel Name: " + this.hotelName + guestList;

	}
	
}
