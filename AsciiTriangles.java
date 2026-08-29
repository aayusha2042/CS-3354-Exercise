/*
 * Name: Aayusha Adhikari
 * Course: CS3354
 * Exercise 3: ASCII-Art Triangles
 * Description: Generates two upright triangles on the top row and two
 * inverted triangles on the bottom row.
 */

public class AsciiTriangles {
    public static void main(String[] args) {
        final int SIZE = 5;

        // Generate the two upright triangles.
        for (int row = 1; row <= SIZE; row++) {
            // Print the left triangle.
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            // Print the spaces between the triangles.
            for (int space = 1;
                 space <= 2 * (SIZE - row) + 1;
                 space++) {
                System.out.print(" ");
            }

            // Print the right triangle.
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Generate the two inverted triangles.
        for (int row = SIZE; row >= 1; row--) {
            // Print the bottom-left triangle.
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            // Increase the spaces as the triangles get smaller.
            for (int space = 1;
                 space <= 2 * (SIZE - row) + 1;
                 space++) {
                System.out.print(" ");
            }

            // Complete the missing bottom-right triangle.
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}