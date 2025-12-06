package org.hillcrest.groupcalcuzap;
import javax.swing.*;
import java.awt.*;

/**
 * Shows the player's ship
 */
public class Player {
    private ImageIcon playerImage;

    /**
     * Constructs the Player object
     * @param scaleWidth - Width of the ship
     * @param scaleHeight - Height of the ship
     */
    public Player(int scaleWidth, int scaleHeight) {
        playerImage = new ImageIcon("src/images/spaceship.png");
        Image tempImg = ImageUtil.getScaledImage(playerImage, scaleWidth, scaleHeight);
        playerImage = new ImageIcon(tempImg);
    }

    /**
     * Returns the player image
     * @return - the ImageIcon player
     */
    public ImageIcon getPlayerImage() {
        return playerImage;
    }
}
