package main.java.org.hillcrest.chapter10;

import java.util.ArrayList;

/**
 * Provides methods to control actions of CyberPets
 */
public class PetManager {
    private ArrayList<CyberPet> pets;

    /**
     * Creates a PetManager object
     * @param pets the list of CyberPets
     */
    public PetManager(ArrayList<CyberPet> pets) {
        this.pets = pets;
    }

    /**
     * Adds a CyberPet to the list of pets
     * @param pet the pet to add
     * @return confirmation message of the pet being added
     */
    public String addPet(CyberPet pet) {
        pets.add(pet);
        return "Added " + pet.toString() + "!";
    }

    /**
     * Feeds a CyberPet
     * @param pet the pet to feed
     * @return the description of the pet after being fed
     */
    public String feedPet(CyberPet pet) {
        return pet.feed();
    }

    /**
     * Allows a CyberPet to play with a toy
     * @param pet the pet to play
     * @param toy the toy to play with
     * @return the description of the pet after playing
     */
    public String playPet(CyberPet pet, String toy) {
        return pet.playToy(toy);
    }

    /**
     * Lists all the pets in the list of pets
     * @return string representation of each pet in the list
     */
    public String listPets() {
        StringBuilder builder = new StringBuilder();
        builder.append("Current Pet List:");

        int counter = 1;
        for (CyberPet pet: pets) {
            builder.append("\n").append(counter).append(") ").append(pet.toString());
            counter++;
        }

        return builder.toString();
    }

    /**
     * Calls the unique behavior of each pet depending on its type
     * @return description of the behavior of the pet
     */
    public String triggerUniqueBehavior() {
        StringBuilder builder = new StringBuilder();

        for (CyberPet pet: pets) {
            if (pet instanceof SlimePet) {
                builder.append("\n").append(((SlimePet) pet).divide());
            } else if (pet instanceof AstralKitten) {
                builder.append("\n").append(((AstralKitten) pet).telekinesis());
            } else if (pet instanceof DragonPet) {
                builder.append("\n").append(((DragonPet) pet).breatheFire());
            }
        }

        return builder.toString();
    }
}
