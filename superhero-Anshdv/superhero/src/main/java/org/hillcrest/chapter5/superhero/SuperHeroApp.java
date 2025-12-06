package main.java.org.hillcrest.chapter5.superhero;

import java.util.Scanner;

public class SuperHeroApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("\nWelcome to the Superhero Power Selector!");

        // Gather user inputs (to be implemented)
        System.out.print("\nEnter your superhero name: ");
        String name = scanner.nextLine();
        System.out.print("What's your favorite color? (Blue, Green, Red, Yellow): ");
        String color = scanner.nextLine();

        System.out.print("\nChoose your primary superpower (Strength, Flight, Invisibility, Energy Blast, Speed, Invulnerability, Stealth, Telepathy): ");
        String primaryPower = scanner.nextLine();
        if (!(Superpower.getAvailablePowers().contains(primaryPower.toLowerCase()))) {
            System.out.print("That is not a valid superpower. Please pick a different one: ");
            primaryPower = scanner.nextLine();
        }
        System.out.print("Enter a description for your primary power: ");
        String primaryPowerDescription = scanner.nextLine();

        System.out.print("Choose your secondary superpower (Strength, Flight, Invisibility, Energy Blast, Speed, Invulnerability, Stealth, Telepathy): ");
        String secondaryPower = scanner.nextLine();
        if (!(Superpower.getAvailablePowers().contains(secondaryPower.toLowerCase()))) {
            System.out.print("That is not a valid superpower. Please pick a different one: ");
            secondaryPower = scanner.nextLine();
        }
        if (secondaryPower.equalsIgnoreCase(primaryPower)) {
            System.out.print("You picked that as your primary power. Please pick a different one: ");
            secondaryPower = scanner.nextLine();
        }
        System.out.print("Enter a description for your secondary power: ");
        String secondaryPowerDescription = scanner.nextLine();

        Superpower myPrimaryPower = new Superpower(primaryPower, primaryPowerDescription);
        Superpower mySecondaryPower = new Superpower(secondaryPower, secondaryPowerDescription);

        System.out.print("\nHow did you get your powers? (Alien Planet, Genetic Mutation, Accidental Experiment): ");
        String origin = scanner.nextLine();
        if (!(origin.equalsIgnoreCase("alien planet") || origin.equalsIgnoreCase("genetic mutation") || origin.equalsIgnoreCase("accidental experiment"))) {
            System.out.println("That doesn't match any of the possible origins for your powers. Enter a valid origin: ");
            origin = scanner.nextLine();
        }

        Superhero mySuperHero = new Superhero(name, myPrimaryPower, mySecondaryPower, origin);

        // Profile Output
        System.out.println("\nYour Superhero Profile:");
        System.out.println("-----------------------");
        System.out.println("Name: " + mySuperHero.getName());
        System.out.println("Favorite Color: " + color);
        System.out.println("Origin of Powers: " + mySuperHero.getOrigin());
        System.out.println();

        System.out.println("Primary Superpower: " + mySuperHero.getPrimaryPower().getPowerName());
        System.out.println("   - Weakness: " + mySuperHero.getPrimaryPower().getWeakness());
        System.out.println("Secondary Superpower: " + mySuperHero.getSecondaryPower().getPowerName());
        System.out.println("   - Weakness: " + mySuperHero.getSecondaryPower().getWeakness());

        System.out.println("\nSummary:");
        System.out.println(mySuperHero.getName() + ", gifted by " + mySuperHero.getOrigin() + ", harnesses the powers of " + myPrimaryPower.getPowerName() + " and " + mySecondaryPower.getPowerName() + ", with the iconic " + color + " hue representing them.");
        System.out.println("Beware of " + myPrimaryPower.getWeakness() + " and " + mySecondaryPower.getWeakness() + ", which could compromise their heroic feats!");

        System.out.println("\nThe rating of " + mySuperHero.getName() + " is " + mySuperHero.getRating() + "!");
    }
}
