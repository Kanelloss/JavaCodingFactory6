package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει δύο ακεραίους μέχρι
 * ο αριθμητής να είναι 0.
 * Το πρόγραμμα ελέγχει τον παρονομαστή
 * αν είναι 0, και αν είναι 0 δίνει τη δυνατότητα
 * στο χρήστη να συνεχίσει δίνοντας παρονομαστή
 * διάφορο του 0.
 */
public class WhileDivApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert two integers for division: (Numerator 0 for exit)");
            numerator = in.nextInt();
            denominator = in.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is zero");
                break;
            }

            if (denominator == 0) {
                System.out.println("Denominator should not be zero, please insert again");
                continue;       // αυτόματα γυρίζει πίσω στη while (στην επόμενη επανάληψη).
            }
            result = numerator / denominator;
            System.out.printf("%d / %d = %d\n", numerator, denominator, result);
        }
        System.out.println("Goodbye!");
    }
}
