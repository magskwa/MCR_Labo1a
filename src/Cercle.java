import java.awt.*;

public class Cercle extends Entity{

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(getColor());
        graphics.drawOval(getPosition().x, getPosition().y, getTaille(), getTaille());
        //getPosition().refresh(getDeplacement());
    }

    @Override
    public void drawing() {
        repaint();
    }
}
