import javax.swing.*;
import java.awt.*;
import java.util.Random;


abstract public class Entity {
    private Vector position;
    private Vector deplacement;
    private Color color;
    private int taille;
    private Random rand;
    private Frame f;

    public Entity(){
        color = new Color(rand.nextInt());
        taille = rand.nextInt();
        position = new Vector(rand.nextInt(), rand.nextInt());
        deplacement = new Vector(rand.nextInt(), rand.nextInt());
    }

    Vector getPosition() {
        return position;
    }

    Vector getDeplacement() {
        return deplacement;
    }

    int getTaille() {
        return taille;
    }

    abstract public void draw(Graphics graphics);

}
