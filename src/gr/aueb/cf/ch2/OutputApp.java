package gr.aueb.cf.ch2;

/*
 Output Demo.
 */

import java.util.Locale;

public class OutputApp {

    public static void main(String[] args) {
        int num = 1;
        long num2 = 2076899L;

        /* System.out.println("Hello");
        System.out.print("Hello2");
        System.out.println();
        System.out.printf("Hello");

        System.out.println("Num is: " + num);
        System.out.printf("Num is %d", num);*/

        System.out.printf(Locale.forLanguageTag("el"), "Num is: %04d, Num2 is: %,02d", num, num2);
    }
}
