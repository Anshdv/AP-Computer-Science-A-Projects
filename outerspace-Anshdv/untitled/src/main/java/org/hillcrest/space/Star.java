package main.java.org.hillcrest.space;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Template for a star with any position and diameter
 */
public class Star {

    private double x;
    private double y;
    private int diameter;

    /**
     * Creates a star with the specified position and diameter
     * @param x the x-coordinate of the star
     * @param y the y-coordinate of the star
     * @param diameter the diameter (width/height) of the star
     */
    public Star(double x, double y, int diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    /**
     * Draws the star on a frame
     * @param g2 the "paintbrush" that draws the star on the frame
     */
    public void draw(Graphics2D g2) {
        Ellipse2D.Double star = new Ellipse2D.Double(x, y, diameter, diameter);

        g2.setColor(Color.WHITE);
        g2.draw(star);
        g2.fill(star);
    }
}
