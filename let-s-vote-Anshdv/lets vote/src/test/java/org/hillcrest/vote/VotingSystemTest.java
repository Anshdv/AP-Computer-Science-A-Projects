package test.java.org.hillcrest.vote;

import main.java.org.hillcrest.vote.Candidate;
import main.java.org.hillcrest.vote.VotingSystem;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class VotingSystemTest {

    @Test
    public void testIndependent(){
        Candidate republicanBob = new Candidate("Bob Brown");
        Candidate democraticBob = new Candidate("Bob Black");
        Candidate independentBob = new Candidate("Bob Brooks");
        VotingSystem testVotingSystem = new VotingSystem(republicanBob, democraticBob, independentBob);
        testVotingSystem.voteForIndependent();
        int expected = 1;
        int actual = testVotingSystem.getVotesForIndependent();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDemocrat(){
        Candidate republicanBob = new Candidate("Bob Brown");
        Candidate democraticBob = new Candidate("Bob Black");
        Candidate independentBob = new Candidate("Bob Brooks");
        VotingSystem testVotingSystem = new VotingSystem(republicanBob, democraticBob, independentBob);
        testVotingSystem.voteForDemocratic();
        testVotingSystem.voteForDemocratic();
        int expected = 2;
        int actual = testVotingSystem.getVotesForDemocratic();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRepublican(){
        Candidate republicanBob = new Candidate("Bob Brown");
        Candidate democraticBob = new Candidate("Bob Black");
        Candidate independentBob = new Candidate("Bob Brooks");
        VotingSystem testVotingSystem = new VotingSystem(republicanBob, democraticBob, independentBob);
        testVotingSystem.voteForRepublican();
        testVotingSystem.voteForRepublican();
        testVotingSystem.voteForRepublican();
        int expected = 3;
        int actual = testVotingSystem.getVotesForRepublican();
        Assert.assertEquals(expected, actual);
    }
}