package gr.aueb.cf.ch5;

/**
 * Ανταλλάσσει αμοιβαία τις τιμές δύο ακεραίων.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a: %d, b: %d\n", a, b);
        swap(a,b);
        System.out.printf("a: %d, b: %d", a, b);


    }

    /**
     * Mutually interchanges the values of two integers.
     * @param a     the first int.
     * @param b     the second int.
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
