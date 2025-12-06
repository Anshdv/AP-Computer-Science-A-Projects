package test.java.org.hillcrest.chapter5.superhero;

import main.java.org.hillcrest.chapter5.superhero.RatingCalculator;
import main.java.org.hillcrest.chapter5.superhero.Superpower;
import org.junit.Assert;
import org.junit.Test;

public class RatingCalculatorTest {
    // base score tests
    @Test
    public void strengthBaseScoreTest() {
        var myPower = new Superpower("strength", "");
        double actual = RatingCalculator.getBaseScore(myPower);
        double expected = 45;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void flightBaseScoreTest() {
        var myPower = new Superpower("flight", "");
        double actual = RatingCalculator.getBaseScore(myPower);
        double expected = 40;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void invisibilityBaseScoreTest() {
        var myPower = new Superpower("invisibility", "");
        double actual = RatingCalculator.getBaseScore(myPower);
        double expected = 35;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void energyBlastBaseScoreTest() {
        var myPower = new Superpower("energy blast", "");
        double actual = RatingCalculator.getBaseScore(myPower);
        double expected = 50;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void speedBaseScoreTest() {
        var myPower = new Superpower("speed", "");
        double actual = RatingCalculator.getBaseScore(myPower);
        double expected = 48;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void invulnerabilityBaseScoreTest() {
        var myPower = new Superpower("invulnerability", "");
        double actual = RatingCalculator.getBaseScore(myPower);
        double expected = 50;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void stealthBaseScoreTest() {
        var myPower = new Superpower("stealth", "");
        double actual = RatingCalculator.getBaseScore(myPower);
        double expected = 30;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void telepathyBaseScoreTest() {
        var myPower = new Superpower("telepathy", "");
        double actual = RatingCalculator.getBaseScore(myPower);
        double expected = 25;
        Assert.assertEquals(expected, actual, 0);
    }

    // compatibility bonus tests
    @Test
    public void strengthInvulnerabilityCompatibilityTest() {
        var myPower1 = new Superpower("strength", "");
        var myPower2 = new Superpower("invulnerability", "");
        double actual = RatingCalculator.getCompatibilityBonus(myPower1, myPower2);
        double expected = 20;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void flightSpeedCompatibilityTest() {
        var myPower1 = new Superpower("flight", "");
        var myPower2 = new Superpower("speed", "");
        double actual = RatingCalculator.getCompatibilityBonus(myPower1, myPower2);
        double expected = 15;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void invisibilityStealthCompatibilityTest() {
        var myPower1 = new Superpower("invisibility", "");
        var myPower2 = new Superpower("stealth", "");
        double actual = RatingCalculator.getCompatibilityBonus(myPower1, myPower2);
        double expected = 10;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void energyBlastTelepathyCompatibilityTest() {
        var myPower1 = new Superpower("energy blast", "");
        var myPower2 = new Superpower("telepathy", "");
        double actual = RatingCalculator.getCompatibilityBonus(myPower1, myPower2);
        double expected = 10;
        Assert.assertEquals(expected, actual, 0);
    }

    // origin modifier tests
    @Test
    public void alienPlanetTest() {
        double actual = RatingCalculator.getOriginModifier(100, "alien planet");
        double expected = 110;
        Assert.assertEquals(expected, actual, 2E-14);
    }

    @Test
    public void geneticMutationTest() {
        double actual = RatingCalculator.getOriginModifier(100, "genetic mutation");
        double expected = 105;
        Assert.assertEquals(expected, actual, 2E-14);
    }

    @Test
    public void accidentalExperimentTest() {
        double actual = RatingCalculator.getOriginModifier(100, "accidental experiment");
        double expected = 100;
        Assert.assertEquals(expected, actual, 2E-14);
    }
}
