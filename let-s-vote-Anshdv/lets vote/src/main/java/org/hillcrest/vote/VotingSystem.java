package main.java.org.hillcrest.vote;

/**
 * Template for a simulation of an election
 * Keeps track of votes for each candidate running in the election
 */
public class VotingSystem {

    private Candidate republicanCandidate;
    private Candidate democraticCandidate;
    private Candidate independentCandidate;

    /**
     * Initializes the system with three candidates from different parties
     * @param republican the republican party candidate
     * @param democratic the democratic party candidate
     * @param independent the independent party candidate
     */
    public VotingSystem(Candidate republican, Candidate democratic, Candidate independent) {
        republicanCandidate = republican;
        democraticCandidate = democratic;
        independentCandidate = independent;
    }

    /**
     * Adds one vote to the republican's votes
     */
    public void voteForRepublican() {
        republicanCandidate.addVote();
    }

    /**
     * Adds one vote to the democrat's votes
     */
    public void voteForDemocratic() {
        democraticCandidate.addVote();
    }

    /**
     * Adds one vote to the independent's votes
     */
    public void voteForIndependent() {
        independentCandidate.addVote();
    }

    /**
     * Accesses the total votes for the republican candidate
     * @return the republican's total votes
     */
    public int getVotesForRepublican() {
        return republicanCandidate.getVotes();
    }

    /**
     * Accesses the total votes for the democratic candidate
     * @return the democrat's total votes
     */
    public int getVotesForDemocratic() {
        return democraticCandidate.getVotes();
    }

    /**
     * Accesses the total votes for the independent candidate
     * @return the independent's total votes
     */
    public int getVotesForIndependent() {
        return independentCandidate.getVotes();
    }

    /**
     * Accesses the total votes across all candidates in the voting system
     * @return all candidates' votes summed up
     */
    public int getTotalVotes() {
        return getVotesForRepublican() + getVotesForDemocratic() + getVotesForIndependent();
    }
}
