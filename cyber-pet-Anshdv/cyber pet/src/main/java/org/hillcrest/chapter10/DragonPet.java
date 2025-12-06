package main.java.org.hillcrest.chapter10;

/**
 * Template for a pet dragon, with attributes and behaviors
 */
public class DragonPet implements CyberPet {
    private String name;
    private int hungerLevel;
    private int mood;

    /**
     * Creates a DragonPet object
     * @param name the name of the pet dragon
     */
    public DragonPet(String name) {
        this.name = name;
        this.hungerLevel = 5;
        this.mood = 5;
    }

    /**
     * Unique behavior of the pet dragon
     * @return description of the behavior of the dragon
     */
    public String breatheFire() {
        return "Dragon " + name + " breathes fire! Everything is ablaze!";
    }

    /**
     * Feeds the pet dragon, changing its status appropriately
     * @return description of the pet dragon after eating
     */
    @Override
    public String feed() {
        hungerLevel--;
        mood++;
        return "Dragon " + name + " devours a pile of gold coins! Hunger = " + hungerLevel + ", Mood = " + mood;
    }

    /**
     * Allows the pet dragon to play with a toy, changing its status appropriately
     * @param toy the toy to play with
     * @return description of the pet dragon after playing
     */
    @Override
    public String playToy(String toy) {
        mood += 2;
        return "Dragon " + name + " roars happily, scorching the " + toy + "! Mood = " + mood;
    }

    /**
     * The string representation of the pet
     * @return Dragon Pet
     */
    @Override
    public String toString() {
        return "Dragon Pet";
    }
}
