package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο και
 * εκτυπώνεται η απόλυτη τιμή του.
 */
public class AbsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please insert an integer");
        num = in.nextInt();

        abs = (num > 0) ? num : -num;

        System.out.printf("Absolute of %d: %d", num, abs);
    }
}
