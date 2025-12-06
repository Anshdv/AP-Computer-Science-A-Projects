package main.java.org.hillcrest.chapter9.game;

import java.util.ArrayList;

/**
 * Class managing all cards' functions
 */
public class DeckManager {
    private ArrayList<Card> cards = new ArrayList<>(0);

    /**
     * Adds Card object to card deck
     * @param card the card to be added to the card deck
     * @return message displaying the addition of card to card deck
     */
    protected String addCard(Card card) {
        cards.add(card);
        return "Card " + card.name + " added.";
    }

    /**
     * Removes specified card from card deck
     * @param cardName the name of the card to be removed
     * @return message displaying the deletion of card from card deck
     */
    protected String removeCard(String cardName) {
        for (Card card: cards) {
            if (card.name.equalsIgnoreCase(cardName)) {
                cards.remove(card);
                return "Card " + cardName + " removed.";
            }
        }
        return "Card not found.";
    }

    /**
     * Plays and removes a specified card from the card deck
     * @param cardName the name of the card to be played
     * @return message after playing the card
     */
    protected String playCard(String cardName) {
        for (Card card: cards) {
            if (card.name.equalsIgnoreCase(cardName)) {
                cards.remove(card);
                return card.play();
            }
        }
        return "Card not found.";
    }

    /**
     * Retrieves all the information of specified card
     * @param cardName the name of the card to be inspected
     * @return message displaying all the info of the card
     */
    protected String inspectCard(String cardName) {
        for (Card card: cards) {
            if (card.name.equalsIgnoreCase(cardName)) {
                return card.inspect();
            }
        }
        return "Card not found.";
    }

    /**
     * Lists all the card in the card deck
     * @return the list of all the cards in the deck
     */
    protected String listCards() {
        StringBuilder builder = new StringBuilder();
        for (Card card: cards) {
            builder.append(String.format("%s: (Type = %s, Cost = %d, Rarity = %s)\n", card.name, card.myType(), card.cost, card.rarity));
        }
        if (builder.length() > 2) {
            builder.delete(builder.length() - 1, builder.length());
        }
        return builder.toString();
    }
}
