package main.java.org.hillcrest.chapter11.studentgrader;
import java.util.ArrayList;

/**
 * Template for a student's record
 */
public class StudentRecord {
    private String name;
    private ArrayList<Double> scores;

    /**
     * Initializes a student record
     * @param name the student's name
     * @param scores the student's scores
     */
    public StudentRecord(String name, ArrayList<Double> scores) {
        this.name = name;
        this.scores = scores;
    }

    /**
     * Retrieves the name of the student
     * @return the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Calculates the average score of the student
     * @return the student's average score
     */
    public double getAverage() {
        if (scores.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (double score : scores) {
            sum += score;
        }

        return Math.round((sum / scores.size()) * 100) / 100.0;
    }
}
