package test.java.org.hillcrest.vote;

import main.java.org.hillcrest.vote.Candidate;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CandidateTest {

    @Test
    public void testGetName() {
        Candidate bob = new Candidate("Bob Brown");
        String expected = "Bob Brown";
        String actual = bob.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetVotes() {
        Candidate bob = new Candidate("Bob Black", 12);
        int expected = 12;
        int actual = bob.getVotes();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddVote() {
        Candidate bob = new Candidate("Bob Brooks");
        bob.addVote();
        int expected = 1;
        int actual = bob.getVotes();
        Assert.assertEquals(expected, actual);
    }
}
