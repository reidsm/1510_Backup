package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * <p>This program counts the number of unique words that appear in
 * a text file, and how many times each unique word appears.</p>
 *
 * @author Scott Reid A01160090
 * @version 1.0
 */
public class WordCounter {

     /**
     * This ArrayList of Words contains the list of Word objects found
     * in the file that this program will read. 
     */

     private static ArrayList<Word> wordList = new ArrayList<Word>();

     /**
     * <p>The parseBook method is primarily comprised of two while
     * loops which use the Scanner Iterator to break the file down
     * into lines and then individual words. The outer while loop
     * breaks the file into lines, and the inner while loop goes
     * through that line and breaks it into words. 
     * 
     * The inner while loop strips the words of 
     * punctuation using a regex, and 
     * makes all words lowercase to make it easy for the equals
     * and compareTo methods to sort the list of words. 
     * 
     * Once the parseBook method has broken down a line into an 
     * individual word string, it instantiates a new object, passing
     * the string associated with that word to the Word class constructor.
     * Then, it uses a conditional statement to see if the existing list
     * of words in the file (the class variable above) contains the word.
     * If so, that word has its frequency incremented by one. If not, 
     * a new Word object is added to the list of unique words present
     * in the file.</p>
     *
     * @param fileLocation is the location of the file this
     * program is supposed to parse. 
     * @throws FileNotFoundException when the file passed in 
     * cannot be found.
     * @return the number of unique words that appear in the file.
     */

    public static int parseBook(String fileLocation) 
        throws FileNotFoundException {
        Scanner fileScan = new Scanner(new File(fileLocation));
        while (fileScan.hasNextLine()) {
    
            String nextLine = fileScan.nextLine();
            Scanner scan = new Scanner(nextLine);

            while (scan.hasNext()) {
                Word w = new Word(scan.next().replaceAll("\\p{Punct}",
                        "").toLowerCase());

                if (wordList.contains(w)) {
                    int index = wordList.indexOf(w);
                    wordList.get(index).incFrequency();
                } else if (!wordList.contains(w)) {
                    wordList.add(w);
                }
            }
            scan.close();
        }
        fileScan.close();
        return wordList.size();
    }
    
    /**
     * <p>method prints the most commonly seen words in the file.
     * First, it sorts the word list. Then, it uses a for loop to print
     * the top n most common words in the list.</p>
     *
     * @param n is the number of words this function should print.
     */

    public static void printTopWords(int n) {
        Collections.sort(wordList);

        for (int i = 0; i <= n; i++) {
            System.out.println(wordList.get(i));
        }
    }

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.
     * It stores the file location of the file to be parsed. Then, it calls
     * the parseBook method to fill the ArrayList of words with information and
     * print the number of unique words stored in the file. Then, it calls
     * the printTopWords method to print out the most common words that appear
     * in the file.</p>
     *
     * @param args unused.
     * @throws FileNotFoundException when the fileLocation can't be found
     * by the parseBook method, which is called in the main method.
     */
    public static void main(String[] args) throws FileNotFoundException {
        final int ten = 10;
        String fileLocation = 
                "src\\bible.txt";

        System.out.println("There are " + parseBook(fileLocation) 
        + " unique words in this file.");
        printTopWords(ten);
        System.out.println("Question one was called and ran sucessfully.");
    }

};
