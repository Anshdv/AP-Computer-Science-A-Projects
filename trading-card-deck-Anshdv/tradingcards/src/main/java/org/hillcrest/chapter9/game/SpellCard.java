package main.java.org.hillcrest.chapter9.game;

/**
 * Subclass of Card with a specific effect
 */
public class SpellCard extends Card {
    protected String effectDescription;

    /**
     * Initializes a card of type SpellCard
     * @param name the name of the card
     * @param cost the cost of the card
     * @param rarity how rare the card is
     * @param effectDescription the effect of the card
     */
    public SpellCard (String name, int cost, String rarity, String effectDescription) {
        super(name, cost, rarity);
        this.effectDescription = effectDescription;
    }

    /**
     * Shows the name and effect of the card when playing it
     * @return the main attributes/play description (name and effect)
     */
    protected String play() {
        return "Casting Spell: " + name + " [Effect: " + effectDescription + "]";
    }

    /**
     * Shows a list of all the attributes of a Spell card
     * @return all the attributes of a Creature card
     */
    protected String inspect() {
        return "Name: " + name + "\nCost: " + cost + "\nRarity: " + rarity + "\nEffect: " + effectDescription;
    }

    /**
     * Shows the type of card
     * @return the type of card (Spell)
     */
    protected String myType() {
        return "Spell";
    }
}
