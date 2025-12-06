package test.java.com.hillcrest.chapter14;

import main.java.com.hillcrest.chapter14.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieTest {
    @Test
    public void testToString() {
        Movie myMovie = new Movie("Avatar", "James Cameron", 2009, 7.9);
        String actual = myMovie.toString();
        String expected = "Avatar; director = James Cameron, rating = 7.9, year = 2009";
        Assertions.assertEquals(expected, actual);
    }
}
