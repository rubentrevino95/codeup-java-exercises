import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Hi my name is Bob! Talk to me!");
        String userInput = input.nextLine();

        System.out.println(userInput);

        if (userInput.endsWith("?")) {
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Woah, chill out!");
        } else if (userInput == null || userInput.length() == 0) {
            System.out.println("Fine be that way.");
        } else
            System.out.println("Whatever.");
    }
}
