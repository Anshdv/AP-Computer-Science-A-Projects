package main.java.com.hillcrest.chapter14;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * An interface a user can utilize to add and sort Movies
 */
public class MovieApp {
    /**
     * the main method (front-end)
     * @param args the arguments passed into the program
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Movie> myMovies = new ArrayList<>();
        var myMovieManager = new MovieManager(myMovies);

        while (true) {
            System.out.println("""
                    \n----- MOVIE SORT MENU -----
                    1) Add Movie
                    2) Sort by Title
                    3) Sort by Director
                    4) Sort by Rating
                    5) Sort by Year
                    6) List Movies
                    7) Exit
                    --------------------------""");
            System.out.print("\nEnter your choice: ");

            if (in.hasNextInt()) {
                int choice = in.nextInt();

                if (1 <= choice && choice <= 7) {
                    in.nextLine();

                    if (choice == 1) {
                        addMovie(in, myMovieManager);
                        continue;
                    } else if (choice == 2) {
                        System.out.println("\nSorting by title (A -> Z)...");
                        System.out.println(myMovieManager.sortByTitle());
                        continue;
                    } else if (choice == 3) {
                        System.out.println("\nSorting by director (A -> Z)...");
                        System.out.println(myMovieManager.sortByDirector());
                        continue;
                    } else if (choice == 4) {
                        System.out.println("\nSorting by rating (descending)...");
                        System.out.println(myMovieManager.sortByRating());
                        continue;
                    } else if (choice == 5) {
                        System.out.println("\nSorting by year (descending)...");
                        System.out.println(myMovieManager.sortByYear());
                        continue;
                    } else if (choice == 6) {
                        System.out.println(myMovieManager.listMovies());
                        continue;
                    } else {
                        System.out.println("\nGoodbye!");
                        break;
                    }
                }
            }

            System.out.println("You did not enter one of the choices. Try again.");
            in.nextLine();
        }
    }

    /**
     * Adds a movie to the list of movies through the movie list manager
     * @param scanner the reader used for user input
     * @param movieManager the manager used to add the movie to the list
     */
    private static void addMovie(Scanner scanner, MovieManager movieManager) {
        System.out.print("\nEnter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter movie director: ");
        String director = scanner.nextLine();
        System.out.print("Enter movie rating: ");
        double rating = scanner.nextDouble();
        System.out.print("Enter movie release year: ");
        int year = scanner.nextInt();

        Movie newMovie = new Movie(title, director, year, rating);
        System.out.println(movieManager.addMovie(newMovie));
    }
}
