package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    /**
     *  Pass down scanner from calling function as it is never good to take control
     *  of the System.in stream in a function.
     */
    public static void setScanner(Scanner s) {
        scanner = s;
    }

    /**
     * Create a method that validates that user input is in a certain range
     *
     * The method signature should look like this:
     * public static String getString();
     *
     * and is used like this:
     * String userInput = getString();
     *
     * @param prompt A prompt for the user (optional)
     * @return the String entered by the user
     */
    public static String getString(String prompt) throws Exception {
        if (scanner == null) {
            throw new Exception("Input Utility's scanner is not set");
        }
        String s;

        // enter the string
        if (prompt != null) {
            System.out.print(prompt);
        }
        s = scanner.nextLine();
        return s;
    }

    /**
     * Secondary method for no prompt.
     *
     * @return
     */
    public static String getString() throws Exception {
        return getString(null);
    }

    /**
     * Create a method that ask the user to enter yes or no.
     * <p>
     * The method signature should look like this:
     * public static boolean yesNo();
     * <p>
     * and is used like this:
     * boolean userInput = yesNo();
     *
     * @param prompt A prompt for the user (optional)
     * @return the boolean corresponding to the user entry
     */
    public static boolean yesNo(String prompt) throws Exception {
        if (scanner == null) {
            throw new Exception("Input Utility's scanner is not set");
        }
        boolean response;

        // enter the string
        if (prompt != null) {
            System.out.print(prompt);
        }
        response = scanner.nextLine().toLowerCase().contains("y");
        return response;
    }

    /**
     * Secondary method for no prompt.
     *
     * @return
     */
    public static boolean yesNo() throws Exception {
        return yesNo(null);
    }

    /**
     * Create a method that validates that user input is in a certain range
     * <p>
     * The method signature should look like this:
     * public static int getInt();
     * <p>
     * and is used like this:
     * int userInput = getInt();
     *
     * @param prompt A prompt for the user (optional)
     * @return the number entered by the user
     */
    public static int getInt(String prompt) throws Exception {
        if (scanner == null) {
            throw new Exception("Input Utility's scanner is not set");
        }
        String localPrompt = prompt;
        boolean validInput = false;
        int num = 0;

        // enter the number
        do {
            if (localPrompt != null) {
                System.out.print(localPrompt);
            }
            try { // If (works)
                num = scanner.nextInt();
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException ime) { // else (fails)
                System.out.println("That is not an integer.");
                scanner.nextLine();
                if (localPrompt == null)
                    localPrompt = "Enter an integer: ";
                num = 0;
            }
        } while (!validInput);
        return num;
    }

    /**
     * Secondary method for no prompt.
     *
     * @return
     */
    public static int getInt() throws Exception {
        return getInt(null);
    }

    /**
     * Create a method that validates that user input is in a certain range
     * <p>
     * The method signature should look like this:
     * public static int getInt(int min, int max);
     * <p>
     * and is used like this:
     * int userInput = getInt(1, 10);
     *
     * @param min
     * @param max
     * @param prompt A prompt for the user (optional)
     * @return the number entered by the user
     */
    public static int getInt(int min, int max, String prompt) throws Exception {
        if (scanner == null) {
            throw new Exception("Input Utility's scanner is not set");
        }
        String localPrompt = prompt;
        boolean validInput = false;
        int num = 0;
        do {
            if (localPrompt != null) {
                System.out.print(localPrompt);
            }
            try {
                num = scanner.nextInt();
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException ime) {
                System.out.println("That is not an integer.");
                scanner.nextLine();
                if (localPrompt == null)
                    localPrompt = String.format("Enter a integer between %d and %d: ", min, max);
                num = 0;
            }
            if (num < min || num > max) {
                System.out.printf("\nThe number %d is out of range\n", num);
                if (localPrompt == null)
                    localPrompt = String.format("Enter an integer between %d and %d: ", min, max);
                validInput = false;
            }
        } while (!validInput);
        return num;
    }

    /**
     * Secondary method for no prompt.
     *
     * @param min
     * @param max
     * @return
     */
    public static int getInt(int min, int max) throws Exception {
        return getInt(min, max, null);
    }

    /**
     * Create a method that validates that user input is in a certain range
     * <p>
     * The method signature should look like this:
     * public static double getDouble();
     * <p>
     * and is used like this:
     * double userInput = getDouble();
     *
     * @param prompt A prompt for the user (optional)
     * @return the number entered by the user
     */
    public static double getDouble(String prompt) throws Exception {
        if (scanner == null) {
            throw new Exception("Input Utility's scanner is not set");
        }
        String localPrompt = prompt;
        boolean validInput = false;
        double num = 0;
        do {
            if (localPrompt != null) {
                System.out.print(localPrompt);
            }
            try {
                num = scanner.nextDouble();
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException ime) {
                System.out.println("That is not a number.");
                scanner.nextLine();
                if (localPrompt == null)
                    localPrompt = String.format("Enter a number: ");
                num = 0.0;
            }
        } while (!validInput);
        return num;
    }

    /**
     * Secondary method for no prompt.
     *
     * @return
     */
    public static double getDouble() throws Exception {
        return getDouble(null);
    }

    /**
     * Create a method that validates that user input is in a certain range
     * <p>
     * The method signature should look like this:
     * public static double getDouble(double min, double max);
     * <p>
     * and is used like this:
     * double userInput = getDouble(1, 10);
     *
     * @param min
     * @param max
     * @param prompt A prompt for the user (optional)
     * @return the number entered by the user
     */
    public static double getDouble(double min, double max, String prompt) throws Exception {
        if (scanner == null) {
            throw new Exception("Input Utility's scanner is not set");
        }
        String localPrompt = prompt;
        boolean validInput = false;
        double num = 0;
        do {
            if (localPrompt != null) {
                System.out.print(localPrompt);
            }
            try {
                num = scanner.nextDouble();
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException ime) {
                System.out.println("That is not a number.");
                scanner.nextLine();
                if (localPrompt == null)
                    localPrompt = String.format("Enter a number between %f and %f: ", min, max);
                num = 0.0;
            }
            if (num < min || num > max) {
                System.out.printf("\nThe number %f is out of range\n", num);
                if (localPrompt == null)
                    localPrompt = String.format("Enter a number between %f and %f: ", min, max);
                validInput = false;
            }
        } while (!validInput);
        return num;
    }

    /**
     * Secondary method for no prompt.
     *
     * @param min
     * @param max
     * @return
     */
    public static double getDouble(double min, double max) throws Exception {
        return getDouble(min, max, null);
    }
}
