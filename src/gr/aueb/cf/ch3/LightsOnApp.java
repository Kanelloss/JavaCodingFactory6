package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τα φώτα ενός αυτοκινήτου ανάβουν όταν
 * βρέχει και ταυτόχρονα είτε είναι σκοτάδι
 * ή τρέχει με ταχύτητα υψηλή. Ο χρήστης εισάγει
 * τα τρία παραπάνω στοιχεία και το πρόγραμμα εκτυπώνει
 * αν τα φώτα ανάβουν ή όχι.
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        final int MAXSPEED = 100;
        boolean areLightsOn = false;

        System.out.println("Please insert if it is raining: ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark: ");
        isDark = in.nextBoolean();

        System.out.println("Please insert speed: ");
        speed = in.nextInt();

        isRunning = speed >= MAXSPEED;
        areLightsOn = (isRaining && isRunning) || (isRaining && isDark);

        System.out.println("The lights are on: " + areLightsOn);


        //System.out.println("The lights are on: " + (isRaining && (isDark || speed > MAXSPEED)));
    }
}
