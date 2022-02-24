import java.awt.*;

public class Square extends Entity{
    int height;
    int width;

    Square(Vector position, Vector deplacement, Color c, int height, int width) {
        super(position, deplacement, c);
        this.height = height;
        this.width = width;
    }

    public void drawShape(Graphics g) {
        g.fillRect(getPosition().getX(), getPosition().getY(), width, height);
    }

    public void checkCollision() {
    }
}
