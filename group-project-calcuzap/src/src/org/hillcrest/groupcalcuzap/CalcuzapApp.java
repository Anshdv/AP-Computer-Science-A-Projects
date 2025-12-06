package org.hillcrest.groupcalcuzap;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Main class for the Calcuzap game
 */
public class CalcuzapApp {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        JFrame frame = new JFrame("Calcuzap");
        frame.setSize(900, 650);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);

        int playerWidth = 33;
        int playerHeight = 21;
        int playerBulletWidth = 7;
        int playerBulletHeight = 14;
        int enemyWidth = 54;
        int enemyHeight = 45;
        int enemyBulletSize = 8;

        int xCoord = 425;
        int yCoord = 470;

        Player myPlayer = new Player(playerWidth, playerHeight);

        JLabel playerLabel = new JLabel();
        playerLabel.setIcon(myPlayer.getPlayerImage());
        playerLabel.setBounds(xCoord, yCoord, playerWidth, playerHeight);

        ArrayList<JLabel> playerBullets = new ArrayList<>();
        ArrayList<JLabel> enemies = new ArrayList<>();
        ArrayList<JLabel> enemyBullets = new ArrayList<>();

        Random randomGenerator = new Random();

        for (int x = 110; x < 800; x += 100) {
            for (int y = 70; y < 325; y+= 85) {
                Enemy enemy = new Enemy(enemyWidth, enemyHeight);

                JLabel enemyLabel = new JLabel();
                enemyLabel.setIcon(enemy.getEnemyImage());
                enemyLabel.setBounds(x, y, enemyWidth, enemyHeight);

                enemies.add(enemyLabel);
            }
        }
        /**
         * Process of the game and user interface
         * - Movement of player and enemy
         * - Detects collision
         * - Bullet shoot
         * - Spawns enemy bullets each second
         */
        class MyActionListener implements ActionListener {
            public static boolean w, a, s, d;
            private final int X_CHANGE = 4;
            private final int Y_CHANGE = 4;
            private final int BULLET_CHANGE = -2;

            private long enemyAttackCount = 0;
            private int enemyXChange = 0;
            private int enemyYChange = 0;
            private int enemyMovementPhase = 1;

            /**
             * Controls all the movement, bullets, enemy bullet, ship and enemy
             *
             * @param e - Specifies the type of event that happened
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int newX = playerLabel.getX();
                int newY = playerLabel.getY();

                // player movement
                if (w) { newY -= Y_CHANGE; }
                if (a) { newX -= X_CHANGE; }
                if (s) { newY += Y_CHANGE; }
                if (d) { newX += X_CHANGE; }

                if (newX < 1) { newX += X_CHANGE; }
                if (newX > 867) { newX -= X_CHANGE; }
                if (newY < 335) { newY += Y_CHANGE; }
                if (newY > 600) { newY -= Y_CHANGE; }

                playerLabel.setBounds(newX, newY, playerWidth, playerHeight);

                // player bullets and enemy interaction
                for (int i = 0; i < playerBullets.size(); i++) {
                    JLabel label = playerBullets.get(i);
                    Rectangle bulletBounds = label.getBounds();

                    for (int j = 0; j < enemies.size(); j++) {
                        JLabel enemy = enemies.get(j);
                        Rectangle enemyBounds = enemy.getBounds();

                        if (bulletBounds.intersects(enemyBounds)) {
                            enemies.remove(j);
                            frame.remove(enemy);
                            playerBullets.remove(label);
                            frame.remove(label);

                            frame.revalidate();
                            frame.repaint();
                            i--;
                            break;
                        }
                    }

                    if (label.getY() < -20) {
                        playerBullets.remove(label);
                        frame.remove(label);
                        i--;
                    } else {
                        label.setBounds(label.getX(), label.getY() + BULLET_CHANGE, playerBulletWidth, playerBulletHeight);
                    }
                }

                // enemy bullets and player interaction
                for (int i = 0; i < enemyBullets.size(); i++) {
                    JLabel label = enemyBullets.get(i);
                    Rectangle bulletBounds = label.getBounds();

                    Rectangle playerBounds = playerLabel.getBounds();

                    if (bulletBounds.intersects(playerBounds)) {
                        enemyBullets.remove(i);
                        frame.remove(label);
                        i--;
                        System.exit(0);
                    }

                    if (label.getY() > 800) {
                        enemyBullets.remove(label);
                        frame.remove(label);
                        i--;
                    } else {
                        label.setBounds(label.getX(), label.getY() - BULLET_CHANGE, enemyBulletSize, enemyBulletSize);
                    }
                }

                // enemy movement
                if (enemyMovementPhase == 1) {
                    if (enemyXChange < 50) {
                        for (int i = 0; i < enemies.size(); i++) {
                            JLabel enemyLabel = enemies.get(i);
                            enemyLabel.setBounds(enemyLabel.getX() + (X_CHANGE - 3), enemyLabel.getY(), enemyWidth, enemyHeight);
                        }
                        enemyXChange += X_CHANGE;
                    } else {
                        enemyMovementPhase = 2;
                    }
                }
                if (enemyMovementPhase == 2) {
                    if (enemyYChange < 70) {
                        for (int i = 0; i < enemies.size(); i++) {
                            JLabel enemyLabel = enemies.get(i);
                            enemyLabel.setBounds(enemyLabel.getX(), enemyLabel.getY() - (Y_CHANGE - 3), enemyWidth, enemyHeight);
                        }
                        enemyYChange += Y_CHANGE;
                    } else {
                        enemyMovementPhase = 3;
                    }
                }
                if (enemyMovementPhase == 3) {
                    if (enemyXChange > -50) {
                        for (int i = 0; i < enemies.size(); i++) {
                            JLabel enemyLabel = enemies.get(i);
                            enemyLabel.setBounds(enemyLabel.getX() - (X_CHANGE - 3), enemyLabel.getY(), enemyWidth, enemyHeight);
                        }
                        enemyXChange -= X_CHANGE;
                    } else {
                        enemyMovementPhase = 4;
                    }
                }
                if (enemyMovementPhase == 4) {
                    if (enemyYChange > 0) {
                        for (int i = 0; i < enemies.size(); i++) {
                            JLabel enemyLabel = enemies.get(i);
                            enemyLabel.setBounds(enemyLabel.getX(), enemyLabel.getY() + (Y_CHANGE - 3), enemyWidth, enemyHeight);
                        }
                        enemyYChange -= Y_CHANGE;
                    } else {
                        enemyMovementPhase = 1;
                    }
                }

                // spawn enemy bullets
                if (System.currentTimeMillis() - startTime > enemyAttackCount * 1000) {
                    for (int i = 0; i < 10; i++) {
                        if (enemies.isEmpty()) {
                            System.exit(1);
                        }

                        int rand = randomGenerator.nextInt(enemies.size());
                        JLabel enemyLabel = enemies.get(rand);
                        EnemyBullet enemyBullet = new EnemyBullet(enemyBulletSize, enemyBulletSize);

                        JLabel bulletLabel = new JLabel();
                        bulletLabel.setIcon(enemyBullet.getBulletImage());
                        bulletLabel.setBounds(enemyLabel.getX() + 25, enemyLabel.getY() + 45, enemyBulletSize, enemyBulletSize);

                        enemyBullets.add(bulletLabel);
                        frame.add(bulletLabel);
                    }

                    enemyAttackCount++;
                }
            }
        }

        /**
        * Class that listens to the keyboard input, processes it and does the action
        */
        class MyKeyListener implements KeyListener {
            /**
             * Not used
             * @param e the event to be processed
             */
            @Override
            public void keyTyped(KeyEvent e) { }

            /**
             * Activates movement for player or activates shoot button for the player
             * @param e the event to be processed
             */
            @Override
            public void keyPressed(KeyEvent e) {
                String key = KeyStroke.getKeyStrokeForEvent(e).toString();
                key = key.replace("pressed ", "").toLowerCase();

                // player movement control
                if (key.equals("w") || key.equals("up")) {
                    MyActionListener.w = true;
                }
                if (key.equals("a") || key.equals("left")) {
                    MyActionListener.a = true;
                }
                if (key.equals("s") || key.equals("down")) {
                    MyActionListener.s = true;
                }
                if (key.equals("d") || key.equals("right")) {
                    MyActionListener.d = true;
                }

                // spawn player bullets
                if (key.equals("space")) {
                    PlayerBullet bullet = new PlayerBullet(playerBulletWidth, playerBulletHeight);

                    JLabel bulletLabel = new JLabel();
                    bulletLabel.setIcon(bullet.getBulletImage());
                    bulletLabel.setBounds(playerLabel.getX() + 13, playerLabel.getY() + 2, playerBulletWidth, playerBulletHeight);

                    bulletLabel.addKeyListener(this);
                    bulletLabel.setFocusable(true);
                    bulletLabel.requestFocus();

                    frame.add(bulletLabel);
                    playerBullets.add(bulletLabel);
                }
            }

            /**
             * Deactivates player movement or shoot button
             * @param e the event to be processed
             */
            @Override
            public void keyReleased(KeyEvent e) {
                String key = KeyStroke.getKeyStrokeForEvent(e).toString();
                key = key.replace("released ", "").toLowerCase();

                // player movement control
                if (key.equals("w") || key.equals("up")) {
                    MyActionListener.w = false;
                }
                if (key.equals("a") || key.equals("left")) {
                    MyActionListener.a = false;
                }
                if (key.equals("s") || key.equals("down")) {
                    MyActionListener.s = false;
                }
                if (key.equals("d") || key.equals("right")) {
                    MyActionListener.d = false;
                }
            }
        }

        ActionListener actionListener = new MyActionListener();
        Timer timer = new Timer(10, actionListener);
        timer.start();

        MyKeyListener keyListener = new MyKeyListener();
        playerLabel.addKeyListener(keyListener);
        playerLabel.setFocusable(true);
        playerLabel.requestFocus();

        frame.add(playerLabel);
        for (JLabel label: enemies) {
            frame.add(label);
        }

        frame.setVisible(true);
    }
}
