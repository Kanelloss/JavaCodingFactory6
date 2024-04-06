package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
Asks the user to type an integer value of temperature in Fahrenheit and converts it to Celsius.
 */
public class TemperatureApp {

    public static void main(String[] args) {

        // Initialise variables.
        Scanner in = new Scanner(System.in);
        int inputTemp = 0;
        int celsiusTemp =0;

        // Commands
        System.out.println("Please insert temperature in Fahrenheit:");
        inputTemp = in.nextInt();
        celsiusTemp = 5 * (inputTemp-32)/9; //Convert Fahrenheit to Celsius.

        // Print final result.
        System.out.printf("Temperature equals to: %d degrees Celsius.", celsiusTemp);

    }
}
