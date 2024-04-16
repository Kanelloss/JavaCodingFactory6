package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει ένα μενού επιλογών και ανάλογα
 * με την επιλογή του χρήστη δίνει feedback.
 */
public class MenuSwitchApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω (0 για έξοδο):");
            System.out.println("1. One-Player Game");
            System.out.println("2. Two-Player Game");
            System.out.println("3. Team Game");

            choice = in.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    System.out.println( "Start One-Player Game");
                    break;
                case 2:
                    System.out.println("Start Two-Player Game");
                    break;
                case 3:
                    System.out.println("Start Team Game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != 0);

        System.out.println("Thank you for playing the game!");
    }
}
