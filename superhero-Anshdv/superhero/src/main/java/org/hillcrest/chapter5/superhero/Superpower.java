package main.java.org.hillcrest.chapter5.superhero;

/**
 * Template for a superpower for the superhero
 */
public class Superpower {
    private String powerName;
    private String description;
    private String weakness;

    /**
     * Creates a superpower with a name and a description
     * @param powerName the superpower's name
     * @param description the superpower's description
     */
    public Superpower(String powerName, String description) {
        this.powerName = powerName;
        this.description = description;
        this.weakness = calculateWeakness(powerName);
    }

    /**
     * Retrieves the superpower's name
     * @return the name of the superpower
     */
    public String getPowerName() {
        return powerName;
    }

    /**
     * Retrieves the superpower's description
     * @return the description of the superpower
     */
    public String getDescription() {
        return description;
    }

    /**
     * Retrieves the superpower's weakness
     * @return the weakness associated with the superpower
     */
    public String getWeakness() {
        return weakness;
    }

    /**
     * Retrieves the all the possible superpowers
     * @return all the valid superpowers
     */
    public static String getAvailablePowers() {
        return """
                strength, flight, invisibility, energy blast, speed, invulnerability, stealth, telepathy
                """;
    }

    /**
     * Calculates the weakness associated with a certain power
     * @param powerName the name of the power to calculate the weakness of
     * @return the power's weakness
     */
    public String calculateWeakness(String powerName) {
        switch (powerName.toLowerCase()) {
            case "strength":
                weakness = "kryptonite";
                break;
            case "flight":
                weakness = "strong winds";
                break;
            case "invisibility":
                weakness = "loud noises";
                break;
            case "energy blast":
                weakness = "overheating";
                break;
            case "speed":
                weakness = "slippery surfaces";
                break;
            case "invulnerability":
                weakness = "emotional vulnerability";
                break;
            case "stealth":
                weakness = "bright light";
                break;
            case "telepathy":
                weakness = "mind clutter";
                break;
            default: weakness = "";
        }
        return weakness;
    }

    /**
     * Provides a concise description of the superpower
     * @return all the main info of the superpower
     */
    @Override
    public String toString() {
        return "Superpower{name='" + powerName + "', description='" + description +
                "', weakness='" + weakness + "'}";
    }
}
