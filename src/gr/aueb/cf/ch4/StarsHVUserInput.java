package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsHVUserInput {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Please insert num1 and num2:");
        num1 = in.nextInt();
        num2 = in.nextInt();


        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <=num2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
