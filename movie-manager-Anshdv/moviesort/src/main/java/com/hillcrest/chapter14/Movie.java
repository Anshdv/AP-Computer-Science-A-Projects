package main.java.com.hillcrest.chapter14;

/**
 * Template for a movie, with a title, director, year, and rating
 */
public class Movie {
    protected String title;
    protected String director;
    protected int year;
    protected double rating;

    /**
     * Creates an instance of a Movie
     * @param title the movie's title
     * @param director the movie's director
     * @param year the movie's release year
     * @param rating the movie's rating (out of 10)
     */
    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    /**
     * Provides the string representation of a Movie
     * @return the string representation of a Movie
     */
    @Override
    public String toString() {
        return String.format("%s; director = %s, rating = %.1f, year = %d", title, director, rating, year);
    }
}
