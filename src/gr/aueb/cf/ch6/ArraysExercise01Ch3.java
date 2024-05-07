package gr.aueb.cf.ch6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercise01Ch3 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 4;
        int[] Indexes = new int[2];     // Index[0] == Low Index, Index [1] == High Index

        Indexes = getLowAndHighIndexOf(arr, 6);

        if (Indexes[0] == -1) {     // No need to check for second value, it would be a redundant comparison.
                System.out.println("Key value was not found in the array.");
            } else if (Indexes[0] == Indexes[1]) {
                System.out.printf("Key value was found once, at position: %d", Indexes[0] + 1);
            } else {
            System.out.printf("Low index: %d, High index: %d", Indexes[0]+ 1, Indexes[1] + 1);
        }
    }

    /**
     * Checks if a key value exists inside an array, and returns
     * the low and high index positions that the value was found
     * in the form of a two-dim array. (Indexes[0] == Low Index, Indexes[1] == High Index).
     * If the key value is not found, it returns -1 in both positions
     *
     * @param arr       The given array.
     * @param key       The integer key value.
     * @return          The two-dim array with the values of low index and high index.
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int lowIndex = Integer.MAX_VALUE;
        int HighIndex = Integer.MIN_VALUE;
        int[] Indexes = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (i < lowIndex) {
                    lowIndex = i;
                }

                if (i > HighIndex) {
                    HighIndex = i;
                }
            }
        }

        if (lowIndex == Integer.MAX_VALUE) {
            Indexes[0] = -1;
            Indexes[1] = -1;
        } else {
            Indexes[0] = lowIndex;
            Indexes[1] = HighIndex;
        }

        return Indexes;
    }


    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }


}
