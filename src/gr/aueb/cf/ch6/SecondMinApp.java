package gr.aueb.cf.ch6;

/**
 * Finds and prints the second minimum value
 * of an array by calling a method.
 */
public class SecondMinApp {

    public static void main(String[] args) {

        int[] arr = {15, 13, 19, 56, 22, 25, 75, 3, 10};
        int secMin = 0;
        int secMinPosition = 0;


        secMinPosition = getSecondMinPosition(arr);
        secMin = arr[secMinPosition];

//        if (secMinPosition == -1) System.exit(1);         // Error code not necessary for this particular example.


        System.out.printf("Second min position: %d, Second min Value: %d", secMinPosition + 1, secMin);

    }

    public static int getSecondMinPosition(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        int minPosition = 0;
        int secMinPosition = 0;

//        if (arr == null) return -1;       // If we don't know the values/length of the array.
//        if (arr.length < 2) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < secMin) && (arr[i] != min)) {
                secMinPosition = i;
                secMin = arr[i];
            }
        }
        return secMinPosition;
    }

}
