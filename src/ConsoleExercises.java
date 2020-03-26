import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14159;

        System.out.format("the value of pie is %.2f%n", pi);


        System.out.println("Enter a number: ");

        int userInt = input.nextInt();
        System.out.println(userInt);

        System.out.println("please enter 3 words");

        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);


        System.out.println("Enter a sentence");
        String sentence = input.nextLine();
        System.out.println(sentence);

        System.out.println("enter a length");
        int length = Integer.parseInt(input.nextLine());

        System.out.println("enter a width");
        int width = Integer.parseInt(input.nextLine());

        int area = length * width;
        int perimeter = (2*width) + (2*length);

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


        input.close();
    }


}
