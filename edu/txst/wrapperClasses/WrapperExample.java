package edu.txst.wrapperClasses;

/**
 * Demonstrates how the Integer wrapper class can be used
 * with integer values and how a String can be converted
 * into an int.
 *
 * @author Aayusha Adhikari
 */
public class WrapperExample {

    /**
     * Runs the wrapper class example.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Integer is the wrapper class for the primitive type int.
        // Java automatically converts the value 25 into an Integer object.
        Integer intNumber = 25;
        System.out.println("Integer value: " + intNumber);

        // This looks like a number, but it is stored as a String.
        String strNumber = "75";

        // parseInt converts the String value into an int so it
        // can be used as a number.
        int convertedNumber = Integer.parseInt(strNumber);
        System.out.println("Converted integer value: " + convertedNumber);

        // My modification: use the converted number in a calculation
        // to show that it is now treated as a numeric value.
        System.out.println("Converted number + 10: "
                + (convertedNumber + 10));
    }
}