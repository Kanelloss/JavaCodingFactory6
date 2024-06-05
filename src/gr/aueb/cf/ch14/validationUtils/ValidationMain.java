package gr.aueb.cf.ch14.validationUtils;

public class ValidationMain {

    public static void main(String[] args) {
        String str1 = "String";
        String str2 = "";
        int num1 = 0;
        int num2 = 5;

        System.out.println("String length between 1-31: " + ValidationUtils.isLengthBetweenOneAndThirtyOne(str1));
        System.out.println("String length between 1-31: " + ValidationUtils.isLengthBetweenOneAndThirtyOne(str2));

        System.out.println("Number between 1-10: " + ValidationUtils.isValueBetweenOneAndTen(num1));
        System.out.println("Number between 1-10: " + ValidationUtils.isValueBetweenOneAndTen(num2));

    }
}
