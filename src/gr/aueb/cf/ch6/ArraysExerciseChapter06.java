package gr.aueb.cf.ch6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Applies several methods to arrays.
 */
public class ArraysExerciseChapter06 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int position = 0;
        int[] arr = {-5, 65, 7, 3, -18, 22, 90, -102, 6, 12, -15, 16, 19, 30};
        int choice = 0;
        boolean isOnePositive = false;
        boolean isAllPositive = false;

        do {
            System.out.println("Please select a method:");
            System.out.println("1. Search for a number inside the array.");
            System.out.println("2. Filter and print only the even numbers of the array.");
            System.out.println("3. Multiply the value of each array element by 2.");
            System.out.println("4. Check if there is at least one positive number inside the array.");
            System.out.println("5. Check if all numbers inside the array are positive.");
            System.out.println("6. Exit.");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    position = getPosition(arr);
                    if (position == -1) {
                        System.out.println("Integer not found in Array!");
                    } else {
                        System.out.printf("Given integer was found in position number: %d\n", position + 1);
                    }
                    break;
                case 2:
                    printEvenNumbers(arr);
                    break;
                case 3:
                    int[] doubleArray = DoubleArray(arr);
                    System.out.println("New array elements: ");
                    for ( int item :  doubleArray) {
                        System.out.print(item + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    isOnePositive = isOnePositiveM(arr);
                    System.out.println("There is at least one positive number inside the array: " + isOnePositive);
                    break;
                case 5:
                    isAllPositive = isAllPositiveM(arr);
                    System.out.println("All numbers inside the array are positive: " + isAllPositive);
                    break;
                case 6:
                    System.out.println("You have chosen: Exit!");
                    break;
                default:
                    System.out.println("Wrong input! Please try again!");
                    break;
            }
        } while (choice != 6);

        System.out.println("Thank you!");
    }

    /**
     * Searches for an element inside an array
     * and returns the position of it as an integer.
     *
     * @param arr   the array
     * @return      the element's position
     */
    public static int getPosition(int[] arr) {
        boolean isFound = false;
        int position = 0;
        System.out.println("Please insert the integer you want to find:");
        final int KEY = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == KEY) {
                position = i;
                isFound = true;
            }
        }

        if (isFound) return position;
        else return -1;
    }

    /**
     * Returns the even numbers inside an array.
     *
     * @param arr       the array
     */
    public static void printEvenNumbers(int[] arr) {
        System.out.println("Even numbers inside the array are the following: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Receives an array and returns it as a new array
     * with each element multiplied by 2.
     *
     * @param arr   the initial array
     * @return      the new array
     */
    public static int[] DoubleArray(int[] arr) {

        int[] copyArray = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            copyArray[i] *= 2;
        }
        return copyArray;
    }

    /**
     * Checks if there is at least one positive number
     * inside an array.
     *
     * @param arr   the array
     * @return      the true/false result
     */
    public static boolean isOnePositiveM(int[] arr) {
        boolean isOnePositive = false;

        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] > 0) {
                isOnePositive = true;
            }
        }
        return isOnePositive;
    }

    /**
     * Checks if all numbers inside an array are positive.
     *
     * @param arr   the array
     * @return      the true/false result
     */
    public static boolean isAllPositiveM(int[] arr) {
        boolean isAllPositive = true;

        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] < 0) {
                isAllPositive = false;
            }
        }
        return isAllPositive;
    }
}
