package q3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <p>The message class collects either a string or an array
 * of MIXChars and encodes it into a long[], with each value
 * of the long[] array consisting of 11 packed MIXChars.
 * The class's toString method decodes each entry in the long[]
 * and prints out the corresponding MIXChar java characters.</p>
 *
 * @author Scott Reid A01160090
 * @version 1.0
 */

public class Message {
     /**
     * The BASE represents the base of the Knuth computer, which is
     * 56.
     */
     private final int BASE = 56;
     /**
     * The full pack size is 11. There are 11 MIXChars in a fully
     * packed long.
     */
     private final int FULL_PACK_SIZE = 11;
     /**
     * This long[] represents the encoded packed String, with each entry
     * packing 11 MIXChars in it.
     */
     private long[] arr;
     /**
     * This int represents the actual number of MIXChars being encoded
     * by the long[]. 
     */
     private int count;

     /**
     * <p>This is the Message constructor that accepts
     * MIXChar[]. It calculates the number of fully packed
     * longs that will be stores in the long[], and the size
     * of the (at most) one partly packed long in the long[].
     * It then calls buildArray() to finish construction.</p>
     *
     * @param m is a MIXChar[] to be encoded into a Message.
     */
     public Message(MIXChar[] m) {
        this.count = m.length;
        int numFullLongs = this.count / FULL_PACK_SIZE;
        int lastLongSize = this.count % FULL_PACK_SIZE;

        this.arr = buildArray(m, numFullLongs, lastLongSize);
     }
     /**
     * <p>This is the constructor to create a Message by
     * passing in Strings. It works the same way as the 
     * MIXChar constructor, but it first converts the
     * String to a MIXChar[].</p>
     *
     * @param s is a String representing the string to be
     * encoded.
     */
     public Message(String s) {
        MIXChar[] m = MIXChar.toMIXChar(s);

        this.count = m.length;
        int numFullLongs = this.count / FULL_PACK_SIZE;
        int lastLongSize = this.count % FULL_PACK_SIZE;

        this.arr = buildArray(m, numFullLongs, lastLongSize);
     }
     /**
     * <p>This method builds the long[] instance variable.
     * It contains a loop that calls the pack() method to
     * calculate a fully packed long in the array. Then 
     * it calls the pack method again, passing it 
     * the range of the last value in the long[] which
     * might not be fully packed.</p>
     *
     * @param m is the MIXChar[] to be encoded.
     * @param numFullLongs is the number of fully
     * packed longs will be present in the long[].
     * @param lastLongSize represents the number of 
     * values to be packed into the last value in the
     * long[].
     * @return the long[] instance variable needed by the
     * constructor. 
     */
     public long[] buildArray(MIXChar[] m, int numFullLongs, int lastLongSize) {
        long[] temp = new long[numFullLongs + 1];
        int fullyPackedLongs = numFullLongs * FULL_PACK_SIZE;
        int longArrayIndex = 0;
        for (int i = 0; i < fullyPackedLongs; i += FULL_PACK_SIZE) {
            MIXChar[] subArray = Arrays.copyOfRange(m, i, i + FULL_PACK_SIZE);
            temp[longArrayIndex] = pack(subArray);
            longArrayIndex++;
        }
        MIXChar[] subArrayEnd = 
                Arrays.copyOfRange(m, fullyPackedLongs, m.length);
        temp[longArrayIndex] = pack(subArrayEnd);
        return temp;
     }
     /**
     * <p>This method packs a long value with 11 or less
     * MIXChars depending on how long the MIXChar[] is that
     * was passed in. It uses the same algorithm as converting
     * a base 10 number to base 55. It needs to call 
     * getPlaceValue() to find out what value to multiply the
     * index's place by.</p>
     *
     * @param m is the MIXChar[] to be packed into a long[]
     * It will be at most 11 long.
     * @return the long value to be stored in the instance variable.
     */
     public long pack(MIXChar[] m) {
        long sum = 0;

        for (int i = m.length - 1; i >= 0; i--) {
            long placeValue = getPlaceValue(i);
            long placeValueByMixOrdinal = placeValue * m[i].ordinal();
            sum += placeValueByMixOrdinal;
        }

        return sum;
     }
     /**
     * <p>This is a helper method to find the place value of
     * a base 55 number (55 ^ 0, 55 ^ 1, 55 ^ 2, etc.). It
     * calculates these values using a for loop.</p>
     *
     * @param place is the value corresponding to the index
     * of the loop this method is called within.
     * @return a long value representing the place value
     * of a base 55 number.
     */
     private static long getPlaceValue(int place) {
        final long base = 56;
        long placeValue = base;

        if (place == 0) {
            placeValue = 1;
        } else {
            for (int i = 0; i < place - 1; i++) {
                placeValue *= base;
            }
        }
        return placeValue;
    }

    /**
     * <p>This is a special toString method because it must
     * first decode the message to display it as a string.
     * It calls two helper methods to accomplish this.</p>
     *
     * @return the String of the original decoded message.
     */
    @Override
    public String toString() {
        ArrayList<Integer> completeOrdinalValueArray = 
                new ArrayList<Integer>();
        int messageLength = this.arr.length;
        int numFullyPackedLongs = messageLength - 1;
        int lengthOfPartlyPackedLong = this.count - (numFullyPackedLongs 
                * FULL_PACK_SIZE);

        for (int i = 0; i < numFullyPackedLongs; i++) {
            long[] tempArray = decodeFullLong(this.arr[i]);
            for (long tempLong : tempArray) {
                int tempInt = (int) tempLong;
                completeOrdinalValueArray.add(tempInt);
            }
        }
        long [] tempArray = decodePartialLong(lengthOfPartlyPackedLong,
                this.arr[messageLength - 1]);
        for (long tempLong : tempArray) {
            int tempInt = (int) tempLong;
            completeOrdinalValueArray.add(tempInt);
        }
        String result = "";
        for (int i : completeOrdinalValueArray) {
            MIXChar tempMix = new MIXChar(i);
            char tempChar = tempMix.toChar();
            result += tempChar;
        }
        return "This is the decoded result: \n" + result;
    }
    /**
     * <p>This method uses the usual base conversion algorithm
     * (written using a for loop and unsigned long division and 
     * remainder operators) to decode a long value from the 
     * long[] instance variable. This method is specially
     * designed for partly packed long values.</p>
     *
     * @param lengthOfPartlyPackedLong is the length of the partly
     * packed long to decode. This is used to tell the for loop
     * how many times to iterate.
     * @param partialLong 
     * @return a long[] representing the ordinal values of the 
     * MIXChars that comprise the original String. It will always be
     * between 0 and 11 (exclusive) long.
     */
     public long[] decodePartialLong(int lengthOfPartlyPackedLong,
            long partialLong) {
        long[] mixOrdinalArray = new long[lengthOfPartlyPackedLong];

        for (int i = 0; i < lengthOfPartlyPackedLong; i++) {
            mixOrdinalArray[i] = 
                    Long.remainderUnsigned(partialLong, BASE);
            partialLong = Long.divideUnsigned(partialLong, BASE);
        }
        return mixOrdinalArray;
     }
     /**
     * <p>This method uses the usual base conversion algorithm
     * (written using a for loop and unsigned long division and 
     * remainder operators) to decode a long value from the 
     * long[] instance variable. I probably should have overloaded
     * this method for the partial long but I realized too late and
     * ran out of time.</p>
     *
     * @param fullLong is the fully packed long to decode.
     * @return a long[] representing the ordinal values of the 
     * MIXChars that comprise the original String. It will always
     * be size 11 long.
     */
     public long[] decodeFullLong(long fullLong) {
        long[] mixOrdinalArray = new long[FULL_PACK_SIZE];

        for (int i = 0; i < FULL_PACK_SIZE; i++) {
            mixOrdinalArray[i] = Long.remainderUnsigned(fullLong, BASE);
            fullLong = Long.divideUnsigned(fullLong, BASE);
        }
        return mixOrdinalArray;
     }
     /**
     * <p>The toLongs method shows the long[] values without
     * overflow errors.</p>
     *
     * @return the String representation of the unsigned longs stored
     * by the long[]. This shows the long values without overflow.
     */
     public String toLongs() {
        String result = "This is the long[] as unsigned strings: \n[";
        for (long longIndex : this.arr) {
            String longString = Long.toUnsignedString(longIndex);
            result += longString + ", ";
        }
        result += "]";
        return result;
     }
    /**
     * <p>This is an accessor for the base variable.</p>
     * @return BASEE
     */
    public int getBASE() {
        return BASE;
    }
    /**
     * <p>This is an accessor for the pack size.</p>
     * @return FULL_PACK_SIZE
     */
    public int getFULL_PACK_SIZE() {
        return FULL_PACK_SIZE;
    }
    /**
     * <p>Tis is an accessor for the array instance variable.</p>
     * @return the arr
     */
    public long[] getArr() {
        return arr;
    }
    /**
     * <p>This is an accessor for the count.</p>
     * @return the count
     */
    public int getCount() {
        return count;
    }
     

}
