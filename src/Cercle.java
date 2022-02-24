import java.awt.*;

public class Cercle extends Entity {

    int rayon;

    Cercle(Vector position, Vector deplacement, Color c, int rayon) {
        super(position, deplacement, c);
        this.rayon = rayon;
    }

    public void drawShape(Graphics g) {
        g.fillOval(getPosition().getX(), getPosition().getY(), rayon, rayon);
    }

    public void checkCollision() {
    }
}
