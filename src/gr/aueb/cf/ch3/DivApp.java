package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μια απλή διαίρεση. Διαίρεση με 0
 * απαγορεύεται στους ακεραίους της Java.
 * Δίνει ArithmeticException.
 */
public class DivApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator, denominator:");
        numerator = in.nextInt();
        denominator = in.nextInt();

        if (denominator == 0) {
            System.out.println("Error. Denominator can not be zero");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.println("Result: " + result);
    }
}
