import java.awt.*;

public class Square extends Entity{
    @Override
    public void paintComponent(Graphics graphics) {
        graphics.drawRect(getPosition().x, getPosition().y, getTaille(), getTaille());
        getPosition().refresh(getDeplacement());
    }

    @Override
    public void drawing() {
        repaint();
    }
}
