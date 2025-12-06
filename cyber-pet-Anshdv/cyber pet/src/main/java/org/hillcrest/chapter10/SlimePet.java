package main.java.org.hillcrest.chapter10;

/**
 * Template for a pet slime, with attributes and behaviors
 */
public class SlimePet implements CyberPet {
    private String color;
    private double size;
    private int squishiness;

    /**
     * Creates a SlimePet object
     * @param color the color of the pet slime
     */
    public SlimePet(String color) {
        this.color = color;
        this.size = 1.0;
        this.squishiness = 3;
    }

    /**
     * Unique behavior of the pet slime
     * @return description of the behavior of the slime
     */
    public String divide() {
        size /= 2;
        squishiness++;
        return color + " slime divides! Two smaller slimes appear!";
    }

    /**
     * Feeds the pet slime, changing its status appropriately
     * @return description of the pet slime after eating
     */
    @Override
    public String feed() {
        size += 0.5;
        return color + " slime enlarges after its meal! Size = " + size;
    }

    /**
     * Allows the pet slime to play with a toy, changing its status appropriately
     * @param toy the toy to play with
     * @return description of the pet slime after playing
     */
    @Override
    public String playToy(String toy) {
        return color + " slime wiggles around the " + toy + ". Squishy sounds echo...";
    }

    /**
     * The string representation of the pet
     * @return Slime Pet
     */
    @Override
    public String toString() {
        return "Slime Pet";
    }
}
