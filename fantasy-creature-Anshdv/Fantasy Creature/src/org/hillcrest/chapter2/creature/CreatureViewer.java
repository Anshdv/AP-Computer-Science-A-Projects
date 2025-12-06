package org.hillcrest.chapter2.creature;

import javax.swing.*;

public class CreatureViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Butterfly");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        CreatureComponent component = new CreatureComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
