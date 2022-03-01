import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.Random;

enum collisionType {NO_COLLISION, VERTICAL_BORDER, HORIZONTAL_BORDER, EDGE};


abstract public class Entity {
    private Vector position;
    private Vector deplacement;
    private Color c;
    private static int xLim = 0;
    private static int yLim = 0;
    private int collision = 0;

    public static int getxLim() {
        return xLim;
    }

    public static int getyLim() {
        return yLim;
    }

    public static void setFrameDimensions(int x, int y) {
        xLim = x;
        yLim = y;
    }

    public Color getColor() { return c; }

    public abstract int getWidth();

    public abstract int getHeight();

    public Entity(Vector position, Vector deplacement, Color c) {
        this.position = position;
        this.deplacement = deplacement;
        this.c = c;
    }


    Vector getPosition() {
        return position;
    }

    Vector getDeplacement() {
        return deplacement;
    }



    public void refresh() {

        int x = position.getX();
        int y = position.getY();
        position = position.add(deplacement);
    }

    public void updateDirection(Vector direction) {
        this.deplacement = direction;
    }

    public abstract void drawShape(Graphics g);

    public void paintComponent(Graphics g) {
        g.setColor(getColor());
        drawShape(g);
    }

}
