package test.java.org.hillcrest.chapter5.superhero;

import main.java.org.hillcrest.chapter5.superhero.Superpower;
import org.junit.Assert;
import org.junit.Test;

public class SuperpowerTest {
    // calculate weakness tests
    @Test
    public void strengthWeaknessTest() {
        var myPower = new Superpower("strength", "");
        String actual = myPower.calculateWeakness(myPower.getPowerName());
        String expected = "kryptonite";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flightWeaknessTest() {
        var myPower = new Superpower("flight", "");
        String actual = myPower.calculateWeakness(myPower.getPowerName());
        String expected = "strong winds";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invisibilityWeaknessTest() {
        var myPower = new Superpower("invisibility", "");
        String actual = myPower.calculateWeakness(myPower.getPowerName());
        String expected = "loud noises";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void energyBlastWeaknessTest() {
        var myPower = new Superpower("energy blast", "");
        String actual = myPower.calculateWeakness(myPower.getPowerName());
        String expected = "overheating";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speedWeaknessTest() {
        var myPower = new Superpower("speed", "");
        String actual = myPower.calculateWeakness(myPower.getPowerName());
        String expected = "slippery surfaces";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invulnerabilityWeaknessTest() {
        var myPower = new Superpower("invulnerability", "");
        String actual = myPower.calculateWeakness(myPower.getPowerName());
        String expected = "emotional vulnerability";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stealthWeaknessTest() {
        var myPower = new Superpower("stealth", "");
        String actual = myPower.calculateWeakness(myPower.getPowerName());
        String expected = "bright light";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void telepathyWeaknessTest() {
        var myPower = new Superpower("telepathy", "");
        String actual = myPower.calculateWeakness(myPower.getPowerName());
        String expected = "mind clutter";
        Assert.assertEquals(expected, actual);
    }

    // other tests
    @Test
    public void getWeaknessTest() {
        var myPower = new Superpower("strength", "");
        myPower.calculateWeakness(myPower.getPowerName());
        String actual = myPower.getWeakness();
        String expected = "kryptonite";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDescriptionTest() {
        var myPower = new Superpower("strength", "strong");
        String actual = myPower.getDescription();
        String expected = "strong";
        Assert.assertEquals(expected, actual);
    }
}
