package main.java.org.hillcrest.space;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Template for a planet with any position, diameter, and color
 */
public class Planet {

    private double x;
    private double y;
    private int diameter;
    private Color color;

    /**
     * Creates a planet with the specified position, diameter, and color
     * @param x the x-coordinate of the planet
     * @param y the y-coordinate of the planet
     * @param diameter the diameter (width/height) of the planet
     * @param color the color of the planet
     */
    public Planet(double x, double y, int diameter, Color color) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.color = color;
    }

    /**
     * Draws the planet on a frame
     * @param g2 the "paintbrush" that draws the planet on the frame
     */
    public void draw(Graphics2D g2) {
        Ellipse2D.Double planet = new Ellipse2D.Double(x, y, diameter, diameter);

        g2.setColor(color);
        g2.draw(planet);
        g2.fill(planet);
    }
}
