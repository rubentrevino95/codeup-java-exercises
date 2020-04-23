import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create an integer variable i with a value of 5.
        int i = 5;
        // Create a while loop that runs so long as i is less than or equal to 15.
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        // Each loop iteration, output the current value of i, then increment i by one.

        // Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        int x = 0;
        do {
            System.out.println(x);
            x += 2;
        } while (x <= 100);

        // Alter your loop to count backwards by 5's from 100 to -10.

        int y = 100;
        do {
            System.out.println(y);
            y -= 5;
        } while (y >= -10);

        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
        long j = 2L;

        do {
            System.out.println(j);
            j *= j;
        } while (j < 1000000);

        // Refactor the previous two exercises to use a for loop instead.

        for (int a = 5; a <= 15; a++) {
            System.out.println(a);
        }

        for (int z = 100; z >= -10; z -= 5) {
            System.out.println(z);
        }

        for(int e = 1; e <= 100; e++) {
            if (e % 2 == 1) {
                continue;
            }
            System.out.println(e);
        }

        for (long q = 2L; q < 1000000; q*=q) {
            System.out.println(q);
        }

        // Fizzbuzz - 1 thru 100

        for (int u = 1; u <= 100; u++) {
            if (u % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (u % 5 == 0) {
                System.out.println("Buzz");
            } else if (u % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(u);
            }
        }

        // Table of powers.
        System.out.println("Give me a number:");
        int num = sc.nextInt();

        System.out.println("Here is your table:");
        System.out.println("Number     | Squared     | Cubed");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int h = 1; h <= num; h++) {
            System.out.printf("%d       | %d         | %d%n", h, h*h, h*h*h);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        // Convert given number grades into letter grades.
        /**
         * A : 100 - 88
         * B : 87 - 80
         * C : 79 - 67
         * D : 66 - 60
         * F : 59 - 0
         */

        System.out.println("Would you like to look at your letter grades?");
        String confirm = sc.next();

        while (confirm.equalsIgnoreCase("YES")) {
            System.out.println("What was your numeric grade?");
            int grade = sc.nextInt();

            char letterGrade;
            if (grade > 100)  {
                System.out.println("That's impossible. No one can give more than one hundred percent. By definition that is the most anyone can give.");
                continue;
            } else if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.printf("Congratulations you got a %c.%n", letterGrade);

            System.out.println("Would you like to look at your letter grades?");
            confirm = sc.next();
        }



    }
}