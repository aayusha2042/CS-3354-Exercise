/*
 * Name: Aayusha Adhikari
 * Course: CS3354
 * Exercise 2: Temperature Classifier
 * Description: Reads a Fahrenheit temperature and classifies it.
 */

import java.util.Scanner;

public class TemperatureClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read one integer temperature from the user.
        System.out.print("Enter the temperature in degrees Fahrenheit: ");
        int temperature = input.nextInt();

        // Classify the temperature using an if-else structure.
        if (temperature <= 32) {
            System.out.println("Freezing");
        } else if (temperature <= 50) {
            System.out.println("Cold");
        } else if (temperature <= 85) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }

        input.close();
    }
}