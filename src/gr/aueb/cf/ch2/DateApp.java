package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Asks the user to type day/month/year as integers and prints it in the form of: DD-MM-YY.
 */
public class DateApp {

    public static void main(String[] args) {

        // Initialise variables
        Scanner in = new Scanner(System.in);
        int inputDay =0;
        int inputMonth = 0;
        int inputYear =0;

        // Commands
        System.out.println("Please insert day:");
        inputDay = in.nextInt();

        System.out.println("Please insert month:");
        inputMonth = in.nextInt();

        System.out.println("Please insert year:");
        inputYear = in.nextInt();
        inputYear %= 100; // Transforms YYYY to YY (e.g. 2024 to 24)



        // Prints date in the form of: DD/MM/YY
        System.out.printf("Date is: %02d / %02d / %02d", inputDay, inputMonth, inputYear);

    }
}
