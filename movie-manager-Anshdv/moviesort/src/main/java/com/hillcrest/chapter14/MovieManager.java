package main.java.com.hillcrest.chapter14;
import java.util.ArrayList;

/**
 * Used to manage a list of Movies
 */
public class MovieManager {
    private ArrayList<Movie> movies;

    /**
     * Creates a manager for the list of movies
     * @param movies the list of movies
     */
    public MovieManager(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    /**
     * Sorts the list of movies by their directors
     * @return a message confirming the sort by directors
     */
    public String sortByDirector() {
        movies.sort(new DirectorComparator());
        return "Movies now sorted by director!";
    }

    /**
     * Sorts the list of movies by their ratings
     * @return a message confirming the sort by ratings
     */
    public String sortByRating() {
        movies.sort(new RatingComparator());
        return "Movies now sorted by rating!";
    }

    /**
     * Sorts the list of movies by their titles
     * @return a message confirming the sort by titles
     */
    public String sortByTitle() {
        movies.sort(new TitleComparator());
        return "Movies now sorted by title!";
    }

    /**
     * Sorts the list of movies by their release years
     * @return a message confirming the sort by years
     */
    public String sortByYear() {
        movies.sort(new YearComparator());
        return "Movies now sorted by release year!";
    }

    /**
     * Adds a movie to the list of movies
     * @param movie the Movie to add to the list of movies
     * @return a message confirming the addition of the movie
     */
    public String addMovie(Movie movie) {
        movies.add(movie);
        return "\n" + movie.title + " added!";
    }

    /**
     * Displays all the movies in the list of movies
     * @return a string consisting of all the string representations of the movies
     */
    public String listMovies() {
        StringBuilder builder = new StringBuilder();
        builder.append("Current Movie List:");

        int counter = 1;
        for (Movie movie: movies) {
            builder.append("\n").append(counter).append(") ").append(movie.toString());
            counter++;
        }

        return builder.toString();
    }
}
