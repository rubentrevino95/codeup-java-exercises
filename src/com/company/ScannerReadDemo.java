package com.company;

import java.io.*;
import java.util.Scanner;

public class ScannerReadDemo {
    public static void main(String[] args) throws IOException {

        // PrintWriter works like System.out
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("data/story.txt"), true));
        pw.println("To be, or not to be, that is the question:\n" +
                "Whether 'tis nobler in the mind to suffer\n" +
                "The slings and arrows of outrageous fortune,\n" +
                "Or to take arms against a sea of troubles\n" +
                "And by opposing end them. ");
        pw.close();

        File file = new File("data/story.txt");
        Scanner scanner = new Scanner(file);
        int lineCount = 1;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.print(lineCount + " ");
            System.out.println(line);
            lineCount += 1;
        }
        scanner.close();
    }
}