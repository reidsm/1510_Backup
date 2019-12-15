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
    
    public String toString() {
        return this.first + " " + this.middle + " " + this.last;
    }
    
}
