package gr.aueb.cf.ch20.regex;

public class Main {

    public static void main(String[] args) {
//        String s = "Red";
//        System.out.println(isRed(s));   // true
//        System.out.println(isRedOrGreen(s));    // true
//        System.out.println(isrRed(s));      // true

        System.out.println(anySymbolAndDigit(" 4"));
        System.out.println(dotAnyChar(".*"));

    }

    public static boolean isRed(String s) {
        return s.matches("Red");
    }

    public static boolean isRedOrGreen(String s) {
        return s.matches("Red|Green");
    }

    public static boolean isrRed(String s) {
        return s.matches("[rR]ed");
    }

    public static boolean startsWithOneUppercaseLetterAndEndsWithIng(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean startsWithOneUpperOrLowercaseLetterAndEndsWithIng(String s) {
        return s.matches("[a-zA-Z]ing");
    }

    public static boolean startsWithOneUpperOrLowercaseLetterOrDigitAndEndsWithIng(String s) {
        return s.matches("[a-zA-Z0-9]ing");
    }

    public static boolean letterAndDigit(String s) {
        return s.matches("\\w\\d");
    }

    public static boolean letterSpaceDigit(String s) {
        return s.matches("\\w\\s\\d");
    }

    public static boolean anySymbolAndDigit(String s) {
        return s.matches(".\\d");
    }

    public static boolean dotAnyChar(String s) {
        return s.matches("\\..");
    }

    
}
