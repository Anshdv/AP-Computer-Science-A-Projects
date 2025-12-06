package main.java.com.hillcrest.chapter14;
import java.util.Comparator;

/**
 * Used to compare the directors of different movies
 */
public class DirectorComparator implements Comparator<Movie> {
    /**
     * Compares the directors of two movies
     * @param o1 the first movie to be compared
     * @param o2 the second movie to be compared
     * @return the result of the comparison (for an alphabetical order)
     */
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.director.compareTo(o2.director);
    }
}
