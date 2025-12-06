package org.hillcrest.groupcalcuzap;

/**
 * Shows the bullet fired
 */
public class PlayerBullet extends Bullet{
    /**
     * Constructs a playerBullet object
     * @param scaleWidth - Width of the ship bullet
     * @param scaleHeight - Height of the ship bullet
     */
    public PlayerBullet(int scaleWidth, int scaleHeight) {
        super("src/images/bullet.png", scaleWidth, scaleHeight);
    }
}
