package ca.bcit.comp1510.lab10;

public class Name implements Comparable<Name>{

	private final String first;
	private final String middle;
	private final String last;
	
	public Name(String first, String middle, String last) {
		
		first = first.trim();
		middle = middle.trim();
		last = last.trim();
		
		if ((first != null) && (first != "")) {
			this.first = first;
		} else {
			throw new IllegalArgumentException("The first name cannot be null, and cannot be an empty string.");
		}
		
		this.middle = middle;
		
		if ((last != null) && (last != "")) {
			this.last = last;
		} else {
			throw new IllegalArgumentException("The last name cannot be null, and cannot be an empty string.");
		}
		
	}
	
	public String getFirst() {
		return first;
	}


	public String getMiddle() {
		return middle;
	}


	public String getLast() {
		return last;
	}

	@Override
	public int compareTo(Name o) {
		
		if (!this.last.equals(o.last)) {
			return this.last.compareTo(o.last);
			
		} else if (!this.middle.equals(o.middle)) {
			return this.middle.compareTo(o.middle);
			
		} else {
			return this.first.compareTo(o.first);
		}
		
	}

	@Override
	public String toString() {
		return this.last + " " + this.middle + " " + this.first;
	}
	
	
	
}
