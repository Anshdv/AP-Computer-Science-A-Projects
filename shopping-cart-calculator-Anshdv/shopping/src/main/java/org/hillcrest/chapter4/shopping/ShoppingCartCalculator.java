package main.java.org.hillcrest.chapter4.shopping;

/**
 * Creates a virtual shopping cart/cash register
 * Calculates the subtotal and total, after tax and shipping costs
 */
public class ShoppingCartCalculator {

    private static final double TAX_RATE = 0.08;
    private static final double SHIPPING_COST = 15.00;

    /**
     * Calculates the subtotal of all of one item
     * @param item an Item object, of which the subtotal is calculated
     * @return how much of the item is being purchased, times, the price of the item
     */
    public static double calculateSubtotal(Item item) {
        double subtotal = item.getPrice() * item.getQuantity();
        return subtotal;
    }

    /**
     * Calculates the tax on the subtotal of all the items in your shopping cart
     * @param subtotal the total raw cost of all the items
     * @return the subtotal (raw cost of all items), times, the tax rate (8%)
     */
    public static double calculateSalesTax(double subtotal) {
        double salesTax = subtotal * TAX_RATE;
        return salesTax;
    }

    /**
     * Calculates the shipping cost on the whole order
     * @param subtotal the total price of all the items
     * @return the shipping cost ($15)
     */
    public static double calculateShipping(double subtotal) {
        return SHIPPING_COST;
    }

    /**
     * Calculates the total cost of the entire transaction
     * @param subtotal the total raw cost of all the items
     * @param tax the total tax on the subtotal
     * @param shipping the shipping cost
     * @return the final price of the whole purchase
     */
    public static double calculateTotal(double subtotal, double tax, double shipping) {
        double total = subtotal + tax + shipping;
        return total;
    }
}
