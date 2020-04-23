package util;

/**
 * This is a class to test the Input utility
 */
public class InputTest {
    private static String prompt;
    private static Input input = new Input();

    public static void main(String[] args) {
        testString();
        testYesNo();
        testInt();
        testIntRange();
        testDouble();
        testDoubleRange();
        testBinary();
        testBinaryRange();
        testHex();
        testHexRange();
    }

    public static void testString() {
        System.out.println();
        prompt = "Enter a String: ";
        String s = input.getString(prompt);
        System.out.printf("getString(prompt): %s%n", s);
        System.out.println();
        System.out.print(prompt);
        s = input.getString();
        System.out.printf("getString(): %s%n", s);
    }

    public static void testYesNo() {
        System.out.println();
        prompt = "Enter Yes or No: ";
        boolean b = input.yesNo(prompt);
        System.out.printf("yesNo(prompt): %b%n", b);
        System.out.println();
        System.out.print(prompt);
        b = input.yesNo();
        System.out.printf("yesNo() no prompt: %b%n", b);
        System.out.println();
    }

    public static void testInt() {
        System.out.println();
        prompt = "Enter an Integer: ";
        int anInt = input.getInt(prompt);
        System.out.printf("getInt(prompt): %d%n", anInt);
        System.out.println();
        System.out.print(prompt);
        anInt = input.getInt();
        System.out.printf("getInt(): %d%n", anInt);
        System.out.println();
    }

    public static void testIntRange() {
        System.out.println();
        int iMin = 5, iMax = 12;
        prompt = String.format("Enter an integer between %d and %d: ", iMin, iMax);
        int anInt = input.getInt(iMin, iMax, prompt);
        System.out.printf("getInt(iMin, iMax, prompt): %d%n", anInt);
        System.out.println();
        System.out.print(prompt);
        anInt = input.getInt(iMin, iMax);
        System.out.printf("getInt(iMin, iMax): %d%n", anInt);
        System.out.println();
    }

    public static void testDouble() {
        System.out.println();
        prompt = "Enter a real number: ";
        double aDouble = input.getDouble(prompt);
        System.out.printf("getDouble(prompt): %f%n", aDouble);
        System.out.println();
        System.out.print(prompt);
        aDouble = input.getDouble();
        System.out.printf("getDouble(): %f%n", aDouble);
        System.out.println();
    }

    public static void testDoubleRange() {
        System.out.println();
        double dMin = 5.3, dMax = 12.7;
        prompt = String.format("Enter a real number between %.2f and %.2f: ", dMin, dMax);
        double aDouble = input.getDouble(dMin, dMax, prompt);
        System.out.printf("getDouble(dMin, dMax, prompt): %f%n", aDouble);
        System.out.println();
        System.out.print(prompt);
        aDouble = input.getDouble(dMin, dMax);
        System.out.printf("getDouble(dMin, dMax): %f%n", aDouble);
        System.out.println();
    }

    public static void testBinary() {
        System.out.println();
        prompt = "Enter a binary number: ";
        int bin = input.getBinary(prompt);
        System.out.printf("getBinary(prompt): %d%n", bin);
        System.out.println();
        System.out.print(prompt);
        bin = input.getBinary();
        System.out.printf("getBinary(): %d%n", bin);
        System.out.println();
    }

    public static void testBinaryRange() {
        System.out.println();
        String bMin = "0", bMax = "10000";
        prompt = String.format("Enter a binary number between %s and %s: ", bMin, bMax);
        int bin = input.getBinary(bMin, bMax, prompt);
        System.out.printf("getDouble(dMin, dMax, prompt): %d%n", bin);
        System.out.println();
        System.out.print(prompt);
        bin = input.getBinary(bMin, bMax);
        System.out.printf("getDouble(dMin, dMax): %d%n", bin);
        System.out.println();
    }

    public static void testHex() {
        System.out.println();
        prompt = "Enter a hex number: ";
        int hex = input.getHex(prompt);
        System.out.printf("getHex(prompt): %d%n", hex);
        System.out.println();
        System.out.print(prompt);
        hex = input.getHex();
        System.out.printf("getHex(): %d%n", hex);
        System.out.println();
    }

    public static void testHexRange() {
        System.out.println();
        String hMin = "0", hMax = "faf";
        prompt = String.format("Enter a Hex number between %s and %s: ", hMin, hMax);
        int hex = input.getHex(hMin, hMax, prompt);
        System.out.printf("getHex(prompt): %d%n", hex);
        System.out.println();
        System.out.print(prompt);
        hex = input.getHex(hMin, hMax);
        System.out.printf("getHex(): %d%n", hex);
        System.out.println();
    }
}

