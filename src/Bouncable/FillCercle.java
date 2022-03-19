package Bouncable;

import Renderer.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class FillCercle extends Entity {

    private Color color = Color.blue;

    public Color getColor() { return color; }

    public Renderer getRenderer(){
        return new FillRenderer();
    }

    public Shape getShape(){
        return new Ellipse2D.Double(position.getX(), position.getY(), size, size);
    }

}
