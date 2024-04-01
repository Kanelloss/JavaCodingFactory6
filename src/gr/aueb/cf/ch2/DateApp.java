package gr.aueb.cf.ch2;

// Import Scanner Method.
import java.util.Scanner;

public class DateApp {

    public static void main(String[] args) {

        // Call Scanner Method and initialise variables.
        Scanner in = new Scanner(System.in);

        int inputDay, inputMonth, inputYear;

        // Ask user to insert day, month, year as an integer.
        System.out.println("Please insert day:");
        inputDay = in.nextInt();

        System.out.println("Please insert month:");
        inputMonth = in.nextInt();

        System.out.println("Please insert year:");
        inputYear = in.nextInt();

        // Prints date in the form of: DD/MM/YY
        System.out.printf("Date is: %02d / %02d / %02d", inputDay, inputMonth, inputYear);

    }
}
