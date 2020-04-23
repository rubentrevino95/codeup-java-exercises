public class HelloWorld {
    /**
     * The main method starts the application
     *
     * @param args Any values being passed from the command line.
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Create an int variable named myFavoriteNumber and assign your favorite number to it,
        // then print it out to the console
        int myFavoriteNumber = 9;
        System.out.println("myFavoriteNumber: " + myFavoriteNumber + "\n");

        // Create a String variable named myString and assign a string value to it,
        // then print the variable out to the console.
        String myString = "Hello";
        System.out.println("myString: " + myString + "\n");

        // Change your code to assign a character value to myString. What do you notice?
//        myString = 'c';
        // Change your code to assign the value 3.14159 to myString. What happens?

        // Declare an long variable named myNumber, but do not assign anything to it.
        // Next try to print out myNumber to the console. What happens?
//        long myNumber; // syntax
//        System.out.println(myNumber);
        // Change your code to assign the value 3.14 to myNumber. What do you notice?
        // Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        long myNumber = 123L;
        System.out.println("myNumber: " + myNumber + "\n");

//        // Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        myNumber = 123;
        System.out.println("myNumber: " + myNumber + "\n");

        // Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens?
        // What are two ways we could fix this?
        float myFloatNumber = 3.14f;

        // Copy and paste the following code blocks one at a time and execute them
        int x = 5;
        System.out.println(x++);
        System.out.println(x + "\n");

        x = 5;
        System.out.println(++x);
        System.out.println(x + "\n");


        // Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x = x + 5;
        x = 4;
        x += 5;
        System.out.println("I'm using 'x' now: " + x + "\n\n");

//        int x = 3;
//        int y = 4;
//        y = y * x;
        x = 3;
        int y = 4;
        y *= 4;
        System.out.printf("The value of y is %d and x is %d\n\n", y, x);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
        x = 10;
        y = 2;
        x /= y;
        y -= x;
        System.out.printf("The value of y is %d and x is %d\n\n", y, x);

        byte myByte = 0;
        int i = 0;
        while(i < 128) {
            myByte++;
            i++;
        }
        System.out.println("myByte: " + myByte + "\n");

    }
}
