package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Finds and returns the position of an array's maximum value
 * by calling a method.
 */
public class MaxPositionApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = {3, 9, 7, 34, 44, 12, 69, 5};
        int low = 0;
        int high = 0;
        int maxPosition = 0;

        // Get positions of low & high from user input in a user friendly way:
        System.out.printf("Please give low and high between: 1, %d", arr.length);
        System.out.println();

        // Store it as it should be (arr[0] = 1st value, arr[arr.length - 1] = max value)
        low = in.nextInt() - 1;
        high = in.nextInt() - 1;

        // Call method
        maxPosition = getMaxPosition(arr, low, high);


        // Exclude wrong inputs
        if (maxPosition == -1) {
            System.out.println("No such element");
            System.exit(1);
        }

        // Print final result
        System.out.printf("Max position: %d, Max Value: %d", maxPosition + 1, arr[maxPosition]);
    }


    public static int getMaxPosition(int[] arr,int low, int high) {
        int maxValue = arr[low];
        int maxPosition = low;

//        if ((arr == null) || (arr.length < 1)) return -1;         // No need for these checks since we declared the exact values of the array.

        if ( (low < 0) || (high > arr.length) || (low > high) ) {
            return -1;
        }

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue ) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }

}
