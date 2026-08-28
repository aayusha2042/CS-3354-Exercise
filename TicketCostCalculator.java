/*
 * Name: Aayusha Adhikari
 * Course: CS3354
 * Program: Ticket Cost Calculator
 * Description: This program asks the user how many tickets they want,
 * calculates the total cost at $15 per ticket, and displays the result.
 */

// Imports the Scanner class so the program can read keyboard input.
import java.util.Scanner;

public class TicketCostCalculator {
    public static void main(String[] args) {
        // Creates a Scanner object to receive input from the user.
        Scanner input = new Scanner(System.in);

        // Stores the price of one ticket as a constant.
        final int TICKET_PRICE = 15;

        // Prompts the user to enter the number of tickets.
        System.out.print("Enter the number of tickets you wish to purchase: ");

        // Reads and stores the number entered by the user.
        int numberOfTickets = input.nextInt();

        // Multiplies the number of tickets by the price of one ticket.
        int totalCost = numberOfTickets * TICKET_PRICE;

        // Displays the calculated total cost.
        System.out.println("The total cost is $" + totalCost + ".");

        // Closes the Scanner after input is complete.
        input.close();
    }
}