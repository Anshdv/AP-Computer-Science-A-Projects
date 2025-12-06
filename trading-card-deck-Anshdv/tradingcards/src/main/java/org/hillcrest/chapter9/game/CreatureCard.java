package main.java.org.hillcrest.chapter9.game;

/**
 * Subclass of Card with attack and defense attributes
 */
public class CreatureCard extends Card {
    private int attack;
    private int defense;

    /**
     * Initializes a card of type CreatureCard
     * @param name the name of the card
     * @param cost the cost of the card
     * @param rarity how rare the card is
     * @param attack how much damage it deals
     * @param defense how much damage it can subtract from an attack
     */
    public CreatureCard (String name, int cost, String rarity, int attack, int defense) {
        super(name, cost, rarity);
        this.attack = attack;
        this.defense = defense;
    }

    /**
     * Shows the name, attack, and defense of the card when playing it
     * @return the main attributes/play description (name, attack, and defense)
     */
    protected String play() {
        return "Summoning Creature: " + name + " [Attack: " + attack + ", Defense: " + defense + "]";
    }

    /**
     * Shows a list of all the attributes of a Creature card
     * @return all the attributes of a Creature card
     */
    protected String inspect() {
        return "Name: " + name + "\nCost: " + cost + "\nRarity: " + rarity + "\nAttack: " + attack + "\nDefense: " + defense;
    }

    /**
     * Shows the type of card
     * @return type of card (Creature)
     */
    protected String myType() {
        return "Creature";
    }
}
