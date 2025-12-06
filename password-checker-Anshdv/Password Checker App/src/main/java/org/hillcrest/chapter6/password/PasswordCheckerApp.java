package main.java.org.hillcrest.chapter6.password;

import java.util.Scanner;

/**
 * Runnable code for the user to check their password's strength with
 */
public class PasswordCheckerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nWelcome to the Password Strength Checker!\n");

        // prompt user to enter password
        System.out.print("Enter in your password: ");
        String userPassword = in.nextLine();

        // check password strength
        int passwordScore = CriteriaChecker.evaluateCriteria(userPassword);
        String passwordStrength = CriteriaChecker.determineStrength(passwordScore);

        // output results
        System.out.printf("\nPassword Strength: %s (%d/5)", passwordStrength, passwordScore);
        if (passwordScore < 5) {
            System.out.println("\nSuggestions to improve your password:");
            System.out.println(FeedbackGenerator.generateFeedback(userPassword));
        }
    }
}
