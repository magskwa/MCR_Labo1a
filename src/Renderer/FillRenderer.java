package Renderer;

import Bouncable.Bouncable;

import java.awt.*;

public class FillRenderer implements Renderer {

    public void display(Graphics2D g, Bouncable b){
        g.setColor(b.getColor());
        g.draw(b.getShape());
        g.fill(b.getShape());
    }
}
