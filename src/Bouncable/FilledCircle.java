package Bouncable;

import Renderer.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * FilledCircle.java
 * class FilledCircle
 * @brief Class representing a filled Circle that can be drawn into a JFrame Object.
 * @authors Magali Egger, Tania Nunez
 */
public class FilledCircle extends Entity {


    /**
     * Constructor of FilledCircle with default color blue.
     */
    public FilledCircle() {
        super(Color.blue);
    }

    public Renderer getRenderer(){
        return new FillRenderer();
    }

    public Shape getShape(){
        return new Ellipse2D.Double(position.getX(), position.getY(), size, size);
    }

}
