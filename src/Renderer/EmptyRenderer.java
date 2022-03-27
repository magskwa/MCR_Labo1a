package Renderer;

import Bouncable.Bouncable;

import java.awt.*;

/**
 * EmptyRenderer.java
 * Class responsible for the display of empty bouncables
 * @authors Egger Magali, Nunez Tania
 */
public class EmptyRenderer implements Renderer {

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }
}
