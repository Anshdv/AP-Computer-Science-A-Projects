package main.java.org.hillcrest.chapter6.password;

/**
 * Evaluates a password's strength by checking certain criteria
 */
public class CriteriaChecker {
    /**
     * Checks criteria for a strong password
     * @param password the password to determine the strength of
     * @return the number of criteria met
     */
    public static int evaluateCriteria(String password) {
        int criteriaCount = 0;
        String specialChars = "!@#$%^&*()-+=";

        // password has at least 8 characters
        if (password.length() >= 8) {
            criteriaCount++;
        }

        // password has at least one lowercase letter
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                criteriaCount++;
                break;
            }
        }

        // password has at least one uppercase letter
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                criteriaCount++;
                break;
            }
        }

        // password has at least one number
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                criteriaCount++;
                break;
            }
        }

        // password has at least one special character
        for (int i = 0; i < specialChars.length(); i++) {
            String c = specialChars.substring(i, i+1);
            if (password.contains(c)) {
                criteriaCount++;
                break;
            }
        }

        return criteriaCount;
    }

    /**
     * Corresponds numerical strength value to a string
     * @param score the number of criteria met by the password
     * @return the string form of the strength of the password
     */
    public static String determineStrength(int score) {
        String strength = "";

        switch (score) {
            case 0, 1:
                strength = "Very Weak";
                break;
            case 2:
                strength = "Weak";
                break;
            case 3:
                strength = "Moderate";
                break;
            case 4:
                strength = "Strong";
                break;
            case 5:
                strength = "Very Strong";
                break;
            default:
                break;
        }

        return strength;
    }
}
