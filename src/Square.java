import java.awt.*;

public class Square extends Entity{
    @Override
    public void draw(Graphics graphics) {
        graphics.drawRect(getPosition().x, getPosition().y, getTaille(), getTaille());
        getPosition().refresh(getDeplacement());
    }
}
