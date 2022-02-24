import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.Random;


abstract public class Entity extends JPanel implements ActionListener {
    private Vector position;
    private Vector deplacement;
    private Color c;
    Timer timer = new Timer(200, this);

    public Color getColor() { return c; }

    public Entity(Vector position, Vector deplacement, Color c) {
        this.position = position;
        this.deplacement = deplacement;
        this.c = c;
        timer.setRepeats(true);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        refresh();
        repaint();
    }

    Vector getPosition() {
        return position;
    }

    Vector getDeplacement() {
        return deplacement;
    }


    public void draw() {
        repaint();
    }

    public void refresh() {
        position = position.add(deplacement);
    }

    public void updateDirection(Vector direction) {
        this.deplacement = direction;
    }

    public abstract void drawShape(Graphics g);

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(getColor());
        drawShape(g);
    }

}