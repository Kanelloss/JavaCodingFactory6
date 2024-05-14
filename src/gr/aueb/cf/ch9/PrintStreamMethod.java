package gr.aueb.cf.ch9;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMethod {

    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("C:/Windows/Temp/file6.txt");

            printMessage(ps, "Hello Coding Factory1!");
            printMessage(System.out, "Hello CF1");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
