package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Χρησιμοποιεί την κλάση BigInteger ώστε να μην έχουμε υπερχείλιση (overflow)
 */
public class BigIntegerApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        BigInteger myBigNum1 = new BigInteger("1234567891234567890");
        BigInteger myBigNum2 = new BigInteger("1234567898765");

        BigInteger result = myBigNum1.add(myBigNum2);

        System.out.println("The result is: " + result);
    }
}
