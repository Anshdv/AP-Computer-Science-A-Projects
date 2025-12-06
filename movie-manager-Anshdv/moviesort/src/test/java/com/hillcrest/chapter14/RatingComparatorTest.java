package test.java.com.hillcrest.chapter14;

import main.java.com.hillcrest.chapter14.Movie;
import main.java.com.hillcrest.chapter14.RatingComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RatingComparatorTest {
    @Test
    public void testCompare() {
        Movie avatar = new Movie("Avatar", "James Cameron", 2009, 7.9);
        Movie avengersEndgame = new Movie("Avengers: Endgame", "Anthony Russo & Joe Russo", 2019, 8.4);
        var comparator = new RatingComparator();

        int actual = comparator.compare(avatar, avengersEndgame);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}
