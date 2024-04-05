package gr.aueb.cf.ch2;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        int days = 0;
        int hours =0;
        int minutes = 0;
        int seconds = 0;


        Scanner in = new Scanner(System.in);

        System.out.println("Please insert days");
        days = in.nextInt();

        System.out.println("Please insert hours");
        hours = in.nextInt();

        System.out.println("Please insert minutes");
        minutes = in.nextInt();

        System.out.println("Please insert seconds");
        seconds = in.nextInt();

        System.out.printf(" %02d / %02d / %02d / %02d", days, hours, minutes, seconds);

    }
}
