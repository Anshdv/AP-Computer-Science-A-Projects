package main.java.com.hillcrest.chapter14;
import java.util.Comparator;

/**
 * Used to compare the release years of different movies
 */
public class YearComparator implements Comparator<Movie> {
    /**
     * Compares the years of two movies
     * @param o1 the first movie to be compared
     * @param o2 the second movie to be compared
     * @return the result of the comparison (for a descending order)
     */
    @Override
    public int compare(Movie o1, Movie o2) {
        if (o1.year < o2.year) {
            return 1;
        } else if (o1.year > o2.year) {
            return -1;
        } else {
            return 0;
        }
    }
}
