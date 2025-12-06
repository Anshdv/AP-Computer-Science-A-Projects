package test.java.org.hillcrest.chapter10;

import main.java.org.hillcrest.chapter10.SlimePet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SlimePetTest {
    @Test
    public void testDivide() {
        SlimePet slime = new SlimePet("Green");
        String actual = slime.divide();
        String expected = "Green slime divides! Two smaller slimes appear!";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFeed() {
        SlimePet slime = new SlimePet("Green");
        String actual = slime.feed();
        String expected = "Green slime enlarges after its meal! Size = 1.5";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlayToy() {
        SlimePet slime = new SlimePet("Green");
        String actual = slime.playToy("ball");
        String expected = "Green slime wiggles around the ball. Squishy sounds echo...";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        SlimePet slime = new SlimePet("Green");
        String actual = slime.toString();
        String expected = "Slime Pet";
        Assertions.assertEquals(expected, actual);
    }
}