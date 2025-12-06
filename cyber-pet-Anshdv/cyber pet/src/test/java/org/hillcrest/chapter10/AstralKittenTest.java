package test.java.org.hillcrest.chapter10;

import main.java.org.hillcrest.chapter10.AstralKitten;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AstralKittenTest {
    @Test
    public void testTelekinesis() {
        AstralKitten kitten = new AstralKitten();
        String actual = kitten.telekinesis();
        String expected = "Kitten focuses cosmic energy, levitating nearby objects!";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFeed() {
        AstralKitten kitten = new AstralKitten();
        String actual = kitten.feed();
        String expected = "Kitten eats powerful radiation! Cosmic Power = high, Star Affinity = 3";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlayToy() {
        AstralKitten kitten = new AstralKitten();
        String actual = kitten.playToy("ball");
        String expected = "Kitten purrs, absorbing cosmic rays, and blasts the ball into pieces! Cosmic Power = low, Star Affinity = 1";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        AstralKitten kitten = new AstralKitten();
        String actual = kitten.toString();
        String expected = "Astral Kitten";
        Assertions.assertEquals(expected, actual);
    }
}