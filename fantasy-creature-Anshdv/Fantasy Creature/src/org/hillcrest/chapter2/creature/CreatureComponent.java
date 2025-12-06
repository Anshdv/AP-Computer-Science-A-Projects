package org.hillcrest.chapter2.creature;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CreatureComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        Color sky = new Color(79, 180, 242);
        g2.setColor(sky);
        Rectangle frame = new Rectangle(0, 0, 800, 1000);
        g2.draw(frame);
        g2.fill(frame);
        g2.translate(0, 35);

        g2.setColor(Color.YELLOW);
        Ellipse2D.Double head = new Ellipse2D.Double(350, 100, 100, 100);
        g2.draw(head);
        Ellipse2D.Double body1 = new Ellipse2D.Double(350, 200, 100, 100);
        g2.draw(body1);
        g2.fill(body1);
        Ellipse2D.Double body2 = new Ellipse2D.Double(350, 300, 100, 100);
        g2.draw(body2);
        g2.fill(body2);

        // Bottom Right Wings
        g2.setColor(Color.RED);
        Polygon bottomRightWing = new Polygon();
        bottomRightWing.addPoint(450, 350);
        bottomRightWing.addPoint(550, 350);
        bottomRightWing.addPoint(500, 425);
        g2.draw(bottomRightWing);
        g2.fill(bottomRightWing);

        g2.setColor(Color.CYAN);
        Polygon innerBottomRightWing = new Polygon();
        innerBottomRightWing.addPoint(470, 360);
        innerBottomRightWing.addPoint(530, 360);
        innerBottomRightWing.addPoint(500, 405);
        g2.draw(innerBottomRightWing);
        g2.fill(innerBottomRightWing);

        // Bottom Left Wings
        g2.setColor(Color.RED);
        Polygon bottomLeftWing = new Polygon();
        bottomLeftWing.addPoint(350, 350);
        bottomLeftWing.addPoint(250, 350);
        bottomLeftWing.addPoint(300, 425);
        g2.draw(bottomLeftWing);
        g2.fill(bottomLeftWing);

        g2.setColor(Color.CYAN);
        Polygon innerBottomLeftWing = new Polygon();
        innerBottomLeftWing.addPoint(330, 360);
        innerBottomLeftWing.addPoint(270, 360);
        innerBottomLeftWing.addPoint(300, 405);
        g2.draw(innerBottomLeftWing);
        g2.fill(innerBottomLeftWing);

        // Top Left Wings
        g2.setColor(Color.RED);
        Polygon topLeftWing = new Polygon();
        topLeftWing.addPoint(350, 250);
        topLeftWing.addPoint(250, 250);
        topLeftWing.addPoint(300, 175);
        g2.draw(topLeftWing);
        g2.fill(topLeftWing);

        g2.setColor(Color.CYAN);
        Polygon innerTopLeftWing = new Polygon();
        innerTopLeftWing.addPoint(330, 240);
        innerTopLeftWing.addPoint(270, 240);
        innerTopLeftWing.addPoint(300, 195);
        g2.draw(innerTopLeftWing);
        g2.fill(innerTopLeftWing);

        // Top Right Wings
        g2.setColor(Color.RED);
        Polygon topRightWing = new Polygon();
        topRightWing.addPoint(450, 250);
        topRightWing.addPoint(550, 250);
        topRightWing.addPoint(500, 175);
        g2.draw(topRightWing);
        g2.fill(topRightWing);

        g2.setColor(Color.CYAN);
        Polygon innerTopRightWing = new Polygon();
        innerTopRightWing.addPoint(470, 240);
        innerTopRightWing.addPoint(530, 240);
        innerTopRightWing.addPoint(500, 195);
        g2.draw(innerTopRightWing);
        g2.fill(innerTopRightWing);


        // Antennae
        g2.setColor(Color.ORANGE);
        Polygon leftAntenna = new Polygon();
        leftAntenna.addPoint(368, 135);
        leftAntenna.addPoint(343, 60);
        leftAntenna.addPoint(358, 55);
        leftAntenna.addPoint(383, 130);
        g2.draw(leftAntenna);
        g2.fill(leftAntenna);

        Polygon rightAntenna = new Polygon();
        rightAntenna.addPoint(434, 136);
        rightAntenna.addPoint(459, 61);
        rightAntenna.addPoint(444, 56);
        rightAntenna.addPoint(419, 131);
        g2.draw(rightAntenna);
        g2.fill(rightAntenna);

        g2.setColor(Color.RED);
        Ellipse2D.Double leftAntennaCircle = new Ellipse2D.Double(337, 45, 26, 26);
        g2.draw(leftAntennaCircle);
        g2.fill(leftAntennaCircle);

        Ellipse2D.Double rightAntennaCircle = new Ellipse2D.Double(438, 45, 26, 26);
        g2.draw(rightAntennaCircle);
        g2.fill(rightAntennaCircle);


        // Eyes
        g2.setColor(Color.YELLOW);
        g2.fill(head);
        Color almostBlack = new Color(30, 30, 30);
        g2.setColor(almostBlack);

        Ellipse2D.Double leftEye = new Ellipse2D.Double(374, 132, 17, 17);
        g2.draw(leftEye);
        g2.fill(leftEye);

        Ellipse2D.Double rightEye = new Ellipse2D.Double(410, 132, 17, 17);
        g2.draw(rightEye);
        g2.fill(rightEye);

        // Mouth
        g2.fillArc(380, 160, 40, 20, 0, -180);
    }
}
