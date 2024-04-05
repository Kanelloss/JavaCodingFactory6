package gr.aueb.cf.ch2;

/**
 *  Επιδεικνύει τις μετατροπές μεταξύ διαφορετικών τύπων δεδομένων
 */
public class TypecastApp {

    public static void main(String[] args) {
        int myInt = 10;
        long myLong = 20L;
        int myResultInt = 0;
        long myResultLong = 0L;

        myLong = myInt;        // auto-widening (αυτόματο typecast)
        myInt = (int) myLong;  // typecast

        // Σε μια παράσταση όλα μετατρέπονται στο μεγαλύτερο σε μέγεθος τύπου δεδομένων.

        myResultInt =(int) (myInt + myLong);
        myResultLong = myInt * myLong;       // Ίδιος τύπος δεδομένων
        myResultLong = myInt;







    }
}
