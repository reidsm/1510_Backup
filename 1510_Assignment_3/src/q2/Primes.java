package q2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * <p>This program uses the algorithm Sieve of Eratosthenes to
 * determine which numbers are prime between 0 and a number 
 * input by the user.</p>
 *
 * @author Scott Reid A01160090
 * @version 1.0
 */
public class Primes {
    
     /**
     * This ArrayList of boolean values represents
     * whether or not the value stored at a given index of 
     * the list is prime or not. 
     */

     private ArrayList<Boolean> primes;
     /**
     * <p>This is the constructor for the ArrayList. It creates
     * a list of boolean values n values long, where n is passed in
     * by the user. 
     * 
     * The constructor calls the "createList" helper method
     * to create an arrayList of size n.
     * 
     * The constructor also calls the "calculatePrimes"
     * method.</p>
     *
     * @param n represents the upper bound of the range of values
     * this program will determine are prime or not. It is also
     * the length of the ArrayList.
     */
     public Primes(int n) {
        this.primes = new ArrayList<Boolean>(n);
        createList(n);
        calculatePrimes();
    }
     /**
     * <p>The createList method is used by the constructor
     * to fill the ArrayList with boolean values. It uses
     * a for loop to initialize the list, and starts each value
     * as "true."</p>
     *
     * @param n represents how long the ArrayList should be.
     */
    public void createList(int n) {
        for (int i = 0; i <= n; i++) {
            this.primes.add(i, true);
        }
    }
    /**
     * <p>The calulatePrimes method takes the square root of n,
     * (the array list's size), to determine how many times the 
     * for loop needs to iterate until it's guaranteed to have set
     * all non prime numbers (indicies) in the list to false.
     * 
     * It sets the values at positions 0 and 1 to false, and then 
     * checks to see if the next value is considered prime. If it is,
     * it calls the multiplesToFalse method on that index.</p>
     */
    public void calculatePrimes() {
        int n = this.primes.size();
        double sqrtn = Math.sqrt(n);
        
        for (int i = 0; i < sqrtn; i++) {
            if (i == 0) {
                this.primes.set(i, false);
                
            } else if (i == 1) {
                this.primes.set(i, false);
                
            } else if (this.primes.get(i)) {
                multiplesToFalse(i);
            }
        }
    }
    /**
     * <p>The multiplesToFalse method does most of the heavy lifting
     * for this program. It uses a for loop to keep adding the value 
     * of a prime number to itself and setting the resulting value 
     * at that index to false, thus "crossing off" that value as a 
     * prime number in the list. The for loop keeps adding the prime 
     * value to itself until it reaches the size of the list itself
     * (the upper bound).</p>
     *
     * @param i is a prime index of the list.
     */
    public void multiplesToFalse(int i) {
        int n = this.primes.size();
        int x = i;
        
        for (i = i + x; i < n; i += x) {
            this.primes.set(i, false);
        }
    }
    /**
     * <p>The printPrimes method iterates through the entire list,
     * and if it finds a boolean value "true", it prints the index
     * of that value and labels it as a prime number.</p>
     *
     */
    public void printPrimes() {
        int n = this.primes.size();
        
        System.out.println("The prime numbers between 0 and " 
        + (n - 1) + " are: ");
        
        for (int i = 0; i < n; i++) {
            if (this.primes.get(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    /**
     * <p>The printComposites method is similar to the printPrimes method.
     * It iterates through the list and labels indicies of false values as
     * composite numbers. It was used for testing.</p>
     *
     */
    public void printComposites() {
        int n = this.primes.size();
        
        for (int i = 0; i < n; i++) {
            if (!this.primes.get(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    /**
     * <p>The countPrimes method uses a for loop to go through the
     * list of numbers and, if it finds an index with a value of true, 
     * it increments the int variable primeCounter, which tracks
     * how many primes the iterator has come accross.</p>
     * 
     * @return an int representing the number of primes there are
     * in the list of numbers.
     *
     */
    public int countPrimes() {
        int primeCounter = 0;
        int n = this.primes.size();
        
        for (int i = 0; i < n; i++) {
            if (this.primes.get(i)) {
                primeCounter++;
            }
        }
        return primeCounter;
    }
    /**
     * <p>The isPrime method checks to see if a number at index
     * x is prime.</p>
     *
     * @param x is the index the isPrime method checks to see
     * is prime.
     * @return a boolean that is true if the number passed in is prime.
     */
    public boolean isPrime(int x) {
        if (x <= this.primes.size() && x >= 0) {
            return (this.primes.get(x));
        } else {
            throw new IllegalArgumentException("The parameter passed in to"
                    + " isPrime() was out of range. "
                    + "The range for this object is 1-" + this.primes.size());
        }
    }


     /**
     * <p>This is the main method (entry point) that gets called by the JVM.
     * The main method scans for input from the user and validates it
     * using a while loop to ensure the input is greater than 1. 
     * Then, it instantiates a new Primes object by passing the 
     * input to the constructor. 
     * 
     * Then, the main method calls the countPrimes and printPrimes 
     * methods to show information to the user about the prime numbers
     * between 0 and the number they entered.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        System.out.println("This program uses the Sieve of Eratosthenes" 
                        + " to determine which numbers are prime.");
        System.out.println("Enter an upper bound:");
        Scanner scan = new Scanner(System.in);
    
        int input = scan.nextInt();
       
        while (input < 1) {
            System.out.println("Input must be greater than or equal to one."
                    + " Enter another number.");
            input = scan.nextInt();
        }

        Primes lst = new Primes(input);
        System.out.println("There are " + lst.countPrimes() + " prime numbers"
                + " between 0 and " + input);
        lst.printPrimes();
        System.out.println();
        System.out.println("Question two was called and ran sucessfully.");
        scan.close();
    }

};
