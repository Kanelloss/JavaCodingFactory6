package gr.aueb.cf.ch14.validationUtils;

public class ValidationUtils {

    public static boolean isLengthBetweenOneAndThirtyOne(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        return length >= 1 && length <= 31;
    }

    public static boolean isValueBetweenOneAndTen(int num) {
        return num >= 1 && num <= 10;
    }
}
