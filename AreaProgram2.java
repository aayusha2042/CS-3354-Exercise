import java.util.Scanner;

/**
 * Provides a menu-driven calculator for the areas of a square, circle, and triangle.
 */
public class AreaProgram2 {
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
    Scanner keyboard = new Scanner(System.in);
    int option;

    do {
      displayMenu();
      System.out.print("Enter the desired option [1-4]: ");
      option = keyboard.nextInt();
      System.out.println();

      switch (option) {
        case SQUARE_OPTION:
          System.out.print("Enter the side length: ");
          double sideLength = keyboard.nextDouble();
          double squareArea = calculateSquareArea(sideLength);
          System.out.printf("Area of the square: %.2f%n%n", squareArea);
          break;
        case CIRCLE_OPTION:
          System.out.print("Enter the radius: ");
          double radius = keyboard.nextDouble();
          double circleArea = calculateCircleArea(radius);
          System.out.printf("Area of the circle: %.2f%n%n", circleArea);
          break;
        case TRIANGLE_OPTION:
          System.out.print("Enter the base: ");
          double base = keyboard.nextDouble();
          System.out.print("Enter the height: ");
          double height = keyboard.nextDouble();
          double triangleArea = calculateTriangleArea(base, height);
          System.out.printf("Area of the triangle: %.2f%n%n", triangleArea);
          break;
        case EXIT_OPTION:
          System.out.println("Exiting the program.");
          break;
        default:
          System.out.println("Invalid option. Please select a number from 1 to 4.\n");
      }
    } while (option != EXIT_OPTION);

    keyboard.close();
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
