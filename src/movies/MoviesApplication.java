package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static String[] genres;

    public static void main(String[] args) throws Exception {
        //Give the user a list of options for viewing all the movies or viewing movies by category.
        //Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
        //If a category is selected, only movies from that category should be displayed.
        //Your application should continue to run until the user chooses to exit.

        //Give the user a list of options for viewing all the movies or viewing movies by category.
        Input input = new Input();
        Scanner scanner = new Scanner(System.in);
        Input.setScanner(scanner);
        Movie[] movieList = MoviesArray.findAll();

        genres = getGenres(movieList);


        int choice;
        do {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("\t0 - exit");
            System.out.println("\t1 - view all movies");
            System.out.println("\t2 - Add a movie");

            // Loop through all the genres
            int count = 3;
            for (String genre : genres) {
                System.out.println("\t" + count + " - view movies in the " + genre + " category");
                count++;
            }
            System.out.println("");

            choice = Input.getInt(0, count - 1, "Enter your choice: ");

            // Set up a switch statement to choose what to display / do
            if (choice != 0 && choice != 8) {
                // iterate through all movies and print them out based on user's input choice
                for (Movie movie : movieList) {
                    switch (choice) {
                        case 1:
                            System.out.printf("\t%s -- %S\n", movie.getName(), movie.getCategory());
                            break;
                        case 2:
                            break; // If they chose to add a movie, we don't want to show any of these
                        default:
                            if (movie.getCategory().equalsIgnoreCase(genres[choice-3])) {
                                System.out.printf("\t%s -- %S\n", movie.getName(), movie.getCategory());
                            }
                            break;
                    }
                }
            }
            if (choice == 2) {
                movieList = addMovie(movieList);
                genres = getGenres(movieList);
            }
        } while (choice != 0);
        // User must have typed 0, so time to exit
        System.out.println("\tGoodbye!");

    }

    private static Movie[] addMovie(Movie[] movieList) throws Exception {
        // if the user wants to add a movie, get the title and category, and add to the MovieList array
        String name = Input.getString("Enter the movie name: ");
        String category = Input.getString("Enter the movie category: ");

        // create a new Movie object
        Movie newMovie = new Movie(name, category);
        Movie[] newList = null;
        int length = 0;

        if (movieList != null) {
            newList = Arrays.copyOf(movieList, movieList.length + 1);
        } else {
            newList = new Movie[1]; // empty list was passed in, so return list will only have the one new movie in it
        }

        // add the new Movie to our MovieList array
        newList[newList.length-1] = newMovie;

        return newList;
    }

    private static String[] getGenres(Movie[] oldList) {
        int count = 1;
        String categories = oldList[0].getCategory();
        System.out.println(oldList.length);
        // "drama,action,horror"

        for (Movie movie : oldList) {
            System.out.println(movie.getName());
            if (!categories.contains(movie.getCategory())) {
                if (count > 0) {
                    categories += ",";
                }
                categories += movie.getCategory();
                count++;
            }
            System.out.println(categories);
            System.out.println(count);
        }

        return categories.split(",");
    }
}
