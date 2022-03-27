package Bouncable;

import Renderer.*;

import java.awt.*;

/**
 * FilledSquare.java
 * class FilledSquare
 * @brief Class representing a filled square that can be drawn into a JFrame Object.
 * @authors Magali Egger, Tania Nunez
 */
public class FilledSquare extends Entity {

    /**
     * Constructor of FilledCircle with default color yellow.
     */
    public FilledSquare() {
        super(Color.yellow);
    }

    public Renderer getRenderer(){
        return new FillRenderer();
    }

    public Shape getShape(){
        return new Rectangle(position.getX(), position.getY(), size, size);
    }
}
