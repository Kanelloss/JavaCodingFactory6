package gr.aueb.cf.ch5;

/**
 * Demonstrates overloading (υπερφόρτωση).
 * Υπερφόρτωση = ίδιο όνομα μεθόδου, διαφορετικές
 * τυπικές παράμετροι.
 * Method Signature = όνομα της μεθόδου
 * και τυπικές παράμετροι
 */
public class OverloadingApp2 {

    public static void main(String[] args) {
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        sum2 = add(1,2);
        sum3 = add(1,2,3);
        sum4 = add(1,2,3,4);

        System.out.println(sum2 + " " + sum3 + " " + sum4);

    }

    /**
     * Adds two integers.
      * @param a    first integer
     * @param b     second integer
     * @return      the sum of the integers
     */
public static int add(int a, int b) {
        return a + b;
}

    /**
     * Adds three integers.
     * @param a     first int
     * @param b     second int
     * @param c     third int
     * @return       the sum of the integers
     */
    public static int add(int a, int b, int c) {
    return a + b + c;
}

    /**
     * Adds four integers.
     * @param a     first int
     * @param b     second int
     * @param c     third int
     * @param d     fourth int
     * @return      the sum of the integers
     */
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
}
}
