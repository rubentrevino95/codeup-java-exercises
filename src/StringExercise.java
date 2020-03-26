import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// 1.
            String string = new String();
            string = "We don't need no education";
            System.out.println(string);

            String message2 = "Check \"this\" out!, ";
            message2 = message2 + "\"s inside of \"s!";

            System.out.println(message2);

            String message3 = "In windows, ";
            message3 = message3 + "the main drive is usually C:\\";

            System.out.println(message3);

            String message4 = "I can do backslashes \\, double backslashes \\\\,";
            message4 = message4 + " and the amazing triple backslash \\\\\\!";

            System.out.println(message4);

    }
}
