package gr.aueb.cf.ch14.mathHelper;

public class MainMathHelper {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Max: " + MathHelper.findMax(array));
        System.out.println("Min: " + MathHelper.findMin(array));
        System.out.println("Average: " + MathHelper.findAverage(array));
    }
}
