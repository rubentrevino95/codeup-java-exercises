import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsExercises {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Attempt to divide by zero");
        }
        return a / b;
    }

    public static int modulus(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Attempt to divide by zero");
        }
        return a % b;
    }

    public static int multWithLoop(int a, int b) {
        if (a < 0) b = 0 - b;
        int product = 0;
        for (int i = a; i > 0; i--) {
            product += b;
        }
        return product;
    }

    public static int multWithRecursion(int a, int b) {
        int product = 0;
        if (a > 0) {
            product = b + multWithRecursion(a - 1, b);
        } else if (a < 0) {
            product = (0 - b) + multWithRecursion(a + 1, b);
        }
        return product;
    }


    public static int getInteger(int min, int max) {

        boolean doAgain = true;
        int num = 0;
        do {
            try {
                num = scanner.nextInt();
                scanner.nextLine();
                if (num < min || num > max) {
                    System.out.printf("\nThe integer %d is out of range\n", num);
                    System.out.printf("Enter an Integer between %d and %d: ", min, max);
                } else {
                    doAgain = false;
                }
            } catch (InputMismatchException ime) {
                System.out.println("\nThat is not an integer.");
                System.out.printf("Enter an Integer between %d and %d: ", min, max);
                scanner.nextLine();
                num = 0;
            }
        } while (doAgain);
        return num;
    }

    private static Scanner scanner;
    public static void setScanner(Scanner s) {
        scanner = s;
    }


    public static long calcFactorial(int num) throws ArithmeticException {
        long factorial = 1;
        long previousFactorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
            if (previousFactorial > factorial) {
                throw new ArithmeticException("The factorial of " + num +
                        " is too large to be represented by a long value");
            }
        }
        return factorial;
    }

    public static long recursiveCalcFactorial(int num) throws ArithmeticException {
        if (num <= 1) return 1;
        long fact = num * recursiveCalcFactorial(num -1 );
        if (fact < num) throw new ArithmeticException("The factorial is too large to be represented by a long value");
        return fact;
    }

    public static int getInteger() {
        scanner = new Scanner(System.in);
        boolean doAgain = true;
        int num = 0;
        do {
            try {
                num = scanner.nextInt();
                scanner.nextLine();
                doAgain = false;
            } catch (InputMismatchException ime) {
                System.out.println("That is not an integer.");
                scanner.nextLine();
                num = 0;
            }
        } while (doAgain);
        return num;
    }

}
