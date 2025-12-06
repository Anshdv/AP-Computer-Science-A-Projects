package test.java.com.hillcrest.chapter14;

import main.java.com.hillcrest.chapter14.Movie;
import main.java.com.hillcrest.chapter14.MovieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class MovieManagerTest {
    @Test
    public void testSortDirector() {
        ArrayList<Movie> myMovies = new ArrayList<>();
        myMovies.add(new Movie("Avatar", "James Cameron", 2009, 7.9));
        myMovies.add(new Movie("Avengers: Endgame", "Anthony Russo & Joe Russo", 2019, 8.4));
        myMovies.add(new Movie("Inception", "Christopher Nolan", 2010, 8.8));
        var myManager = new MovieManager(myMovies);

        String actual = myManager.sortByDirector();
        String expected = "Movies now sorted by director!";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortRating() {
        ArrayList<Movie> myMovies = new ArrayList<>();
        myMovies.add(new Movie("Avatar", "James Cameron", 2009, 7.9));
        myMovies.add(new Movie("Avengers: Endgame", "Anthony Russo & Joe Russo", 2019, 8.4));
        myMovies.add(new Movie("Inception", "Christopher Nolan", 2010, 8.8));
        var myManager = new MovieManager(myMovies);

        String actual = myManager.sortByRating();
        String expected = "Movies now sorted by rating!";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortTitle() {
        ArrayList<Movie> myMovies = new ArrayList<>();
        myMovies.add(new Movie("Avatar", "James Cameron", 2009, 7.9));
        myMovies.add(new Movie("Avengers: Endgame", "Anthony Russo & Joe Russo", 2019, 8.4));
        myMovies.add(new Movie("Inception", "Christopher Nolan", 2010, 8.8));
        var myManager = new MovieManager(myMovies);

        String actual = myManager.sortByTitle();
        String expected = "Movies now sorted by title!";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortYear() {
        ArrayList<Movie> myMovies = new ArrayList<>();
        myMovies.add(new Movie("Avatar", "James Cameron", 2009, 7.9));
        myMovies.add(new Movie("Avengers: Endgame", "Anthony Russo & Joe Russo", 2019, 8.4));
        myMovies.add(new Movie("Inception", "Christopher Nolan", 2010, 8.8));
        var myManager = new MovieManager(myMovies);

        String actual = myManager.sortByYear();
        String expected = "Movies now sorted by release year!";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddMovie() {
        ArrayList<Movie> myMovies = new ArrayList<>();
        myMovies.add(new Movie("Avatar", "James Cameron", 2009, 7.9));
        myMovies.add(new Movie("Avengers: Endgame", "Anthony Russo & Joe Russo", 2019, 8.4));
        myMovies.add(new Movie("Inception", "Christopher Nolan", 2010, 8.8));
        var myManager = new MovieManager(myMovies);

        String actual = myManager.addMovie(new Movie("Titanic", "James Cameron", 1997, 7.9));
        String expected = "\nTitanic added!";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testListMovies() {
        ArrayList<Movie> myMovies = new ArrayList<>();
        myMovies.add(new Movie("Avatar", "James Cameron", 2009, 7.9));
        myMovies.add(new Movie("Avengers: Endgame", "Anthony Russo & Joe Russo", 2019, 8.4));
        myMovies.add(new Movie("Inception", "Christopher Nolan", 2010, 8.8));
        var myManager = new MovieManager(myMovies);

        String actual = myManager.listMovies();
        String expected = """
                Current Movie List:
                1) Avatar; director = James Cameron, rating = 7.9, year = 2009
                2) Avengers: Endgame; director = Anthony Russo & Joe Russo, rating = 8.4, year = 2019
                3) Inception; director = Christopher Nolan, rating = 8.8, year = 2010""";
        Assertions.assertEquals(expected, actual);
    }
}
