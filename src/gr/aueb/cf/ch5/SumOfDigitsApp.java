package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates the sum of the digits of an int.
 * For example the sum of digits of 571 => 13.
 */
public class SumOfDigitsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert an int:");
        num = in.nextInt();

        System.out.printf("Sum of digits of %d = %d", num, getSumOfDigits(num));
    }

    /**
     * Gets the sum of digits of the input number.
     * @param num the input number
     * @return the sum of digits
     */
    public static int getSumOfDigits(int num) {
        int left = num;
        int rightDigit = 0;
        int sum = 0;
        do {
            rightDigit = left % 10;
            left = left / 10;
            sum += rightDigit;
        } while (left != 0);

        return sum;
    }
}
