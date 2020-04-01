import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // 1. Initialize an ArrayList of Strings, called roasts

        ArrayList<String> roasts = new ArrayList<>();

        //   add light, medium, medium, dark to the array list, one at a time
        roasts.add("Light");
        roasts.add("Medium");
        roasts.add("Medium");
        roasts.add("Dark");
        System.out.println(roasts);



        // 2. Check to see if the list contains "dark" , and then "espresso"
        boolean results;
        results = roasts.contains("dark");

        System.out.println(results);

        // 3. Find the last index of "medium" in the array
        int index = roasts.lastIndexOf("Medium");
        System.out.println(index);


        // 4. Check if the array list is empty
        results = roasts.isEmpty();
        System.out.println(results);

        // 5. Assign the array list an empty ArrayList object, and then check if empty
        ArrayList<String> emptyList = new ArrayList<>();
        results = emptyList.isEmpty();
        System.out.println(results);

        roasts.add(9,"espresso");

        // 6. Remove the espresso roast
        roasts.remove("espresso");
        System.out.println(results);

        // 7. Remove the element at index 2
        roasts.remove(2);



        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //

        // 1. Create a HashMap called usernames that contains:
        //   a. first name
        //   b. Github username
        // 2. re-initialize the HashMap using the .clear() method
        // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map
        // 4. use the .putIfAbsent() method to add
        //   a. "Vivian" -> "viviancan"
        //   b. "Casey" -> "XpenguinX"
        // 5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?
        // 6. Use the .remove() method to remove "Casey"
        // 7. Use the .replace() method to change Vivian's username to "viviancandev"
        // 8. Use the .clear() method to clear the map
        // 9. Use the .isEmpty() method to verify that it was cleared

    }
}