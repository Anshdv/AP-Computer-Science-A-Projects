package main.java.org.hillcrest.chapter9.game;

/**
 * Subclass of SpellCard with a condition specifying when to execute the card
 */
public class TrapCard extends SpellCard {
    private String triggerCondition;

    /**
     * Initializes a card of type TrapCard
     * @param name the name of the card
     * @param cost the cost of the card
     * @param rarity how rare the card is
     * @param effectDescription the effect of the card
     * @param triggerCondition when to play the card
     */
    public TrapCard(String name, int cost, String rarity, String effectDescription, String triggerCondition) {
        super(name, cost, rarity, effectDescription);
        this.triggerCondition = triggerCondition;
    }

    /**
     * Shows the name, trigger condition, and effect of the card when playing it
     * @return the main attributes/play description (name, condition, and effect)
     */
    protected String play() {
        return "Casting Spell: " + name + " [Trigger Condition: " + triggerCondition + ", Effect: " + effectDescription + "]";
    }

    /**
     * Shows a list of all the attributes of a Trap card
     * @return all the attributes of a Trap card
     */
    protected String inspect() {
        return "Name: " + name + "\nCost: " + cost + "\nRarity: " + rarity + "\nEffect: " + effectDescription + "\nTrigger Condition: " + triggerCondition;
    }

    /**
     * Shows type of card
     * @return type of card (Trap)
     */
    protected String myType() {
        return "Trap";
    }
}
