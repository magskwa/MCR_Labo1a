package Renderer;

import Bouncable.Bouncable;

import java.awt.*;

/**
 * FilledRenderer.java
 * Class responsible for the display of filled bouncables
 * @authors Egger Magali, Nunez Tania
 */
public class FillRenderer implements Renderer {

    public void display(Graphics2D g, Bouncable b){
        g.setColor(b.getColor());
        g.draw(b.getShape());
        g.fill(b.getShape());
    }
}
