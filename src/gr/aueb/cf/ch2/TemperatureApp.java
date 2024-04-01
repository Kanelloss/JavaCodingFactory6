package gr.aueb.cf.ch2;
/*
Asks the user to type an integer value of temperature in Fahrenheit and converts it to Celsius.
 */
//

// Import Scanner method.
import java.util.Scanner;
public class TemperatureApp {

    public static void main(String[] args) {

        // Call scanner method and initialise variables.
        Scanner in = new Scanner(System.in);
        int inputTemp;
        int celsiusTemp;

        // Ask the user to insert a temperature.
        System.out.println("Please insert temperature in Fahrenheit");

        // Commands
        inputTemp = in.nextInt();
        celsiusTemp = 5 * (inputTemp-32)/9;

        // Print final result.
        System.out.printf("Temperature equals to: %d degrees Celsius.", celsiusTemp);

    }
}
