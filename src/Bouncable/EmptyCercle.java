package Bouncable;

import Renderer.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class EmptyCercle extends Entity {
    private Color color = Color.green;

    public Color getColor() { return color; }

    public Renderer getRenderer(){
        return new EmptyRenderer();
    }

    public Shape getShape(){
        return new Ellipse2D.Double(position.getX(), position.getY(), size, size);
    }


}
