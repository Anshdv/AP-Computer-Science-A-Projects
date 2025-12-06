package main.java.org.hillcrest.space;
import javax.swing.*;

public class SpaceApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Outer Space");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        SpaceScene component = new SpaceScene();
        frame.add(component);
        frame.setVisible(true);
    }
}
