import java.awt.*;

public class Cercle extends Entity{

    @Override
    public void draw(Graphics graphics) {
        graphics.drawOval(getPosition().x, getPosition().y, getTaille(), getTaille());
        getPosition().refresh(getDeplacement());
    }
}
