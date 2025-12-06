package main.java.org.hillcrest.chapter10;

/**
 * Template for a pet kitten, with attributes and behaviors
 */
public class AstralKitten implements CyberPet {
    private String cosmicPower;
    private int starAffinity;

    /**
     * Creates an AstralKitten object
     */
    public AstralKitten() {
        this.cosmicPower = "low";
        this.starAffinity = 1;
    }

    /**
     * Unique behavior of the pet kitten
     * @return description of the behavior of the kitten
     */
    public String telekinesis() {
        return "Kitten focuses cosmic energy, levitating nearby objects!";
    }

    /**
     * Feeds the pet kitten, changing its status appropriately
     * @return description of the pet kitten after eating
     */
    @Override
    public String feed() {
        cosmicPower = "high";
        starAffinity += 2;
        return "Kitten eats powerful radiation! Cosmic Power = " + cosmicPower + ", Star Affinity = " + starAffinity;
    }

    /**
     * Allows the pet kitten to play with a toy, changing its status appropriately
     * @param toy the toy to play with
     * @return description of the pet kitten after playing
     */
    @Override
    public String playToy(String toy) {
        return "Kitten purrs, absorbing cosmic rays, and blasts the " + toy + " into pieces! Cosmic Power = " + cosmicPower + ", Star Affinity = " + starAffinity;
    }

    /**
     * The string representation of the pet
     * @return Astral Kitten
     */
    @Override
    public String toString() {
        return "Astral Kitten";
    }
}
