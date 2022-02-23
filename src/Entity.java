import javax.swing.*;
import java.awt.*;
import java.util.Random;


abstract public class Entity extends JPanel {
    private Vector position;
    private Vector deplacement;
    private Color color;
    private int taille;
    private Random rand;
    private Frame f;

    public Entity(){
        color = Color.BLACK;
        taille = 140;
        position = new Vector(200,200);
        deplacement = new Vector(10,10);
        /*
        rand = new Random();
        color = new Color(rand.nextInt());
        taille = rand.nextInt();
        position = new Vector(rand.nextInt(), rand.nextInt());
        deplacement = new Vector(rand.nextInt(), rand.nextInt());

         */
    }

    public Color getColor() {
        return color;
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

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
    }
    abstract public void drawing();

}
