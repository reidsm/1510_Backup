/*
 * This class represents a name.
 * 
 * @author Scott Reid
 * @version 1.0
 * */
public class Name {

    private String first;
    private String middle;
    private String last;
    
    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    
    public void setFirst(String first) {
        this.first = first;
    }
    
    public String getFirst() {
        return this.first;
    }
    
    public void setMiddle(String middle) {
        this.middle = middle;
    }
    
    public String getMiddle() {
        return this.middle;
    }
    
    public void setLast(String last) {
        this.last = last;
    }
    
    public String getLast() {
        return this.last;
    }
    
    public int length() {
        return this.first.length() + this.middle.length() + this.last.length();
    }
    
    public String initials() {
        String firstInitial = (String.valueOf(this.first.charAt(0))).toUpperCase();
        String middleInitial = (String.valueOf(this.middle.charAt(0))).toUpperCase();
        String lastInitial = (String.valueOf(this.last.charAt(0))).toUpperCase();
        
        return firstInitial + middleInitial + lastInitial;
    }
    
    public char nameChar(int n) {
        String fullName = this.first + this.middle + this.last;
        return fullName.charAt(n);
    }
    
    public String recordName() {
        return this.last + ", " + this.first + " " + this.middle;
    }
    
    public boolean firstEquals(String first) {
        return (this.first.equals(first));
    }
    
    public boolean nameEquals(Name name) {
        return (this.first.equals(name.first) && this.middle.equals(name.middle)
                && this.last.equals(name.last));
    }
    
    public String toString() {
        return this.first + " " + this.middle + " " + this.last;
    }
    
}