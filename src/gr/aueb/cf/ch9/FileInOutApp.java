package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInOutApp {

    public static void main(String[] args) {
        File inFd = new File("C:/Temp/file1.txt");
        File outFd = new File("C:/Temp/file2.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(inFd);
             PrintWriter pw = new PrintWriter(outFd)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split(" +");

                for (String token : tokens) {
                    pw.printf("ab: %s ", token);
                    pw.flush();
                }
                pw.println();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
