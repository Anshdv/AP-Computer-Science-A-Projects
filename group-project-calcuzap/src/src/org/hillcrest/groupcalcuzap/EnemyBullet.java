package org.hillcrest.groupcalcuzap;

/**
 * Shows the bullet fired by the enemy
 */
public class EnemyBullet extends Bullet {
    /**
     * Construct the enemy bullet object
     * @param scaleWidth - Width of the enemy bullet
     * @param scaleHeight - Height of the enemy bullet
     */
    public EnemyBullet(int scaleWidth, int scaleHeight) {
        super("src/images/enemy_bullet.png", scaleWidth, scaleHeight);
    }
}
