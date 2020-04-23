package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        boolean goAgain = false;
        do {
            try {
                double radius = input.getDouble("\nPlease enter a radius for a circle: ");
                Circle circle = new Circle(radius);
//                System.out.println(circle.describeData());
                System.out.println(circle);
                goAgain = input.yesNo("Would you like to see data for another circle? ");
            } catch (Exception e) {
                System.out.println("Scanner is not set");
            }
        } while (goAgain);
    }
}