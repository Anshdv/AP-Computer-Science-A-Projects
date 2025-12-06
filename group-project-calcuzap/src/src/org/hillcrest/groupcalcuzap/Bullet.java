package org.hillcrest.groupcalcuzap;
import javax.swing.*;
import java.awt.*;

public class Bullet {
    private ImageIcon bulletImage;

    /**
     * Constructs a Bullet object
     * @param fName - the file name
     * @param scaleWidth - image width
     * @param scaleHeight - image height
     */
    public Bullet(String fName, int scaleWidth, int scaleHeight) {
        bulletImage = new ImageIcon(fName);
        Image tempImg = ImageUtil.getScaledImage(bulletImage, scaleWidth, scaleHeight);
        bulletImage = new ImageIcon(tempImg);
    }

    /**
     * Returns scaled bullet image.
     * @return - ImageIcon bullet
     */
    public ImageIcon getBulletImage() {
        return bulletImage;
    }
}
