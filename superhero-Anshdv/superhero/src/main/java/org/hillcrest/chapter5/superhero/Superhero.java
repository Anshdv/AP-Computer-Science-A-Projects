package main.java.org.hillcrest.chapter5.superhero;

/**
 * Template for a powerful superhero
 */
public class Superhero {
    private String name;
    private Superpower primaryPower;
    private Superpower secondaryPower;
    private String origin;
    private double rating;

    /**
     * Creates a superhero with a name, primary power, a secondary power, and an origin
     * @param name the superhero's name
     * @param primaryPower the superhero's first power
     * @param secondaryPower the superhero's second power
     * @param origin the superhero's origin
     */
    public Superhero(String name, Superpower primaryPower, Superpower secondaryPower, String origin) {
        this.name = name;
        this.primaryPower = primaryPower;
        this.secondaryPower = secondaryPower;
        this.origin = origin;
        this.rating = RatingCalculator.calculateRating(primaryPower, secondaryPower, origin);
    }

    /**
     * Retrieves the superhero's name
     * @return the name of the superhero
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the superhero's primary power
     * @return the primary power of the superhero
     */
    public Superpower getPrimaryPower() {
        return primaryPower;
    }

    /**
     * Retrieves the superhero's secondary power
     * @return the secondary power of the superhero
     */
    public Superpower getSecondaryPower() {
        return secondaryPower;
    }

    /**
     * Retrieves the superhero's rating
     * @return the rating of the superhero
     */
    public double getRating() {
        return rating;
    }

    /**
     * Retrieves the superhero's origin
     * @return the origin of the superhero
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Set the superhero's rating
     * @param rating the rating the superhero's should be set to
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * Provides a concise description of the superhero
     * @return all the main info of the superhero
     */
    @Override
    public String toString() {
        return "Superhero{name='" + name + "', primaryPower=" + primaryPower +
                ", secondaryPower=" + secondaryPower + ", rating=" + rating + "}";
    }
}
