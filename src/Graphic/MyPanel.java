package Graphic;

import Bouncable.Entity;
import Util.Vector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.LinkedList;

public class MyPanel {
    /*
    Timer timer;
    LinkedList<Entity> entities;
    int WIDTH;
    int HEIGHT;

    MyPanel(int width, int height) {
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(width, height));
        this.setVisible(true);
        entities = new LinkedList<>();

        timer = new Timer(40, this);
        WIDTH = width;
        HEIGHT = height;
        timer.setRepeats(true);
        timer.start();

        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                for (Entity en : entities) {
                    Vector position = en.getPosition();
                    int x = position.getX();
                    int y = position.getY();
                    int width = en.getWidth();
                    int height = en.getHeight();

                    if (x - width / 2 <= 0)
                        position.setX(width / 2);
                    if (x + width / 2 >= getWidth())
                        position.setX(getWidth() - width / 2);
                    if (y - height / 2 <= 0)
                        position.setY(height / 2);
                    if (y + height / 2 >= getHeight())
                        position.setY(HEIGHT - height / 2);
                }
            }
        });
    }

    public void addEntity(Entity e) {
        entities.add(e);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Entity e : entities) {
            e.paintComponent(g);
        }
    }

    public void actionPerformed(ActionEvent e) {
        for (Entity en: entities) {
            collision(en);
            en.refresh();
        }
        repaint();
    }

    private void collision(Entity e) {
        int x = e.getPosition().getX();
        int y = e.getPosition().getY();
        int width = e.getWidth();
        int height = e.getHeight();
        Vector deplacement = e.getDeplacement();

        if (x - width / 2 <= 0 || x + width / 2 >= getWidth())
            deplacement.setX(-deplacement.getX());
        if (y - height / 2 <= 0 || y + height / 2 >= getHeight())
            deplacement.setY(-deplacement.getY());
    }

     */
}
