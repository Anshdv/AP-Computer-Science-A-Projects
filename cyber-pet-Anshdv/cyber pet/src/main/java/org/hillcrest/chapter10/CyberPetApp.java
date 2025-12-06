package main.java.org.hillcrest.chapter10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * UI app the user can interact with pets in
 */
public class CyberPetApp {
    /**
     * main method
     * @param args arguments passed into the program
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<CyberPet> myPets = new ArrayList<>();
        PetManager myPetManager = new PetManager(myPets);

        while (true) {
            printMenu();
            System.out.print("\nEnter your choice: ");

            if (in.hasNextInt()) {
                int firstChoice = in.nextInt();
                in.nextLine();

                if (1 <= firstChoice && firstChoice <= 6) {
                    if (firstChoice == 1) {
                        printAddPetMenu();
                        System.out.print("\nSelect pet type: ");

                        if (in.hasNextInt()) {
                            int secondChoice = in.nextInt();
                            in.nextLine();

                            if (1 <= secondChoice && secondChoice <= 3) {
                                if (secondChoice == 1) {
                                    System.out.println(addDragon(in, myPetManager));
                                    continue;
                                } else if (secondChoice == 2) {
                                    System.out.println(addSlime(in, myPetManager));
                                    continue;
                                } else {
                                    System.out.println(addAstralKitten(myPetManager));
                                    continue;
                                }
                            }
                        }
                    } else if (firstChoice == 2) {
                        System.out.print("Enter pet number to feed (list pets to see their numbers): ");

                        if (in.hasNextInt()) {
                            int secondChoice = in.nextInt();
                            in.nextLine();

                            if (1 <= secondChoice && secondChoice <= myPets.size()) {
                                System.out.println("\n" + myPetManager.feedPet(myPets.get(secondChoice - 1)));
                                continue;
                            }
                        }
                    } else if (firstChoice == 3) {
                        System.out.print("Enter pet number to play with (list pets to see their numbers): ");

                        if (in.hasNextInt()) {
                            int secondChoice = in.nextInt();
                            in.nextLine();

                            if (1 <= secondChoice && secondChoice <= myPets.size()) {
                                System.out.print("Enter toy name: ");
                                String theToy = in.nextLine();
                                System.out.println("\n" + myPetManager.playPet(myPets.get(secondChoice - 1), theToy));
                                continue;
                            }
                        }
                    } else if (firstChoice == 4) {
                        System.out.println("\n" + myPetManager.listPets());
                        continue;
                    } else if (firstChoice == 5) {
                        System.out.println(myPetManager.triggerUniqueBehavior());
                        continue;
                    } else {
                        System.out.println("\nExiting Cyber Pet System. Goodbye!");
                        break;
                    }
                }
            }
            System.out.println("You did not enter one of the choices. Try again.");
        }
    }

    /**
     * Displays the options/ways in which the user can interact with the pets
     */
    private static void printMenu() {
        System.out.println("""
                \n----- CYBER PET MENU -----
                1) Add a Pet
                2) Feed a Pet
                3) Play with a Pet
                4) List Pets
                5) Trigger Unique Behaviors
                6) Exit
                --------------------------""");
    }

    /**
     * Displays the types of pets the user can create
     */
    private static void printAddPetMenu() {
        System.out.println("""
                \nPet Types:
                1) Dragon Pet
                2) Slime Pet
                3) Astral Kitten""");
    }

    /**
     * Adds a DragonPet to the list of pets
     * @param scanner the input reader
     * @param petManager the object managing all the pets
     * @return confirmation message of DragonPet being added
     */
    private static String addDragon(Scanner scanner, PetManager petManager) {
        System.out.print("Enter pet name for your Dragon Pet: ");
        String petName = scanner.nextLine();

        DragonPet myDragonPet = new DragonPet(petName);
        return petManager.addPet(myDragonPet);
    }

    /**
     * Adds a SlimePet to the list of pets
     * @param scanner the input reader
     * @param petManager the object managing all the pets
     * @return confirmation message of SlimePet being added
     */
    private static String addSlime(Scanner scanner, PetManager petManager) {
        System.out.print("Enter a color for your Slime Pet: ");
        String petColor = scanner.nextLine();

        SlimePet mySlimePet = new SlimePet(petColor);
        return petManager.addPet(mySlimePet);
    }

    /**
     * Adds an AstralKitten to the list of pets
     * @param petManager the object managing all the pets
     * @return confirmation message of AstralKitten being added
     */
    private static String addAstralKitten(PetManager petManager) {
        AstralKitten myAstralKitten = new AstralKitten();
        return petManager.addPet(myAstralKitten);
    }
}
