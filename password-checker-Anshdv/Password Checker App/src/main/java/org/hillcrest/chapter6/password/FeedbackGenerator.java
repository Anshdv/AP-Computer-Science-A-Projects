package main.java.org.hillcrest.chapter6.password;

/**
 * Suggests improvements to make a weak password strong
 */
public class FeedbackGenerator {
    /**
     * Checks which criteria is not met and suggest to implement those in the password
     * @param password the password to be improved
     * @return the suggestions to improve the password
     */
    public static String generateFeedback(String password) {
        String feedback = "";
        String specialChars = "!@#$%^&*()-+=";

        // password has at least 8 characters
        if (password.length() < 8) {
            feedback += "\t- Increase the length to at least 8 characters.\n";
        }

        // password has at least one lowercase letter
        if (password.equals(password.toUpperCase())) {
            feedback += "\t- Add at least one lowercase letter.\n";
        }

        // password has at least one uppercase letter
        if (password.equals(password.toLowerCase())) {
            feedback += "\t- Add at least one uppercase letter.\n";
        }

        // password has at least one number
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!(hasDigit)) {
            feedback += "\t- Add at least one number.\n";
        }

        // password has at least one special character
        boolean hasSpecialCharacter = false;
        for (int i = 0; i < specialChars.length(); i++) {
            String c = specialChars.substring(i, i+1);
            if (password.contains(c)) {
                hasSpecialCharacter = true;
                break;
            }
        }
        if (!(hasSpecialCharacter)) {
            feedback += "\t- Include at least one special character.\n";
        }

        return feedback;
    }
}
