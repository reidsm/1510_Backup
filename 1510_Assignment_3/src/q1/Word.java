package q1;

/**
 * <p>This program is a class definition for the Word class.
 * The Word class has two instance variables, one for the frequency
 * that the word appears in a file, and a String that represents the word. 
 * It implements the compareTo method and the equals method to make it
 * possible to compare words and thereby sort a list of words, and 
 * it also contains the usual accessor and toString methods.</p>
 *
 * @author Scott Reid A01160090
 * @version 1.0
 */

public class Word implements Comparable<Word> {

     /**
     * This String represents the word being counted by the WordCounter class. 
     */
     private String word;
     /**
     * This int stores the frequency of the word as it appears
     * in the file being read by the WordCounter class. 
     */
    private int frequency;

    /**
     * <p>This is the constructor for the word class. It initializes the 
     * word instance parameter to the string passed into it. It 
     * initializes the initial frequency of the word (on creation) to 1.</p>
     *
     * @param word is a String that represents the word being counted by the
     * WordCounter class.
     */
    public Word(String word) {
        this.word = word;
        this.frequency = 1;
    }
    /**
     * <p>This compareTo method is important because it will be called when
     * the ArrayList of words is sorted. This is possible because this class 
     * implements the Comparable<Word> interface. </p>
     *
     * @param w is a Word object being compared to the Word object
     * the compareTo method was called through.
     * @return the int which will be negative if the Word object
     * this method was called through has a higher frequency than the 
     * Word object passed into it. The int returned will be positive
     * otherwise.
     */
    public int compareTo(Word w) {
        return  w.getFrequency() - this.frequency;
    }
    /**
     * <p>This is a standard accessor for the frequency of 
     * this Word instance.</p>
     *
     * @return an int representing the frequency of this instance of Word. 
     */
    public int getFrequency() {
        return this.frequency;
    }
    /**
     * <p>This method is a standard accessor for the word 
     * instance it was called through.</p>
     *
     * @return a String which represents the actual 
     * word being represented by this
     * Word object.
     */
    public String getWord() {
        return this.word;
    }
    /**
     * <p>This method increments the frequency instance variable of the
     * word object it was called through by 1.</p>
     */
    public void incFrequency() {
        this.frequency = this.frequency + 1;
    }
    /**
     * <p>This is an equals method for the word class which overrides the 
     * equals method in the object class. This is important for the sort method
     * to work in the WordCounter class along with the "contains" method in the 
     * parseBook method. It makes sure the object passed in
     * is of type Word and then compares that object's word String with the
     * word String of the Word object this equals method was called 
     * through.</p>
     *
     * @param w is an object which should be a Word object. 
     * @return a boolean value that is true if the objects are equal.
     */
    public boolean equals(Object w) {

        if (w instanceof Word) {
            return this.word.equals(((Word) w).getWord());
        }
        return false;
    }
    
    /**
     * <p>The hashcode function returns the hashcode of
     * the word string because that's the only instance
     * variable used in the equals method.</p>
     * 
     * @return int that is the hashCode for this word.
     */
    public int hashCode() {
        return word.hashCode();
    }

    /**
     * <p>This is a standard toString method designed to represent the state
     * of this Word object as a String.</p>
     *
     * @return a String which displays the word String and the frequency of
     * this Word object. 
     */

    public String toString() {
        return this.word + " appears " + this.frequency + " times.";
    }

}
