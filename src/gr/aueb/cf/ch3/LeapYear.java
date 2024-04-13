package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The user types a year (integer)
 * and the program prints if it is a leap
 * year or not.
 */
public class LeapYear {

    public static void main(String[] args) {

        // Initialisation of variables
        Scanner in  = new Scanner(System.in);
        int year = 0;
        boolean leapYear = false;

        System.out.println("Please insert year:");
        year = in.nextInt();

        // Commands
        if (year % 4 == 0) {
            leapYear = true;
        }
        if (year % 100 == 0 && year % 400 != 0) {
            leapYear = false;
        }

        // Printing outcome
        System.out.println("Inserted year is a leap year: " + leapYear);

    }
}
