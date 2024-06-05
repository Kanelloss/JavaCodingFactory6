package gr.aueb.cf.ch14.stringUtils;

public class MainStringUtils {

    public static void main(String[] args) {

        String anna = "anna";
        String john = "john";

        System.out.println("Reversed: " + StringUtils.reverseString(anna));
        System.out.println("Reversed: " + StringUtils.reverseString(john));

        System.out.println("To upper case: " + StringUtils.toUpperCase(anna));
        System.out.println("To upper case: " + StringUtils.toUpperCase(john));

        System.out.println("Is palindrome: " + StringUtils.isPalindrome(anna));
        System.out.println("Is palindrome: " + StringUtils.isPalindrome(john));

    }
}
