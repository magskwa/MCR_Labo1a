package Bouncable;

import Renderer.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * EmptyCircle.java
 * class EmptyCircle
 * @brief Class representing an empty circle that can be drawn into a JFrame Object.
 * @authors Magali Egger, Tania Nunez
 */
public class EmptyCircle extends Entity {

    /**
     * Constructor of EmptyCircle with default color green.
     */
    public EmptyCircle() {
        super(Color.green);
    }

    public Renderer getRenderer(){
        return new EmptyRenderer();
    }

    public Shape getShape(){
        return new Ellipse2D.Double(position.getX(), position.getY(), size, size);
    }


}
