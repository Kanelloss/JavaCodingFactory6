package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει μια θερμοκρασία (ακέραια τιμή) από το
 * standard input καθώς και μια boolean τιμή που
 * αντιστοιχεί στο αν βρέχει και αποφασίζει αν
 * χιονίζει (βρέχει ΚΑΙ θερμοκρασία < 0).
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert outside temperature:");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);
        System.out.println("Is snowing: " + isSnowing);
    }
}
