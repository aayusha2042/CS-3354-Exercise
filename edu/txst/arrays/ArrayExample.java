package edu.txst.arrays;

/**
 * Demonstrates Java arrays containing object references
 * and primitive values.
 *
 * @author Aayusha Adhikari
 */
public class ArrayExample {

    /**
     * A simple class used to demonstrate storing object
     * references inside an array.
     */
    static class Weeble {
        // This class does not need fields because it is only
        // being used to demonstrate an array of objects.
    }

    /**
     * Creates different types of arrays and demonstrates
     * how their elements are initialized and accessed.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // This creates an array that can hold four Weeble references.
        // The positions initially contain null because the actual
        // Weeble objects have not been created yet.
        Weeble[] weebles = new Weeble[4];

        for (int i = 0; i < weebles.length; i++) {
            if (weebles[i] == null) {
                weebles[i] = new Weeble();
            }
        }

        // An int array stores primitive integer values.
        // Java initializes each position to 0 automatically.
        int[] numbers = new int[20];

        // A String array stores references to String objects.
        // Its positions initially contain null.
        String[] names = new String[20];

        // My modification: change values in the primitive and
        // String arrays and print them to show array access.
        numbers[0] = 50;
        names[0] = "Aayusha";

        System.out.println("First integer: " + numbers[0]);
        System.out.println("First name: " + names[0]);
        System.out.println("Number of Weeble objects: " + weebles.length);
    }
}