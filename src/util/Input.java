package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    /**
     * Set the static scanner if it is not already set
     *
     * @param scanner Used to set the the static scanner
     */
    public Input(Scanner scanner) {
        Input.scanner = scanner;
    }

    /**
     * Set the static scanner if it is not already set
     */
    public Input() {
        setScanner();
    }

    private static void setScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
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
    public String getString(String prompt) {
        if (scanner == null) setScanner();
        String s;

        // enter the string
        if (prompt != null) {
            System.out.print(prompt);
        } else {
            prompt = "Enter a string ";
        }
        s = scanner.nextLine();
        if (s.length() == 0)
            s = getString(prompt);
        return s;
    }

    /**
     * Secondary method for no prompt.
     *
     * @return A user input string
     */
    public String getString() {
        return getString(null);
    }

    /**
     * Create a method that ask the user to enter yes or no.
     *
     * The method signature should look like this:
     * public static boolean yesNo();
     *
     * and is used like this:
     * boolean userInput = yesNo();
     *
     * @param prompt A prompt for the user (optional)
     * @return the boolean corresponding to the user entry
     */
    public boolean yesNo(String prompt) {
        if (scanner == null) setScanner();
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
     * @return the boolean corresponding to the user entry
     */
    public boolean yesNo() {
        return yesNo(null);
    }

    /**
     * Create a method that validates that user input is in a certain range
     *
     * The method signature should look like this:
     * public static int getInt();
     *
     * and is used like this:
     * int userInput = getInt();
     *
     * @param prompt A prompt for the user (optional)
     * @return the number entered by the user
     */
    public int getInt(String prompt) {
        if (scanner == null) setScanner();
        String userInput;
        int num;

        // enter the number
        if (prompt != null) {
            System.out.print(prompt);
        }
        try { // If (works)
            userInput = scanner.nextLine();
            num = Integer.parseInt(userInput);
        } catch (Exception e) {
            System.out.println("That is not an integer.");
            if (prompt == null)
                prompt = "Enter an integer: ";
            num = getInt(prompt);
        }
        return num;
    }

    /**
     * Secondary method for no prompt.
     *
     * @return the number entered by the user
     */
    public int getInt() {
        return getInt(null);
    }

    /**
     * Create a method that validates that user input is in a certain range
     *
     * The method signature should look like this:
     * public static int getInt(int min, int max);
     *
     * and is used like this:
     * int userInput = getInt(1, 10);
     *
     * @param min    The minimum valid number
     * @param max    The maximum valid number
     * @param prompt A prompt for the user (optional)
     * @return the number entered by the user
     */
    public int getInt(int min, int max, String prompt) {
        if (scanner == null) setScanner();
        int num = getInt(prompt);
        if (num < min || num > max) {
            System.out.printf("\nThe number %d is out of range\n", num);
            if (prompt == null)
                prompt = String.format("Enter an integer between %d and %d: ", min, max);
            num = getInt(min, max, prompt);
        }
        return num;
    }

    /**
     * Secondary method for no prompt.
     *
     * @param min The minimum valid number
     * @param max The maximum valid number
     * @return the number entered by the user
     */
    public int getInt(int min, int max) {
        return getInt(min, max, null);
    }

    /**
     * Create a method that validates that user input is in a certain range
     *
     * The method signature should look like this:
     * public static double getDouble();
     *
     * and is used like this:
     * double userInput = getDouble();
     *
     * @param prompt A prompt for the user (optional)
     * @return the number entered by the user
     */
    public double getDouble(String prompt) {
        if (scanner == null) setScanner();
        String userInput;
        double num;
        if (prompt != null)
            System.out.print(prompt);
        try {
            userInput = scanner.nextLine();
            num = Double.parseDouble(userInput);
        } catch (Exception e) {
            System.out.println("That is not a real number.");
            if (prompt == null)
                prompt = "Enter a real number: ";
            num = getDouble(prompt);
        }
        return num;
    }

    /**
     * Secondary method for no prompt.
     *
     * @return the number entered by the user
     */
    public double getDouble() {
        return getDouble(null);
    }

    /**
     * Create a method that validates that user input is in a certain range
     *
     * The method signature should look like this:
     * public static double getDouble(double min, double max);
     *
     * and is used like this:
     * double userInput = getDouble(1, 10);
     *
     * @param min    The minimum valid number
     * @param max    The maximum valid number
     * @param prompt A prompt for the user (optional)
     * @return the number entered by the user
     */
    public double getDouble(double min, double max, String prompt) {
        if (scanner == null) setScanner();
        double num;
        num = getDouble(prompt);
        if (num < min || num > max) {
            System.out.printf("\nThe number %f is out of range\n", num);
            if (prompt == null)
                prompt = String.format("Enter a real number between %f and %f: ", min, max);
            num = getDouble(min, max, prompt);
        }
        return num;
    }

    /**
     * Secondary method for no prompt.
     *
     * @param min The minimum valid number
     * @param max The maximum valid number
     * @return the number entered by the user
     */
    public double getDouble(double min, double max) {
        return getDouble(min, max, null);
    }

    /**
     * Create a method that validates that user input is in a certain range
     *
     * The method signature should look like this:
     * public static int getInt();
     *
     * and is used like this:
     * int userInput = getInt();
     *
     * @param prompt A prompt for the user (optional)
     * @return the number entered by the user
     */
    public int getBinary(String prompt) {
        if (scanner == null) setScanner();
        String userInput;
        int num;

        // enter the number
        if (prompt != null) {
            System.out.print(prompt);
        }
        try { // If (works)
            userInput = scanner.nextLine();
            num = Integer.valueOf(userInput, 2);
        } catch (Exception e) {
            System.out.println("That is not a binary number.");
            if (prompt == null)
                prompt = "Enter a binary number: ";
            num = getBinary(prompt);
        }
        return num;
    }

    /**
     * Secondary method for no prompt.
     *
     * @return the number entered by the user
     */
    public int getBinary() {
        return getBinary(null);
    }

    /**
     * Create a method that validates that user input is in a certain range
     *
     * The method signature should look like this:
     * public static int getInt(int min, int max);
     *
     * and is used like this:
     * int userInput = getInt(1, 10);
     *
     * @param min    The minimum valid number
     * @param max    The maximum valid number
     * @param prompt A prompt for the user (optional)
     * @return the number entered by the user
     */
    public int getBinary(String min, String max, String prompt) {
        if (scanner == null) setScanner();
        int num = getBinary(prompt);
        if (num < Integer.valueOf(min, 2) || num > Integer.valueOf(max, 2)) {
            System.out.printf("\nThe number %d is out of range\n", num);
            if (prompt == null)
                prompt = String.format("Enter an binary number between %s and %s: ", min, max);
            num = getBinary(min, max, prompt);
        }
        return num;
    }

    /**
     * Secondary method for no prompt.
     *
     * @param min The minimum valid number
     * @param max The maximum valid number
     * @return the number entered by the user
     */
    public int getBinary(String min, String max) {
        return getBinary(min, max, null);
    }


    /**
     * This is a method that takes hexadecimal input from the user.
     *
     * The method signature should look like this:
     * public static int getHex();
     *
     * and is used like this:
     * int userInput = getHex();
     *
     * @param prompt A prompt for the user (optional)
     * @return the number entered by the user
     */
    public int getHex(String prompt) {
        if (scanner == null) setScanner();
        String userInput;
        int num;

        // enter the number
        if (prompt != null) {
            System.out.print(prompt);
        }
        try { // If (works)
            userInput = scanner.nextLine();
            num = Integer.valueOf(userInput, 16);
        } catch (Exception e) {
            System.out.println("That is not a hex number.");
            if (prompt == null)
                prompt = "Enter a hex number: ";
            num = getHex(prompt);
        }
        return num;
    }

    /**
     * This is a method that takes hexadecimal input from the user.
     * Secondary method for no prompt.
     *
     * @return the number entered by the user
     */
    public int getHex() {
        return getHex(null);
    }

    /**
     * This is a method that takes hexadecimal input from the user.
     * It validates that user input is in a certain range
     *
     * The method signature should look like this:
     * public static int getHex(int min, int max);
     *
     * and is used like this:
     * int userInput = getHex(1, 10);
     *
     * @param min    The minimum valid number
     * @param max    The maximum valid number
     * @param prompt A prompt for the user (optional)
     * @return the number entered by the user
     */
    public int getHex(String min, String max, String prompt) {
        if (scanner == null) setScanner();
        int num = getHex(prompt);
        if (prompt != null) {
            System.out.print(prompt);
        }
        if (num < Integer.valueOf(min, 16) || num > Integer.valueOf(max, 16)) {
            System.out.printf("\nThe number %d is out of range\n", num);
            if (prompt == null)
                prompt = String.format("Enter a hex number between %s and %s: ", min, max);
            num = getHex(min, max, prompt);
        }
        return num;
    }

    /**
     * Secondary method for no prompt.
     *
     * @param min The minimum valid number
     * @param max The maximum valid number
     * @return the number entered by the user
     */
    public int getHex(String min, String max) {
        return getHex(min, max, null);
    }
}
