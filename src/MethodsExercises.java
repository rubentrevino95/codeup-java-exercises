
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(getFactorial());
    }
// 1.
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {return num1 * num2; }

    public static int division(int num1, int num2) {return num1 / num2; }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }



// 2.
    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userNum = input.nextInt();

        if (userNum >= min && userNum <= max) {
            return userNum;
        } else return getInteger(min, max);
    }

// 3.
    public static int getFactorial() {
        int num = 1;
        long previousNum = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");
        int userNum = input.nextInt();


        for (int i = 1; i <= userNum; i++) {
            num *= i;

        }
        System.out.println("The factorial of " + userNum + " is ");
        return num;
    }

// 4.

}
