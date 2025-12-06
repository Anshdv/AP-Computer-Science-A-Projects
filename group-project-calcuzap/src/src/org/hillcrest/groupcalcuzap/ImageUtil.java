package org.hillcrest.groupcalcuzap;
import javax.swing.*;
import java.awt.*;

/**
 * Image related operations
 */
public class ImageUtil {
    /**
     * Scales the ImageIcon
     * @param img - ImageIcon
     * @param width - Width of the image
     * @param height - Height of the image
     * @return - the scale of the object
     */
    public static Image getScaledImage(ImageIcon img, int width, int height){
        return img.getImage().getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH);
    }
}
