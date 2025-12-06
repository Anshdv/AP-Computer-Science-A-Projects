package main.java.org.hillcrest.chapter10;

/**
 * Type that specifies behaviors of all CyberPets
 */
public interface CyberPet {
    /**
     * Feeds any CyberPet
     * @return the description of the pet after being fed
     */
    String feed();

    /**
     * Gives the CyberPet a toy to play with
     * @param toy the toy to play with
     * @return the description of the pet after playing
     */
    String playToy(String toy);
}
