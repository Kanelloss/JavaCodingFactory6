package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuMethodsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            printMenu();
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    printNHor();
                    break;
                case 2:
                    PrintNVer();
                    break;
                case 3:
                    PrintNxN();
                    break;
                case 4:
                    Print1toNAsc();
                    break;
                case 5:
                    PrintNto1Desc();
                    break;
                case 6:
                    System.out.println("Επιλέξατε έξοδο");
                    break;
                default:
                    System.out.println("Λάθος επιλογή");
            }
        } while (choice != 6);

        System.out.println("Ευχαριστούμε!");

    }

    /**
     * prints a menu of star printing choices
     */
    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1-n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n-1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    /**
     * Prints n stars horizontally.
     */
    public static void printNHor() {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert n:");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Prints n stars vertically.
     */
    public static void PrintNVer() {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert n:");
        n = in.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println("*");
        }
    }

    /**
     * Prints n x n stars.
     */
    public static void PrintNxN() {
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

    /**
     * Prints 1 star on the 1st line, 2 in the 2nd... etc.
     * & n on the last line.
     */
    public static void Print1toNAsc() {
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

    /**
     * Prints n stars on the 1st line, n-1 in the 2nd, etc.
     * & 1 on the last line.
     */
    public static void PrintNto1Desc() {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert n:");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
