package gr.aueb.cf.ch8;

import java.util.Scanner;


public class ExerciseChapter08 {
    static Scanner in = new Scanner(System.in);
;
    public static void main(String[] args) {
        int choice = -1;

        while (true) {
            printMenu();
            choice = getChoice();

            if (choice == 5) {
                System.out.println("You have chosen: Exit");
                break;
            }
            try {
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Choice.");
                in.nextLine();
            }
        }
    }

    public static void printMenu() {
        System.out.println("Please select one of the below:");
        System.out.println("1. Update File");
        System.out.println("2. Copy File");
        System.out.println("3. Move File");
        System.out.println("4. Delete File");
        System.out.println("5. Exit");
    }

    public static int getChoice() {
        int choice = -1;
        if (in.hasNextInt()) {
            choice = in.nextInt();
        } else {
            System.out.println("Error in format. Please insert an integer:");
        }
        return choice;
    }

    public static void printChoice(int choice) {
        try {
            if (choice < 1 || choice > 5) {
                throw new IllegalArgumentException();
            }
            System.out.println("You have chosen: " + choice);
        } catch  (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;

        }
    }
}

