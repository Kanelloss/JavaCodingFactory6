package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Simulation of a parking arrival/departure recording app with the use
 * of a two-dim array.
 * Used to calculate the maximum amount of cars parked at the same time.
 */
public class ArraysExercise02Ch3 {

    public static void main(String[] args) {

        int[][] arr = {{1312, 1736}, {1317, 1458}, {1015, 1120}, {1415, 1459}, {1100, 1200}, {1007, 1459}};

        int maxCars = findMaxCars(arr);
        System.out.println("Maximum number of simultaneously parked cars: " + maxCars);

    }

    /**
     * Finds the maximum number of cars parked at the same time,
     * after creating a new table to put the data in a specific way.
     * Second row value: 1 ==> Arrival
     * Second row value: 0 ==> Departure
     *
     * @param arr     The two-dim array that is received with the arrival/departure times.
     * @return        The max number of parked cars at the same time, as an integer.
     */
    public static int findMaxCars (int[][] arr) {
        if (arr == null) return -1;

        int[][] newArray = new int[arr.length * 2][2];
        int index = 0;
        int count = 0;
        int maxCars = 0;

        for (int i = 0; i < arr.length; i++) {
            newArray[index][0] = arr[i][0];  // Arrival
            newArray[index][1] = 1;
            index++;
            newArray[index][0] = arr[i][1];  // Departure
            newArray[index][1] = 0;
            index++;
        }

        Arrays.sort(newArray, (a, b) -> {
            if (a[0] == b[0]) {         // If times are equal, prioritize departure over arrival
                return b[1] - a[1];
            } else {
                return a[0] - b[0];
            }
        });

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i][1] == 1) {      //Arrival
                count++;
                maxCars = Math.max(maxCars, count);
            } else {                        // Departure
                count--;
            }
        }

//        for (int[] row : newArray) {          // Use to print the array if manual checking of the array contents is needed.
//            for (int col : row) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }

        return maxCars;
    }
}


