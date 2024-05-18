package gr.aueb.cf.ch7;

public class ExerciseChapter07 {

    public static void main(String[] args) {
        String s = "Test Encrypted Message!";
        final int KEY = 1;

        String encrypted = encrypt(s, KEY);
        System.out.println("Encrypted message: " + encrypted);

        String decrypted = decrypt(encrypted, KEY);
        System.out.println("Decrypted message: " + decrypted);

    }

    public static String encrypt(String s, int key) {
        StringBuilder encrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            encrypted.append((char)(ch + key));
        }

        return encrypted.toString();
    }

    public static String decrypt(String s, int key) {
        StringBuilder decrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            decrypted.append((char)(ch - key));
        }

        return decrypted.toString();
    }

}
