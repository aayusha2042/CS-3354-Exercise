import java.util.Scanner;

/**
 * Provides a menu-driven program that calculates the area of a square,
 * circle, or triangle.
 */
public class AreaProgram {
  private static final int SQUARE_OPTION = 1;
  private static final int CIRCLE_OPTION = 2;
  private static final int TRIANGLE_OPTION = 3;
  private static final int EXIT_OPTION = 4;

  /**
   * Runs the area calculator until the user chooses to exit.
   *
   * @param args command-line arguments; not used by this program
   */
  public static void main(String[] args) {
    // Create a Scanner to collect keyboard input.
    try (Scanner keyboard = new Scanner(System.in)) {

    // Store the menu option selected by the user.
    int option;

    // Continue displaying the menu until the user selects Exit.
    do {
      displayMenu();

      // Ask the user to select an option.
      System.out.print("Enter the desired option [1-4]: ");
      option = keyboard.nextInt();
      System.out.println();

      // Perform the action that matches the selected option.
      switch (option) {
        case SQUARE_OPTION -> {
          // Ask for the side length.
          System.out.print("Enter the side length: ");
          double sideLength = keyboard.nextDouble();

          // Calculate and display the square's area.
          double squareArea = calculateSquareArea(sideLength);
          System.out.println("Area of the square: " + squareArea);
          System.out.println();
        }

        case CIRCLE_OPTION -> {
          // Ask for the radius.
          System.out.print("Enter the radius: ");
          double radius = keyboard.nextDouble();

          // Calculate and display the circle's area.
          double circleArea = calculateCircleArea(radius);
          System.out.println("Area of the circle: " + circleArea);
          System.out.println();
        }

        case TRIANGLE_OPTION -> {
          // Ask for the base and height.
          System.out.print("Enter the base: ");
          double base = keyboard.nextDouble();

          System.out.print("Enter the height: ");
          double height = keyboard.nextDouble();

          // Calculate and display the triangle's area.
          double triangleArea = calculateTriangleArea(base, height);
          System.out.println("Area of the triangle: " + triangleArea);
          System.out.println();
        }

        case EXIT_OPTION -> {
          // End the program.
          System.out.println("Exiting the program.");
        }

        default -> {
          // Display an error message for an invalid option.
          System.out.println(
              "Invalid option. Please select a number from 1 to 4.");
          System.out.println();
        }
      }
    } while (option != EXIT_OPTION);

    }
  }

  /**
   * Displays the area calculator menu.
   */
  public static void displayMenu() {
    System.out.println("=== AREA CALCULATOR ===");
    System.out.println();
    System.out.println("1. Area of a Square");
    System.out.println("2. Area of a Circle");
    System.out.println("3. Area of a Triangle");
    System.out.println("4. Exit");
    System.out.println();
  }

  /**
   * Calculates the area of a square.
   *
   * @param sideLength side length of the square
   * @return area of the square
   */
  public static double calculateSquareArea(double sideLength) {
    return sideLength * sideLength;
  }

  /**
   * Calculates the area of a circle.
   *
   * @param radius radius of the circle
   * @return area of the circle
   */
  public static double calculateCircleArea(double radius) {
    return Math.PI * radius * radius;
  }

  /**
   * Calculates the area of a triangle.
   *
   * @param base base of the triangle
   * @param height height of the triangle
   * @return area of the triangle
   */
  public static double calculateTriangleArea(double base, double height) {
    return 0.5 * base * height;
  }
}