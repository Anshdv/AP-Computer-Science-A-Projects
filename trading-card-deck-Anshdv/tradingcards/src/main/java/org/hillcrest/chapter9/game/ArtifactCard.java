package main.java.org.hillcrest.chapter9.game;

/**
 * Subclass of Card representing a special item
 */
public class ArtifactCard extends Card {
    private String artifactType;
    private int durability;

    /**
     * Initializes a card of type ArtifactCard
     * @param name the name of the card
     * @param cost the cost of the card
     * @param rarity how rare the card is
     * @param artifactType the type of item it represents
     * @param durability the durability of the item
     */
    public ArtifactCard (String name, int cost, String rarity, String artifactType, int durability) {
        super(name, cost, rarity);
        this.artifactType = artifactType;
        this.durability = durability;
    }

    /**
     * Shows the name, type of artifact, and the durability of the card when playing it
     * @return the main attributes/play description (name, type of artifact, and durability)
     */
    protected String play() {
        return "Equipping Artifact: " + "[Artifact Type: " + artifactType + ", Durability: " + durability + "]";
    }

    /**
     * Shows a list of all the attributes of an Artifact card
     * @return all the attributes of an Artifact card
     */
    protected String inspect() {
        return "Name: " + name + "\nCost: " + cost + "\nRarity: " + rarity + "\nArtifact Type: " + artifactType + "\nDurability: " + durability;
    }

    /**
     * Shows type of card
     * @return type of card (Artifact)
     */
    protected String myType() {
        return "Artifact";
    }
}
