package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ελέγχει αν ένας ακέραιος είναι άρτιος ή όχι.
 */
public class IsEvenApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert an integer:");
        num = in.nextInt();

        System.out.printf("Given number is even: " + isEven(num));
    }

    public static boolean isEven(int num) {
//        if (num % 2 == 0) {
//            return true;
//        } else
//            return false;

        return num % 2 == 0;
    }
}
