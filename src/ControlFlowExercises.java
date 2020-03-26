//import java.util.Scanner;
//
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//// 1.
//        int i = 5;
//        while (i < 15) {
//            System.out.print(i);
//            i +=1;
//        }
//
//        int l = 100;
//        do {
//            System.out.println(l);
//            l-=5;
//        } while (l > 0);
//
//
//        long v = 2;
//        do {
//            System.out.println(v);
//            v *= v;
//        }while (v < 1000000);
//
//
//        for (int x = 100; x > 0; x--) {
//            System.out.println(x);
//        }
//
//        for (long y = 2; y < 1000000; y*=y) {
//            System.out.println(y);
//        }
//        Scanner scanner = new Scanner(System.in);
//
//// 2.
//        for (int f = 0; f <= 100; f++) {
//            if (f % 15 == 0) {
//                System.out.println("Fizzbuzz");
//            } else if (f % 5 == 0) {
//                System.out.println("buzz");
//            } else if (f % 3 == 0) {
//                System.out.println("fizz");
//            } else {
//                System.out.println(f);
//            }
//        }

// 3.
//        System.out.print("What number would you like to go up to?");
//        int userInput;
//        userInput = scanner.nextInt();
//
//        System.out.println("you entered the number" + userInput);
//

// 4.
//    Scanner scanner = new Scanner(System.in);
//    String userConfirm = "Y";
//
//    while(userConfirm.equalsIgnoreCase("y")){
//        System.out.println("what number would you like to go up to?");
//        int num = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Here is your table:");
//        System.out.println("number | squared | cubed");
//        System.out.println(" ----- | ----- | ----- ");
//
//        for (int counter = 1; counter <= num; counter++){
//            System.out.printf("%-6d | %-7d | %d%n", counter, counter*counter, counter*counter*counter);
//        }
//        System.out.println("test number? Y/N");
//        userConfirm = scanner.nextLine();
//    }
//}

// 5.

//int userGrade = scanner.nextInt();
//                int quotient = userGrade / 10;
//                int remainder = quotient % 10;
//                switch (quotient) {
//                    case 10:
//                    case 9:
//                        System.out.println("A");
//                        break;
//                    case 8:
//                        System.out.println("B");
//                        break;
//                    case 7:
//                        System.out.println("C");
//                        break;
//                    case 6:
//                        System.out.println("D");
//                        break;
//                    case 5:
//                    case 1:
//                    case 4:
//                    case 3:
//                    case 2:
//                        System.out.println("F");
//                        break;
//                    default:
//                        System.out.println("Try again");
//                        break;
//                }
