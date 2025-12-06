package org.hillcrest.groupcalcuzap;
import javax.swing.*;
import java.awt.*;

/**
 * Template for the enemy
 */
public class Enemy {
    private ImageIcon enemyImage;

    /**
     * Constructs an Enemy object
     * @param scaleWidth - Gives the witch of the enemy
     * @param scaleHeight - Gives the height of the enemy
     */
    public Enemy(int scaleWidth, int scaleHeight) {
        enemyImage = new ImageIcon("src/images/enemy.png");
        Image tempImg = ImageUtil.getScaledImage(enemyImage, scaleWidth, scaleHeight);
        enemyImage = new ImageIcon(tempImg);
    }

    /**
     * Returns the enemy image
     * @return - the enemy IconImage
     */
    public ImageIcon getEnemyImage() {
        return enemyImage;
    }
}
