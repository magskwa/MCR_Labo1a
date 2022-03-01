import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class MyPanel extends JPanel implements ActionListener {
    Timer timer;
    LinkedList<Entity> entities;
    MyPanel(int width, int height) {
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(width, height));
        this.setVisible(true);
        entities = new LinkedList<>();
        timer = new Timer(40, this);
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
        for (Entity en: entities)
            en.refresh();
        repaint();
    }
}
