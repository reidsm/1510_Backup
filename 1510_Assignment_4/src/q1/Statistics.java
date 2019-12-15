package q1;

import java.util.Arrays;
import java.util.Scanner;
/**
 * <p>This program is designed to read input via file
 * redirection. The input is assumed to be several ints
 * of ints. This program then finds the mean and
 * standard deviation of the inputs.</p>
 *
 * @author Scott Reid A01160090
 * @version 1.0
 */

//C:\Work\Workspace_2019-06\1510_Assignment_4\bin> java q1.Statistics < test.txt
public class Statistics {
    /**
     * <p>The main method calls the functions to
     * construct the array, find the standard deviation, 
     * and find the mean. It then prints out these values.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
    
        int[] arr = constructArray();
        System.out.println(Arrays.toString(arr));
        double mean = findMean(arr);
        double std = findStd(arr, mean);
        System.out.println("The mean is: " + mean);
        System.out.println("The standard deviation is: " + std);
        System.out.println("Question one was called and ran sucessfully.");
    }
    /**
     * <p>This method uses the system input (file redirection
     * in this case) along with the Scanner object's
     * iterator to construct a new int[] array and return it
     * to the main method.</p>
     *
     * @return an int[] of the input. The array
     * is easier to work with than the raw data.
     */
    public static int[] constructArray() {
        Scanner scan = new Scanner(System.in);
        int[] temp = new int[0];
        int counter = 0;
        while (scan.hasNext()) {
            String nextToken = scan.next();
            if (!nextToken.equals("END")) {
                temp = increaseSize(temp);
                int nextInt = Integer.parseInt(nextToken);
                temp[counter] = nextInt;
                counter++;
            }
        }
        return temp;
    }
    /**
     * <p>This is a helper method for the array construction
     * method. It mimics the ArrayList class's flexibility.</p>
     *
     * @param oldArray is the array that was too small.
     * @return a new int[] with the previous values and one 
     * extra null spot.
     */
    public static int[] increaseSize(int[] oldArray) {
        int newArraySize = oldArray.length + 1;
        int[] newArray = new int[newArraySize];
    
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }
    /**
     * <p>This method uses a for loop to go through
     * the input array, add each value to a running sum,
     * and then divides that sum by the length of the array 
     * to find the mean.</p>
     *
     * @param arr which is the array of inputs.
     * @return double that is the mean.
     */
    public static double findMean(int[] arr) {
        int sum = 0;
    
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
    
        double mean = (double) sum / arr.length;
        return mean;
    }
    /**
     * <p>The standard deviation method is similar to the mean method,
     * but it adds the squared difference between each int[] value and 
     * the mean to the sum total. Then it divides by the length - 1, 
     * and takes the square root of that whole number.</p>
     *
     * @param arr is the int[] of inputs.
     * @param mean is the mean of the inputs.
     * @return double that is the standard deviation of the inputs.
     */
    public static double findStd(int[] arr, double mean) {
        int sum = 0;
    
        for (int i = 0; i < arr.length; i++) {
        sum += (arr[i] - mean) * (arr[i] - mean);
        }
    
        System.out.println("sum: " + sum);
        double stdSquared = (double) sum / (arr.length - 1);
        double std = Math.sqrt(stdSquared);
        return std;
    }

};
