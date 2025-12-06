package test.java.org.hillcrest.chapter10;

import main.java.org.hillcrest.chapter10.DragonPet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DragonPetTest {
    @Test
    public void testBreatheFire() {
        DragonPet dragon = new DragonPet("Draco");
        String actual = dragon.breatheFire();
        String expected = "Dragon Draco breathes fire! Everything is ablaze!";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFeed() {
        DragonPet dragon = new DragonPet("Draco");
        String actual = dragon.feed();
        String expected = "Dragon Draco devours a pile of gold coins! Hunger = 4, Mood = 6";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlayToy() {
        DragonPet dragon = new DragonPet("Draco");
        String actual = dragon.playToy("ball");
        String expected = "Dragon Draco roars happily, scorching the ball! Mood = 7";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        DragonPet dragon = new DragonPet("Draco");
        String actual = dragon.toString();
        String expected = "Dragon Pet";
        Assertions.assertEquals(expected, actual);
    }
}