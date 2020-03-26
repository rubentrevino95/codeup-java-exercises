package util;
import java.util.Scanner;

public class Input {

    public Scanner s = new Scanner(System.in);

    public String getString() {
        String userInput = s.nextLine();
        return userInput;
    }

    public boolean yesNo() {
        String booleanInput = s.nextLine();

        if(booleanInput.equalsIgnoreCase("Y") || booleanInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int userInt = s.nextInt();
        return userInt;
    }

}