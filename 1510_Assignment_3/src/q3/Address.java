package q3;
/**
 * <p>This program defines the address class. The address class
 * has a street address, city, state, and postal code,
 * all stored as Strings.</p>
 *
 * @author Scott Reid (really this was a book example)
 * @version 1.0
 */
public class Address {
     /**
     * This String represents the street address. 
     */
     private String streetAddress;
     /**
     * This String represents the city of the address. 
     */
    private String city;
    /**
     * This String represents the state that the address is in. 
     */
    private String state;
    /**
     * This String represents the postal code of the address. 
     */
    private String postalCode;
     /**
     * <p>This is the address constructor which takes 4 parameters,
     * one for each instance variable above.</p>
     *
     * @param street is a String that represents the street address. 
     * @param town is a String representing the city the address is in.
     * @param st is a String representing the state of the address. 
     * @param code is a String representing the postal code of the address.
     */
    public Address(String street, String town, String st, String code) {
        streetAddress = street;
        city = town;
        state = st;
        postalCode = code;
    }

     /**
     * <p>The toString method prints all 4 instance variables as one String.</p>
     *
     * @return a String representing all 4 parts of the address as one
     * whole address.
     */
    public String toString() {
        String result;

        result = streetAddress + "\n";
        result += city + ", " + state + "  " + postalCode;

        return result;
    }

}
