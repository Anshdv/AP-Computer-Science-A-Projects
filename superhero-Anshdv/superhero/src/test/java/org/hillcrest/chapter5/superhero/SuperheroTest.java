package test.java.org.hillcrest.chapter5.superhero;

import main.java.org.hillcrest.chapter5.superhero.Superhero;
import main.java.org.hillcrest.chapter5.superhero.Superpower;
import org.junit.Assert;
import org.junit.Test;

public class SuperheroTest {
    @Test
    public void getNameTest() {
        var myPrimaryPower = new Superpower("strength", "");
        var mySecondaryPower = new Superpower("flight", "");
        var mySuperhero = new Superhero("Bob", myPrimaryPower, mySecondaryPower, "alien planet");
        String actual = mySuperhero.getName();
        String expected = "Bob";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPrimaryPowerTest() {
        var myPrimaryPower = new Superpower("strength", "");
        var mySecondaryPower = new Superpower("flight", "");
        var mySuperhero = new Superhero("Bob", myPrimaryPower, mySecondaryPower, "alien planet");
        Superpower actual = mySuperhero.getPrimaryPower();
        Superpower expected = myPrimaryPower;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSecondaryPowerTest() {
        var myPrimaryPower = new Superpower("strength", "");
        var mySecondaryPower = new Superpower("flight", "");
        var mySuperhero = new Superhero("Bob", myPrimaryPower, mySecondaryPower, "alien planet");
        Superpower actual = mySuperhero.getSecondaryPower();
        Superpower expected = mySecondaryPower;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ratingTest() {
        var myPrimaryPower = new Superpower("strength", "");
        var mySecondaryPower = new Superpower("flight", "");
        var mySuperhero = new Superhero("Bob", myPrimaryPower, mySecondaryPower, "alien planet");
        mySuperhero.setRating(100);
        double actual = mySuperhero.getRating();
        double expected = 100;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getOriginTest() {
        var myPrimaryPower = new Superpower("strength", "");
        var mySecondaryPower = new Superpower("flight", "");
        var mySuperhero = new Superhero("Bob", myPrimaryPower, mySecondaryPower, "alien planet");
        String actual = mySuperhero.getOrigin();
        String expected = "alien planet";
        Assert.assertEquals(expected, actual);
    }
}
