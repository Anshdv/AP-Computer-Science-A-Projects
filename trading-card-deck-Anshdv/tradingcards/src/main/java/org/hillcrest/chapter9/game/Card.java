package main.java.org.hillcrest.chapter9.game;

/**
 * General superclass for all types of cards
 */
public abstract class Card {
    protected String name;
    protected int cost;
    protected String rarity;

    /**
     * Initializes all objects of type Card
     * @param name the name of the card
     * @param cost the cost of the card
     * @param rarity how rare the card is
     */
    public Card(String name, int cost, String rarity) {
        this.name = name;
        this.cost = cost;
        this.rarity = rarity;
    }

    /**
     * Shows the description of playing a card
     * @return the description of the card
     */
    protected abstract String play();

    /**
     * Shows all attributes of a card
     * @return all the attributes of a card
     */
    protected abstract String inspect();

    /**
     * Shows type of card
     * @return the type of card
     */
    protected abstract String myType();
}
