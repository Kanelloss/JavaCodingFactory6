package gr.aueb.cf.ch20.regex;

import java.util.Scanner;

public class ExerciseRegex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {

            System.out.println("Please give a password: ");
            String password = scanner.nextLine();

            isValid = containsEightChars(password) && containsLowerCase(password)
                    && containsUpperCase(password) && containsNumber(password) && containsSpecialChar(password);

            System.out.print("Password valid: ");
            System.out.print(isValid);

            System.out.println();

        }






    }

    public static boolean containsEightChars(String s) {
        return s.matches(".{8,}");
    }

    public static boolean containsLowerCase (String s) {
        return s.matches(".*[a-z].*");
    }

    public static boolean containsUpperCase (String s) {
        return s.matches(".*[A-Z].*");
    }

    public static boolean containsNumber (String s) {
        return s.matches(".*[0-9].*");
    }

    public static boolean containsSpecialChar (String s) {
        return s.matches((".*[#?!@$%^&*-].*"));
    }
}
