package edu.txst.arrays;

import java.util.ArrayList;

/**
 * Demonstrates how an ArrayList stores and manages
 * a collection of String objects.
 *
 * @author Aayusha Adhikari
 */
public class ArrayListExample {

    /**
     * Creates an ArrayList, adds and removes elements,
     * and displays the contents of the list.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // ArrayList stores objects and can change its size as
        // elements are added or removed.
        ArrayList<String> countries = new ArrayList<String>();

        countries.add("Nepal");
        countries.add("Italy");
        countries.add("Thailand");

        // A for-each loop visits every element currently
        // stored in the ArrayList.
        System.out.println("Original countries:");
        for (String country : countries) {
            System.out.println(country);
        }

        // My modification: add another country and remove one.
        // Unlike a regular array, the ArrayList adjusts its
        // number of elements automatically.
        countries.add("Japan");
        countries.remove("Italy");

        System.out.println("\nUpdated countries:");
        for (String country : countries) {
            System.out.println(country);
        }

        // size() gives the current number of elements,
        // rather than a fixed array capacity.
        System.out.println("Number of countries: " + countries.size());
    }
}