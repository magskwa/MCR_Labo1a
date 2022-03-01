import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class MyPanel extends JPanel implements ActionListener {
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

        if (x - width / 2 <= 0 || x + width / 2 >= WIDTH)
            deplacement.setX(-deplacement.getX());
        if (y - height / 2 <= 0 || y + height / 2 >= HEIGHT)
            deplacement.setY(-deplacement.getY());
    }
}
