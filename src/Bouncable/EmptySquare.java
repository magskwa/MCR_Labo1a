package Bouncable;

import Renderer.*;

import java.awt.*;

/**
 * EmptySquare.java
 * class EmptySquare
 * @brief Class representing an empty square that can be drawn into a JFrame Object.
 * @authors Magali Egger, Tania Nunez
 */
public class EmptySquare extends Entity {

    /**
     * Constructor of EmptyCircle with default color red.
     */
    public EmptySquare() {
        super(Color.red);
    }

    public Renderer getRenderer(){
        return new EmptyRenderer();
    }

    public Shape getShape(){
        return new Rectangle(position.getX(), position.getY(), size, size);
    }
}
