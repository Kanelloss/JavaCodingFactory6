package gr.aueb.cf.ch6;

/**
 * Predicates are boolean methods.
 */
public class PredicatesApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("The array has at least one positive element: " + hasOnePositive(arr));
        System.out.println("All of the array's elements are positive: " + areAllPositive(arr));
    }

    public static boolean hasOnePositive(int[] arr) {
        boolean hasPositive = false;

        for (int item : arr) {
            if (item > 0) {
                hasPositive = true;
                break;
            }
        }
        return hasPositive;
    }

    public static boolean areAllPositive(int[] arr) {
        boolean arePositive = true;

        for (int item : arr) {
            if (item < 0) {
                arePositive = false;
                break;
            }
        }
        return arePositive;
    }

    public static boolean areLTNPositive(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }

        return count <= threshold;
    }

    public static boolean areGTEven(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }

        return count >= threshold;
    }

    public static boolean areGTOdd(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }

        return count >= threshold;
    }

    public static boolean areSameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];
        boolean sameEnding = false;
        int ending;

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item: endings) {
            if (item > threshold) {
                sameEnding = true;
                break;
            }
        }

        return sameEnding;
    }

    public static boolean areSameGroupOfTen(int[] arr, int threshold) {
        int[] tens = new int[10];
        boolean sameTen = false;

        for (int item : arr) {
            tens[item / 10]++;
        }

        for (int item: tens) {
            if (item > threshold) {
                sameTen = true;
                break;
            }
        }

        return sameTen;
    }

}
