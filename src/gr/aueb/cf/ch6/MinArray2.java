package gr.aueb.cf.ch6;

/**
 * Returns min position of an array.
 */
public class MinArray2 {

    public static void main(String[] args) {

        int[] arr = {19, 12, 5};
        int minPosition = getMinPosition(arr);

        if (minPosition == -1) {
            System.out.println("Error in searching...");
        } else {
            System.out.printf("Min value: %d, Min position: %d", arr[minPosition], minPosition + 1);
        }
    }

    public static int getMinPosition(int[] arr) {
        if(arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int min = arr[0];

        for (int i =1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }
}
