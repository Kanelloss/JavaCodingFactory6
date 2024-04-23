package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει μια ακολουθία ακεραίων
 * που πιθανώς τελειώνει με το 0 και το πρόγραμμα
 * υπολογίζει τα min, max, average.
 */
public class MinMaxAverageApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        int average = 0;
        int sum = 0;

        System.out.println("Please insert a sequence of integers (0 for end)");
        while ((num = in.nextInt()) != 0) {

            if(num < min) {
                min = num;
            }

            if(num > max) {
                max = num;
            }

            sum += num;
            count++;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Average: %.2f", ((double) sum/count));
    }
}
