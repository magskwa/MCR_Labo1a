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
        int deplaX = deplacement.getX();
        int deplaY = deplacement.getY();
        position.setX(position.getX() + deplacement.getX());
        position.setY(position.getY() + deplacement.getY());


        if(collision == 0) {
            if (x - getWidth() <= 0 || x + getWidth() >= xLim) {
                deplacement.setX(-1 * deplaY);
                deplacement.setY(deplaX);
                position.setX(position.getX() + deplacement.getX());
                position.setY(position.getY() + deplacement.getY());
                collision++;
            }

            if (y - getHeight() <= 0 || y + getHeight() >= yLim) {
                deplacement.setX(-1 * deplacement.getY());
                deplacement.setY(deplaX);
                position.setX(position.getX() + deplacement.getX());
                position.setY(position.getY() + deplacement.getY());
                collision++;
            }
        } else {
            collision ++;
            collision = collision% 4;
        }
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
