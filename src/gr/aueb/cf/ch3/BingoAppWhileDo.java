package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BingoAppWhileDo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET = 12;
        int num = 0;

        while (true) {
            System.out.println("Please insert a num and guess the secret!");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo!!!");
                break;
            }

            System.out.println("Try again!");
        }

        System.out.println("Thank you for playing!");
    }
}
