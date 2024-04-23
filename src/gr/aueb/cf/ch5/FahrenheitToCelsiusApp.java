package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Μετατρέπει βαθμούς Fahrenheit σε Celsius.
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        for (int i = -100; i <= 100; i+=10) {
            System.out.printf("%4d\u2109\t=\t%6.2f\u2103\n", i, getCelsiusFromFarenheit(i));
        }
    }

    /**
     * Converts     Fahrenheit degrees to Celsius.
     * @param fahrenheit    Fahrenheit Temperature
     * @return  Celsius degrees
     */
    public static double getCelsiusFromFarenheit(double fahrenheit) {
        return 5 * (fahrenheit-32) / 9;
    }
}
