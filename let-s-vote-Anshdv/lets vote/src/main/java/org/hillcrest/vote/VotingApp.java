package main.java.org.hillcrest.vote;

public class VotingApp {

    public static void main(String[] args) {
        // candidates
        Candidate republican = new Candidate("Donald Trump");
        Candidate democratic = new Candidate("Kamala Harris");
        Candidate independent = new Candidate("Jill Stein");

        VotingSystem theVotingSystem = new VotingSystem(republican, democratic, independent);

        // voting
        theVotingSystem.voteForRepublican(); theVotingSystem.voteForRepublican();
        theVotingSystem.voteForDemocratic(); theVotingSystem.voteForIndependent();
        theVotingSystem.voteForDemocratic(); theVotingSystem.voteForDemocratic();
        theVotingSystem.voteForIndependent(); theVotingSystem.voteForIndependent();
        theVotingSystem.voteForDemocratic(); theVotingSystem.voteForDemocratic();
        theVotingSystem.voteForIndependent(); theVotingSystem.voteForIndependent();
        theVotingSystem.voteForDemocratic(); theVotingSystem.voteForRepublican();
        theVotingSystem.voteForIndependent(); theVotingSystem.voteForRepublican();
        theVotingSystem.voteForRepublican(); theVotingSystem.voteForIndependent();
        theVotingSystem.voteForIndependent(); theVotingSystem.voteForDemocratic();
        theVotingSystem.voteForRepublican(); theVotingSystem.voteForIndependent();
        theVotingSystem.voteForDemocratic(); theVotingSystem.voteForRepublican();

        System.out.println("Candidate: " + "Republican " + republican.getName() + ", Votes: " + theVotingSystem.getVotesForRepublican());
        System.out.println("Candidate: " + "Democratic " + democratic.getName() + ", Votes: " + theVotingSystem.getVotesForDemocratic());
        System.out.println("Candidate: " + "Independent " + independent.getName() + ", Votes: " + theVotingSystem.getVotesForIndependent());
        System.out.println("Total Votes: " + theVotingSystem.getTotalVotes());
    }
}
