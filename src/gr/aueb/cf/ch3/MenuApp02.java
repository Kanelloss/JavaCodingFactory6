package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Presents a menu between 1-5 to the user which is repeated
 * until the user types number 5.
 * For every other choice it will provide feedback
 * (right or wrong).
 */
public class MenuApp02 {

    public static void main(String[] args) {

        // Initialisation of variables
        Scanner in = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Choose one of the below:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            choice = in.nextInt();

            // Commands
            if (choice < 0 || choice > 5) {
                System.out.println("Wrong input, please type again.");
            } else if (choice == 1) {
                System.out.println("You have chosen: Insert");
            } else if (choice == 2) {
                System.out.println("You have chosen: Delete");
            } else if (choice == 3) {
                System.out.println("You have chosen: Update");
            } else if (choice == 4) {
                System.out.println("You have chosen: Search");
            } else {
                System.out.println("You have chosen: Exit");
            }
        } while (choice!= 5);

        // Printing outcome
        System.out.println("Goodbye!");
    }
}
