package test.java.org.hillcrest.chapter4.shopping;

import main.java.org.hillcrest.chapter4.shopping.Item;
import main.java.org.hillcrest.chapter4.shopping.ShoppingCartCalculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests methods for ShoppingCartCalculator class
 */
public class ShoppingCartCalculatorTest {

    /**
     * Tests calculateSubtotal method from ShoppingCartCalculator
     */
    @Test
    public void calculateSubtotalTest() {
        var myCart = new ShoppingCartCalculator();
        var myItem = new Item("Cereal", 6.00, 3);

        double expectedSubtotal = 18.00;
        Assert.assertEquals(myCart.calculateSubtotal(myItem), expectedSubtotal, 0);
    }

    /**
     * Tests calculateSalesTax method from ShoppingCartCalculator
     */
    @Test
    public void calculateSalesTaxTest() {
        var myCart = new ShoppingCartCalculator();
        double mySubtotal = 18.00;

        double expectedTax = 1.44;
        Assert.assertEquals(myCart.calculateSalesTax(mySubtotal), expectedTax, 0);
    }

    /**
     * Tests calculateShipping method from ShoppingCartCalculator
     */
    @Test
    public void calculateShippingTest() {
        var myCart = new ShoppingCartCalculator();
        double mySubtotal = 18.00;

        double expectedShipping = 15;
        Assert.assertEquals(myCart.calculateShipping(mySubtotal), expectedShipping, 0);
    }

    /**
     * Tests calculateTotal method from ShoppingCartCalculator
     */
    @Test
    public void calculateTotalTest() {
        var myCart = new ShoppingCartCalculator();
        double mySubtotal = 18.00;
        double myTax = myCart.calculateSalesTax(mySubtotal);
        double myShipping = myCart.calculateShipping(mySubtotal);

        double expectedTotal = 34.44;
        Assert.assertEquals(myCart.calculateTotal(mySubtotal, myTax, myShipping), expectedTotal, 0);
    }
}
