package Renderer;

import Bouncable.Bouncable;

import java.awt.*;

public class EmptyRenderer implements Renderer {


    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }
}
