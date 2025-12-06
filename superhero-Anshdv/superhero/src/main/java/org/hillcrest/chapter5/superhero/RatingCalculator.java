package main.java.org.hillcrest.chapter5.superhero;

/**
 * Calculates the overall rating of the custom superhero based on their uniqueness and powers
 */
public class RatingCalculator {

    /**
     * Combines all different aspects of the superhero to calculate final rating
     * @param primaryPower the superhero's primary power
     * @param secondaryPower the superhero's secondary power
     * @param origin where/how the superhero came from
     * @return the final rating of the superhero
     */
    public static double calculateRating(Superpower primaryPower, Superpower secondaryPower, String origin) {
        double rating = getOriginModifier(getBaseScore(primaryPower) + getBaseScore(secondaryPower) + getCompatibilityBonus(primaryPower, secondaryPower), origin);
        if (rating > 100) {
            rating = 100;
        }
        return rating;
    }

    /**
     * gets the individual rating of each of the superhero's powers
     * @param power the power to get the base rating of
     * @return the power's rating
     */
    public static double getBaseScore(Superpower power) {
        double baseScore = 0;
        switch (power.getPowerName().toLowerCase()) {
            case "strength":
                baseScore = 45;
                break;
            case "flight":
                baseScore = 40;
                break;
            case "invisibility":
                baseScore = 35;
                break;
            case "energy blast":
                baseScore = 50;
                break;
            case "speed":
                baseScore = 48;
                break;
            case "invulnerability":
                baseScore = 50;
                break;
            case "stealth":
                baseScore = 30;
                break;
            case "telepathy":
                baseScore = 25;
                break;
        }
        return baseScore;
    }

    /**
     * checks for a bonus rating for certain combinations of powers
     * @param primary the superhero's primary power
     * @param secondary the superhero's secondary power
     * @return the bonus rating for the combination of powers
     */
    public static double getCompatibilityBonus(Superpower primary, Superpower secondary) {
        double bonus = 0;
        if ((primary.getPowerName().equalsIgnoreCase("Strength") && secondary.getPowerName().equalsIgnoreCase("Invulnerability")) || (primary.getPowerName().equalsIgnoreCase("Invulnerability") && secondary.getPowerName().equalsIgnoreCase("Strength"))) {
            bonus = 20;
        } else if ((primary.getPowerName().equalsIgnoreCase("Flight") && secondary.getPowerName().equalsIgnoreCase("Speed")) || (primary.getPowerName().equalsIgnoreCase("Speed") && secondary.getPowerName().equalsIgnoreCase("Flight"))) {
            bonus = 15;
        } else if ((primary.getPowerName().equalsIgnoreCase("Invisibility") && secondary.getPowerName().equalsIgnoreCase("Stealth")) || (primary.getPowerName().equalsIgnoreCase("Stealth") && secondary.getPowerName().equalsIgnoreCase("Invisibility"))) {
            bonus = 10;
        } else if ((primary.getPowerName().equalsIgnoreCase("Energy Blast") && secondary.getPowerName().equalsIgnoreCase("Telepathy")) || (primary.getPowerName().equalsIgnoreCase("Telepathy") && secondary.getPowerName().equalsIgnoreCase("Energy Blast"))) {
            bonus = 10;
        }
        return bonus;
    }

    /**
     * checks for bonus rating for certain origins of the superhero
     * @param baseRating the superhero's powers' ratings (including bonuses)
     * @param origin the superhero's origin
     * @return the bonus rating of the origin
     */
    public static double getOriginModifier(double baseRating, String origin) {
        double originBonus = 0;
        switch (origin.toLowerCase()) {
            case "alien planet":
                originBonus = baseRating * 1.1;
                break;
            case "genetic mutation":
                originBonus = baseRating * 1.05;
                break;
            case "accidental experiment":
                originBonus = baseRating * 1;
                break;
        }
        return originBonus;
    }
}
