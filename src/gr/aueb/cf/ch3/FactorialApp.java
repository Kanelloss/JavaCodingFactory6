package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n.
 * Δηλαδή 1*2*3*...*n.
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = 0;
        int result = 1;

        System.out.println("Please insert n:");
        n = in.nextInt();

        while (i <=n) {
            result *= i;
            i++;
        }

        System.out.printf("%d! = %d",n, result);
    }
}
