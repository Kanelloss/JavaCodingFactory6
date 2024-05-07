package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Asks the user to type 6 integers from 1 to 49
 * and checks if they pass some specific predicates.
 */
public class ArraysExercise02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[6];
        boolean evens = false;
        boolean odds = false;
        boolean consecutives = false;
        boolean sameEndings = false;
        boolean sameTen = false;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Please insert an integer between 1-49: (position: %d)", i + 1);
            System.out.println();
            arr[i] = in.nextInt();
            if (arr[i] < 1 || arr[i] > 49) {
                System.out.println("Numbers have to be inside the range of: 1-49");
                i--;
            }
        }

        evens = hasMoreThan3Evens(arr);
        System.out.println("The even numbers given are more than 3: " + evens);

        odds = hasMoreThan3Odds(arr);
        System.out.println("The odd numbers given are more than 3: " + odds);

        consecutives = hasMoreThan3Consecutives(arr);
        System.out.println("The consecutive numbers given are more than 3: " + consecutives);

        sameEndings = hasMoreThan3SameEnding(arr);
        System.out.println("The same-ending numbers given are more than 3: " + sameEndings);

        sameTen = hasMoreThan3SameTen(arr);
        System.out.println("The same-ten numbers given are more than 3: " + sameTen);


    }

    public static boolean hasMoreThan3Evens(int[] arr) {
        if (arr == null) return false;
        int evens = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens > 3;
    }

    public static boolean hasMoreThan3Odds(int[] arr) {
        if (arr == null) return false;
        int odds = 0;
        for (int item : arr) {
            if (item % 2 != 0) {
                odds++;
            }
        }
        return odds > 3;
    }

    public static boolean hasMoreThan3Consecutives (int[] arr) {
        if (arr == null) return false;
        int consecutives = 0;
        for (int i = 0; i < arr.length - 3; i++) {
            if ((arr[i] == arr[i+1] -1) && (arr[i] == arr[i+2] - 2) && (arr[i] == arr[i+3] -3)) {
                consecutives++;
            }
        }
        return consecutives >= 1;
    }

    public static boolean hasMoreThan3SameEnding(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean hasSameEndings = false;

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item > 3) {
                hasSameEndings = true;
                break;
            }
        }
        return hasSameEndings;
    }

    public static boolean hasMoreThan3SameTen(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean SameTen = false;

        for (int item : arr) {
            endings[item / 10]++;
        }

        for (int item : endings) {
            if (item > 3) {
                SameTen = true;
                break;
            }
        }
        return SameTen;
    }

}
