package main.java.org.hillcrest.chapter9.game;

import java.util.Scanner;

/**
 * Main application for user to interact and play with all the cards
 */
public class CardApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DeckManager myDeckManager = new DeckManager();

        while (true) {
            System.out.println("""
                    \n----- TRADING CARD DECK MENU -----
                    1) Add Card
                    2) Remove Card
                    3) Play Card
                    4) Inspect Card
                    5) List Cards
                    6) Exit
                    -----------------------------------
                    """);
            System.out.print("Enter your choice: ");
            if (in.hasNextInt()) {
                int firstChoice = in.nextInt();
                in.nextLine();
                if (1 <= firstChoice && firstChoice <= 6) {
                    if (firstChoice == 1) {
                        System.out.println("""
                        \nChoose a card type:
                          1) Creature
                          2) Spell
                          3) Trap
                          4) Artifact
                        """);
                        System.out.print("Enter your choice: ");
                        if (in.hasNextInt()) {
                            int secondChoice = in.nextInt();
                            if (1 <= secondChoice && secondChoice <= 4) {
                                System.out.print("\nEnter card name: ");
                                String name = in.next();
                                System.out.print("Enter card cost: ");
                                int cost = in.nextInt();
                                System.out.print("Enter rarity: ");
                                String rarity = in.next();

                                if (secondChoice == 1) {
                                    System.out.print("Enter attack: ");
                                    int attack = in.nextInt();
                                    System.out.print("Enter defense: ");
                                    int defense = in.nextInt();

                                    Card creature = new CreatureCard(name, cost, rarity, attack, defense);

                                    System.out.println();
                                    System.out.println(myDeckManager.addCard(creature));
                                    continue;
                                } else if (secondChoice == 2) {
                                    in.nextLine();
                                    System.out.print("Enter spell description: ");
                                    String description = in.nextLine();

                                    Card spell = new SpellCard(name, cost, rarity, description);

                                    System.out.println();
                                    System.out.println(myDeckManager.addCard(spell));
                                    continue;
                                } else if (secondChoice == 3) {
                                    in.nextLine();
                                    System.out.print("Enter spell description: ");
                                    String description = in.nextLine();
                                    System.out.print("Enter trigger description: ");
                                    String trigger = in.nextLine();

                                    Card trap = new TrapCard(name, cost, rarity, description, trigger);

                                    System.out.println();
                                    System.out.println(myDeckManager.addCard(trap));
                                    continue;
                                } else {
                                    in.nextLine();
                                    System.out.print("Enter artifact type: ");
                                    String artifactType = in.next();
                                    System.out.print("Enter durability: ");
                                    int durability = in.nextInt();

                                    Card artifact = new ArtifactCard(name, cost, rarity, artifactType, durability);

                                    System.out.println();
                                    System.out.println(myDeckManager.addCard(artifact));
                                    continue;
                                }
                            }
                        }
                        System.out.println("You did not enter one of the choices. Try again.");
                        continue;

                    } else if (firstChoice == 2) {
                        System.out.print("\nEnter the name of the card you wish to remove: ");
                        String removeCardName = in.nextLine();
                        System.out.println(myDeckManager.removeCard(removeCardName));
                        continue;

                    } else if (firstChoice == 3) {
                        System.out.print("\nEnter the name of the card you wish to play: ");
                        String playCardName = in.nextLine();
                        System.out.println(myDeckManager.playCard(playCardName));
                        continue;

                    } else if (firstChoice == 4) {
                        System.out.print("\nEnter the name of the card you wish to inspect: ");
                        String inspectCardName = in.nextLine();
                        System.out.println(myDeckManager.inspectCard(inspectCardName));
                        continue;

                    } else if (firstChoice == 5) {
                        System.out.println("\nDeck Contents:");
                        System.out.println(myDeckManager.listCards());
                        continue;

                    } else {
                        System.out.println("GG!");
                        break;
                    }
                }
            }
            System.out.println("You did not enter one of the choices. Try again.");
            in.nextLine();
        }
    }
}
