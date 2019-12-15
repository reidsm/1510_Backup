package q3;

/**
 * <p>The MIXChar class basically re-assigns ASCII values
 * to some java characters based on the KNUTH computer.</p>
 *
 * @author Scott Reid A01160090
 * @version 1.0
 */

public class MIXChar {
    /**
    * DELTA is the Unicode character for delta.
    */
    private static final char DELTA = '\u0394';
    /**
    * SIGMA is the Unicode character for sigma.
    */
    private static final char SIGMA = '\u03A3';
    /**
    * PI is the Unicode character for pi.
    */
    private static final char PI = '\u03A0';
    /**
    * The digit instance variable stores the character part of
    * the MIX character.
    */
    private char digit;
    /**
    * The ordinal stores the "new ASCII value" of the Knuth
    * MIX character.
    */
    private int ordinal;
     /**
     * <p>This is the constructor for creating a MIX 
     * Character by passing in a char. It basically determines
     * which range the character is in and calls a different method
     * to associate the char with the right ordinal value.</p>
     *
     * @param c is the character to be turned into a MIX Char.
     */
    public MIXChar(char c) {
        final int ordOffset8 = 8;
        final int ordOffset9 = 9;
        final int ordOffset10 = 10;
        final int ordOffset17 = 17;
        final int ordOffset20 = 20;
        final int ordOffset21 = 21;
        final int ordOffset18 = 18;
        final int ordOffset26 = 26;
        if (isMIXChar(c)) {
            if (c == ' ') {
                this.digit = c;
                this.ordinal = 0;
            } else if (c - 'A' >= 0 && c - 'A' <= ordOffset8) {
                this.digit = c;
                this.ordinal = aThruIOrdinal(c);
            } else if (c == DELTA) {
                this.digit = c;
                this.ordinal = ordOffset10;
            } else if (c - 'A' >= ordOffset9 && c - 'A' <= ordOffset17) {
                this.digit = c;
                this.ordinal = jThruROrdinal(c);
            } else if (c == SIGMA) {
                this.digit = c;
                this.ordinal = ordOffset20;
            } else if (c == PI) {
                this.digit = c;
                this.ordinal = ordOffset21;
            } else if (c - 'A' >= ordOffset18 && c - 'A' <= ordOffset26) {
                this.digit = c;
                this.ordinal = rThruZOrdinal(c);
            } else if (c - '0' >= 0 && c - '0' <= ordOffset9) {
                this.digit = c;
                this.ordinal = digitOrdinal(c);
            } else if (isPunct(c)) {
                this.digit = c;
                this.ordinal = punctOrdinal(c);
            }

        } else {
            throw new IllegalArgumentException("That is not a "
                    + "valid MIX Character.");
        }
    }
    /**
     * <p>This is the Constructor for creating a MIX Char based on its
     * ordinal value. This is needed for use by the decoding functions.</p>
     *
     * @param ordinal is the ordinal value to be turned into a MIXChar. 
     */
    public MIXChar(int ordinal) {
        final int ordOffset55 = 55;
        final int ordOffset9 = 9;
        final int ordOffset1 = 1;
        final int ordOffset10 = 10;
        final int ordOffset11 = 11;
        final int ordOffset19 = 19;
        final int ordOffset20 = 20;
        final int ordOffset21 = 21;
        final int ordOffset22 = 22;
        final int ordOffset29 = 29;
        final int ordOffset30 = 30;
        final int ordOffset39 = 39;
        final int ordOffset40 = 40;
        if (ordinal >= 0 && ordinal <= ordOffset55) {
            if (ordinal == 0) {
                this.digit = ' ';
                this.ordinal = ordinal;
            } else if (ordinal >= ordOffset1 && ordinal <= ordOffset9) {
                this.ordinal = ordinal;
                this.digit = aThruIDigit(ordinal);
            } else if (ordinal == ordOffset10) {
                this.ordinal = ordinal;
                this.digit = DELTA;
            } else if (ordinal >= ordOffset11 && ordinal <= ordOffset19) {
                this.ordinal = ordinal;
                this.digit = jThruRDigit(ordinal);
            } else if (ordinal == ordOffset20) {
                this.ordinal = ordinal;
                this.digit = SIGMA;
            } else if (ordinal == ordOffset21) {
                this.ordinal = ordinal;
                this.digit = PI;
            } else if (ordinal >= ordOffset22 && ordinal <= ordOffset29) {
                this.ordinal = ordinal;
                this.digit = rThruZDigit(ordinal);
            } else if (ordinal >= ordOffset30 && ordinal <= ordOffset39) {
                this.ordinal = ordinal;
                this.digit = digitDigit(ordinal);
            } else if (ordinal >= ordOffset40 && ordinal <= ordOffset55) {
                this.ordinal = ordinal;
                this.digit = punctDigit(ordinal);
            }
        } else {
            throw new IllegalArgumentException("That's not a valid mix "
                    + "character ordinal. Mix character ordinals are 0-55.");
        }
    }
    /**
     * <p>This function uses brute force conditionals to associate
     * punctuation with the right Knuth character because there's no
     * real pattern of the MIX characters and the punctuation in ASCII.</p>
     *
     * @param ordinalVal is the ordinal value to be turned into a MIXChar.
     * @return the character to be associated with the MIXChar based on
     * the Knuth computer.
     */
    public char punctDigit(int ordinalVal) {
        final int ordVal40 = 40;
        final int ordVal41 = 41;
        final int ordVal42 = 42;
        final int ordVal43 = 43;
        final int ordVal44 = 44;
        final int ordVal45 = 45;
        final int ordVal46 = 46;
        final int ordVal47 = 47;
        final int ordVal48 = 48;
        final int ordVal49 = 49;
        final int ordVal50 = 50;
        final int ordVal51 = 51;
        final int ordVal52 = 52;
        final int ordVal53 = 53;
        final int ordVal54 = 54;
        final int ordVal55 = 55;
        if (ordinalVal == ordVal40) {
            return '.';
        } else if (ordinalVal == ordVal41) {
            return ',';
        } else if (ordinalVal == ordVal42) {
            return '(';
        } else if (ordinalVal == ordVal43) {
            return ')';
        } else if (ordinalVal == ordVal44) {
            return '+';
        } else if (ordinalVal == ordVal45) {
            return '-';
        } else if (ordinalVal == ordVal46) {
            return '*';
        } else if (ordinalVal == ordVal47) {
            return '/';
        } else if (ordinalVal == ordVal48) {
            return '=';
        } else if (ordinalVal == ordVal49) {
            return '$';
        } else if (ordinalVal == ordVal50) {
            return '<';
        } else if (ordinalVal == ordVal51) {
            return '>';
        } else if (ordinalVal == ordVal52) {
            return '@';
        } else if (ordinalVal == ordVal53) {
            return ';';
        } else if (ordinalVal == ordVal54) {
            return ':';
        } else if (ordinalVal == ordVal55) {
            return '\'';
        } else {
            return ' ';
        }
    }
    /**
     * <p>This helper method uses a loop to compare the ASCII digit
     * values with the ordinal value of the Knuth MIX char.</p>
     *
     * @param ordinalVal is the ordinal value to be turned into a MIXChar.
     * @return the character to be associated with the MIXChar based on
     * the Knuth computer.
     */
    public char digitDigit(int ordinalVal) {
        final int ordOffset30 = 30;
        final int ordOffset48 = 48;
        final int ordOffset57 = 57;
        int asciiVal = '0' + ordinalVal - ordOffset30;
        char mix = ' ';
        for (int i = ordOffset48; i <= ordOffset57; i++) {
            if (i == asciiVal) {
                mix = (char) asciiVal;
            }
        }
        return mix;
    }
    /**
     * <p>This helper method uses a for loop to compare the ASCII
     * value to the Knuth MIX Char.</p>
     *
     * @param ordinalVal is the ordinal value to be turned into a MIXChar.
     * @return the character to be associated with the MIXChar based on
     * the Knuth computer.
     */
    public char rThruZDigit(int ordinalVal) {
        final int ordOffset4 = 4;
        final int ordOffset83 = 83;
        final int ordOffset90 = 90;
        int asciiVal = 'A' + ordinalVal - ordOffset4;
        char mix = ' ';
        for (int i = ordOffset83; i <= ordOffset90; i++) {
            if (i == asciiVal) {
                mix = (char) asciiVal;
            }
        }
        return mix;
    }
    /**
     * <p>This is a helper method that uses a loop to compare
     * the ASCII value to the ordinal value and assign the right
     * char to the right ordinal value based on that.</p>
     *
     * @param ordinalVal is the ordinal value to be turned into a MIXChar.
     * @return the character to be associated with the MIXChar based on
     * the Knuth computer.
     */
    public char jThruRDigit(int ordinalVal) {
        final int ordOffset2 = 2;
        final int ordOffset72 = 72;
        final int ordOffset82 = 82;
        int asciiVal = 'A' + ordinalVal - ordOffset2;
        char mix = ' ';
        for (int i = ordOffset72; i <= ordOffset82; i++) {
            if (i == asciiVal) {
                mix = (char) asciiVal;
            }
        }
        return mix;
    }
    /**
     * <p>This helper method saves the Knuth character corresponding
     * to the right ordinal value by using a for loop to compare
     * the ordinal value + a Knuth offset to the ASCII characters.</p>
     *
     * @param ordinalVal is the ordinal value to be turned into a MIXChar.
     * @return the character to be associated with the MIXChar based on
     * the Knuth computer.
     */
    public char aThruIDigit(int ordinalVal) {
        final int ordOffset1 = 1;
        final int ordOffset65 = 65;
        final int ordOffset73 = 73;
        int asciiVal = 'A' + ordinalVal - ordOffset1;
        char mix = ' ';
        for (int i = ordOffset65; i <= ordOffset73; i++) {
            if (i == asciiVal) {
                mix = (char) asciiVal;
            }
        }
        return mix;
    }
    /**
     * <p>This function uses brute force conditionals to associate
     * punctuation with the right Knuth character because there's no
     * real pattern of the MIX characters and the punctuation in ASCII.</p>
     *
     * @param c is the character to be turned into a MIXChar. 
     * @return the int ordinal value of the MIXChar.
     */
    public int punctOrdinal(char c) {
        final int ordVal40 = 40;
        final int ordVal41 = 41;
        final int ordVal42 = 42;
        final int ordVal43 = 43;
        final int ordVal44 = 44;
        final int ordVal45 = 45;
        final int ordVal46 = 46;
        final int ordVal47 = 47;
        final int ordVal48 = 48;
        final int ordVal49 = 49;
        final int ordVal50 = 50;
        final int ordVal51 = 51;
        final int ordVal52 = 52;
        final int ordVal53 = 53;
        final int ordVal54 = 54;
        final int ordVal55 = 55;
        if (c == '.') {
            return ordVal40;
        } else if (c == ',') {
            return ordVal41;
        } else if (c == '(') {
            return ordVal42;
        } else if (c == ')') {
            return ordVal43;
        } else if (c == '+') {
            return ordVal44;
        } else if (c == '-') {
            return ordVal45;
        } else if (c == '*') {
            return ordVal46;
        } else if (c == '/') {
            return ordVal47;
        } else if (c == '=') {
            return ordVal48;
        } else if (c == '$') {
            return ordVal49;
        } else if (c == '<') {
            return ordVal50;
        } else if (c == '>') {
            return ordVal51;
        } else if (c == '@') {
            return ordVal52;
        } else if (c == ';') {
            return ordVal53;
        } else if (c == ':') {
            return ordVal54;
        } else if (c == '\'') {
            return ordVal55;
        } else {
            return -1;
        }
    }
    /**
     * <p>This helper method uses a loop to assign an ordinal
     * value to the MIXChar. The ordinal value is actually the
     * index of the loop plus a special Knuth-computer specific
     * offset.</p>
     *
     * @param c is the character to be turned into a MIXChar. 
     * @return the int ordinal value of the MIXChar.
     */
    public int digitOrdinal(char c) {
        final int ordOffset9 = 9;
        final int ordOffset30 = 30;
        int ordinalVal = 0;
        for (int i = 0; i <= ordOffset9; i++) {
            if (c - '0' == i) {
                ordinalVal = i + ordOffset30;
            }
        }
        return ordinalVal;
    }
    /**
     * <p>This helper method uses a loop to assign an ordinal
     * value to the MIXChar. The ordinal value is actually the
     * index of the loop plus a special Knuth-computer specific
     * offset.</p>
     *
     * @param c is the character to be turned into a MIXChar. 
     * @return the int ordinal value of the MIXChar.
     */
    public int rThruZOrdinal(char c) {
        final int ordOffset18 = 18;
        final int ordOffset26 = 26;
        final int ordOffset4 = 4;
        int ordinalVal = 0;
        for (int i = ordOffset18; i <= ordOffset26; i++) {
            if (c - 'A' == i) {
                ordinalVal = i + ordOffset4;
            }
        }
        return ordinalVal;
    }
    /**
     * <p>This helper method uses a loop to assign an ordinal
     * value to the MIXChar. The ordinal value is actually the
     * index of the loop plus a special Knuth-computer specific
     * offset.</p>
     *
     * @param c is the character to be turned into a MIXChar. 
     * @return the int ordinal value of the MIXChar.
     */
    public int jThruROrdinal(char c) {
        final int ordOffset2 = 2;
        final int ordOffset18 = 18;
        final int ordOffset9 = 9;
        int ordinalVal = 0;
        for (int i = ordOffset9; i <= ordOffset18; i++) {
            if (c - 'A' == i) {
                ordinalVal = i + ordOffset2;
            }
        }
        return ordinalVal;
    }
    /**
     * <p>This helper method uses a loop to assign an ordinal
     * value to the MIXChar. The ordinal value is actually the
     * index of the loop plus a special Knuth-computer specific
     * offset.</p>
     *
     * @param c is the character to be turned into a MIXChar. 
     * @return the int ordinal value of the MIXChar.
     */
    public int aThruIOrdinal(char c) {
        final int ordOffset1 = 1;
        final int ordOffset9 = 9;
        int ordinalVal = 0;
        for (int i = 0; i <= ordOffset9; i++) {
            if (c - 'A' == i) {
                ordinalVal = i + ordOffset1;
            }
        }
        return ordinalVal;
    }
    /**
     * <p>Method determines if a character is a Knuth punctuation
     * character. This is needed to determine which helper method
     * to call in the constructor.</p>
     *
     * @param c is the character to be determined if it is a 
     * MIXChar punctuation character.
     * @return a boolean whether or not the passed in character is a
     * punctuation character.
     */
    static boolean isPunct(char c) {
        final String punct = ".,()+-*/=$<>@;:'";
        boolean containsPunct = punct.indexOf(c) != -1;
        return containsPunct;

    }
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param c is the character to be determined if it is a MIXChar.
     * @return the boolean value for whether or not the passed in character
     * is a valid MIXChar.
     */
    static boolean isMIXChar(char c) {
        final String uppercaseLetters = "ACBDEFGHIJKLMNOPQRSTUVWXYZ";
        final String digits = "0123456789";
        final String punct = ".,()+-*/=$<>@;:'";
        final String greek = "\u0394\u03A3\u03A0";

        boolean containsUpper = uppercaseLetters.indexOf(c) != -1;
        boolean containsDigit = digits.indexOf(c) != -1;
        boolean containsPunct = punct.indexOf(c) != -1;
        boolean isGreek = greek.indexOf(c) != -1;
        boolean isSpace = c == ' ';

        return (containsUpper || containsDigit || containsPunct 
                || isGreek || isSpace);
    }
    /**
     * <p>This returns the char value of the MIXChar it's called on.</p>
     *
     * @return the digit instance variable (char type)
     */
    public char toChar() {
        return this.digit;
    }
    /**
     * <p>This returns the ordinal value of the MIXChar it's called on.</p>
     *
     * @return the int ordinal instance variable of the MIXChar.
     */
    public int ordinal() {
        return this.ordinal;
    }
    /**
     * <p>This method is used to turn a String passed in by the user
     * to be encoded into a usable MIXChar[] to be encoded.</p>
     *
     * @param s is usually a String to be encoded passed in by the user.
     * @return MIXChar[] which is usually a MIXChar[] representation of a 
     * String passed in by the user.
     */
    public static MIXChar[] toMIXChar(String s) {
        int arrayLength = s.length();
        MIXChar[] mixArray = new MIXChar[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            char temp = s.charAt(i);
            mixArray[i] = new MIXChar(temp);
        } 

        return mixArray;
    }

    /**
     * <p>This is a toString method used to display both the char
     * and the ordinal value of a MIXChar.</p>
     *
     * @return the String value of a MIXChar in the form of 
     * |c #|
     */
    @Override
    public String toString() {
        return "| " + this.digit + " " + this.ordinal + " |";
    }
    /**
     * <p>This method is used to display a MIXChar[] as a regular String.</p>
     *
     * @param arr is a MIXChar[] to be converted to a regular String.
     * @return a String version of the MIXChar[] passed in.
     */
    public static String toString(MIXChar[] arr) {
        String result = "";
        for (MIXChar mix : arr) {
            result += mix.toChar();
        }
        return result;
    }

}
