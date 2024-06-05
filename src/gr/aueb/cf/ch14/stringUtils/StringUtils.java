package gr.aueb.cf.ch14.stringUtils;

public class StringUtils {

    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        return str.equals(reverseString(str));
    }
}
