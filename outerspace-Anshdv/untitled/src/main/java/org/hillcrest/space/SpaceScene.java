package main.java.org.hillcrest.space;

import javax.swing.*;
import java.awt.*;

/**
 * Creates and draws the planets and stars on the frame
 */
public class SpaceScene extends JComponent {

    private Planet planet1;
    private Planet planet2;
    private Planet planet3;
    private Planet planet4;
    private Planet planet5;

    private Star star1;
    private Star star2;
    private Star star3;
    private Star star4;
    private Star star5;
    private Star star6;
    private Star star7;
    private Star star8;

    /**
     * Creates planet and star objects
     */
    public SpaceScene() {
        planet1 = new Planet(300, 250, 20, Color.ORANGE);
        planet2 = new Planet(125, 300, 40, Color.CYAN);
        planet3 = new Planet(400, 125, 30, Color.RED);
        planet4 = new Planet(450, 400, 35, Color.BLUE);
        planet5 = new Planet(125, 100, 50, Color.YELLOW);

        star1 = new Star(300, 50, 5);
        star2 = new Star(75, 100, 3);
        star3 = new Star(275, 175, 4);
        star4 = new Star(75, 350, 6);
        star5 = new Star(300, 400, 7);
        star6 = new Star(500, 200, 5);
        star7 = new Star(125, 225, 4);
        star8 = new Star(400, 300, 6);

    }

    /**
     * Calls draw method from planet and star objects to draw them on frame
     * @param g component that connects to frame to draw the objects
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        int width = getWidth();
        int height = getHeight();

        Rectangle window = new Rectangle(0, 0, width, height);
        g2.draw(window);
        g2.fill(window);

        planet1.draw(g2);
        planet2.draw(g2);
        planet3.draw(g2);
        planet4.draw(g2);
        planet5.draw(g2);

        star1.draw(g2);
        star2.draw(g2);
        star3.draw(g2);
        star4.draw(g2);
        star5.draw(g2);
        star6.draw(g2);
        star7.draw(g2);
        star8.draw(g2);
    }
}
