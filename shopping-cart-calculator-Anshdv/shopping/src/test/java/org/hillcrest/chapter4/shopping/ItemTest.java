package test.java.org.hillcrest.chapter4.shopping;

import main.java.org.hillcrest.chapter4.shopping.Item;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests methods for Item class
 */
public class ItemTest {

    /**
     * Tests constructor for Item class with no arguments
     */
    @Test
    public void noArgumentsConstructorTest() {
        var myItem = new Item();
        String expectedName = "Random Item";
        double expectedPrice = 1.00;
        int expectedQuantity = 1;

        Assert.assertEquals(myItem.getName(), expectedName);
        Assert.assertEquals(myItem.getPrice(), expectedPrice, 0);
        Assert.assertEquals(myItem.getQuantity(), expectedQuantity);
    }

    /**
     * Tests constructor for Item class with arguments
     */
    @Test
    public void withArgumentsConstructorTest() {
        var myItem = new Item("Debt", -5, 2);
        String expectedName = "Debt";
        double expectedPrice = -5.00;
        int expectedQuantity = 2;

        Assert.assertEquals(myItem.getName(), expectedName);
        Assert.assertEquals(myItem.getPrice(), expectedPrice, 0);
        Assert.assertEquals(myItem.getQuantity(), expectedQuantity);
    }

    /**
     * Tests setters and getters from Item class
     */
    @Test
    public void settersTest() {
        var myItem = new Item();
        myItem.setName("Cereal");
        myItem.setPrice(6.00);
        myItem.setQuantity(3);

        String expectedName = "Cereal";
        double expectedPrice = 6.00;
        int expectedQuantity = 3;

        Assert.assertEquals(myItem.getName(), expectedName);
        Assert.assertEquals(myItem.getPrice(), expectedPrice, 0);
        Assert.assertEquals(myItem.getQuantity(), expectedQuantity);
    }
}
