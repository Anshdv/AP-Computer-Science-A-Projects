package main.java.org.hillcrest.vote;

/**
 * Template for a candidate running in an election
 * Counts votes for the candidate
 */
public class Candidate {

    private String name;
    private int votes;

    /**
     * Creates a candidate with the specified name and a default of zero votes
     * @param name the candidate's name
     */
    public Candidate(String name) {
        this.name = name;
    }

    /**
     * Creates a candidate with the specified name and specified number of votes
     * @param name the candidate's name
     * @param votes the candidate's starting number of votes
     */
    public Candidate(String name, int votes) {
        this.name = name;
        this.votes = votes;
    }

    /**
     * Adds one vote to the candidate's total votes
     */
    public void addVote() {
        votes += 1;
    }

    /**
     * Accesses total votes for the candidate
     * @return the candidate's total votes
     */
    public int getVotes() {
        return votes;
    }

    /**
     * Accesses the name of the candidate
     * @return the candidate's name
     */
    public String getName() {
        return name;
    }
}
