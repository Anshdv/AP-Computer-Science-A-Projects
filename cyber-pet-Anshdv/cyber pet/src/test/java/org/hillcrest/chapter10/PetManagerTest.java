package test.java.org.hillcrest.chapter10;

import main.java.org.hillcrest.chapter10.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PetManagerTest {
    @Test
    public void testAddPet() {
        ArrayList<CyberPet> pets = new ArrayList<>();
        PetManager manager = new PetManager(pets);
        CyberPet pet = new AstralKitten();

        String actual = manager.addPet(pet);
        String expected = "Added Astral Kitten!";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFeedPet() {
        ArrayList<CyberPet> pets = new ArrayList<>();
        PetManager manager = new PetManager(pets);
        CyberPet pet = new AstralKitten();

        String actual = manager.feedPet(pet);
        String expected = "Kitten eats powerful radiation! Cosmic Power = high, Star Affinity = 3";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlayPet() {
        ArrayList<CyberPet> pets = new ArrayList<>();
        PetManager manager = new PetManager(pets);
        CyberPet pet = new AstralKitten();

        String actual = manager.playPet(pet, "ball");
        String expected = "Kitten purrs, absorbing cosmic rays, and blasts the ball into pieces! Cosmic Power = low, Star Affinity = 1";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testListPets() {
        ArrayList<CyberPet> pets = new ArrayList<>();
        PetManager manager = new PetManager(pets);

        CyberPet pet1 = new SlimePet("Green");
        CyberPet pet2 = new AstralKitten();
        CyberPet pet3 = new DragonPet("Draco");

        manager.addPet(pet1);
        manager.addPet(pet2);
        manager.addPet(pet3);

        String actual = manager.listPets();
        String expected = """
                Current Pet List:
                1) Slime Pet
                2) Astral Kitten
                3) Dragon Pet""";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTriggerUniqueBehavior() {
        ArrayList<CyberPet> pets = new ArrayList<>();
        PetManager manager = new PetManager(pets);

        CyberPet pet1 = new SlimePet("Green");
        CyberPet pet2 = new AstralKitten();
        CyberPet pet3 = new DragonPet("Draco");

        manager.addPet(pet1);
        manager.addPet(pet2);
        manager.addPet(pet3);

        String actual = manager.triggerUniqueBehavior();
        String expected = """
                
                Green slime divides! Two smaller slimes appear!
                Kitten focuses cosmic energy, levitating nearby objects!
                Dragon Draco breathes fire! Everything is ablaze!""";

        Assertions.assertEquals(expected, actual);
    }
}