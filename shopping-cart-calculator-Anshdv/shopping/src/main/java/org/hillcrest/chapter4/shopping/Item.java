package main.java.org.hillcrest.chapter4.shopping;

/**
 * Template for an Item to add to your shopping cart
 * Has a name, price, and quantity
 */
public class Item {

    private String name;
    private double price;
    private int quantity;

    /**
     * Creates a basic item with name as "Random Item", price as $1, and quantity as 1
     */
    public Item() {
        name = "Random Item";
        price = 1.00;
        quantity = 1;
    }

    /**
     * Creates an item with the specified name. price, and quantity
     * @param name the item's name
     * @param price the item's price
     * @param quantity how much of the item is being purchased
     */
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Sets the name of the item to the specified name
     * @param name the name that the item's name should be set to
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the price of the item to the specified price
     * @param price the price that the item's price should be set to
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets the quantity of the item to the specified quantity
     * @param quantity the amount of the item that is being purchased
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Retrieves the item's name
     * @return the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves item's price
     * @return the price of the item
     */
    public double getPrice() {
        return price;
    }

    /**
     * Retrieves the item's quantity
     * @return how much of the item is being purchased
     */
    public int getQuantity() {
        return quantity;
    }
}
