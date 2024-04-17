package gr.aueb.cf.ch4;

import java.util.Scanner;

public class Stars1ToNAscending {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert n:");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
