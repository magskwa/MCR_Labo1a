package Bouncable;

import java.awt.*;


/**
 * Bouncable.java
 * Interface to modelize Objects that can move and bounce in a JFrame. It can be drawn and has a color and a shape.
 */

public interface Bouncable {

    /**
     * Method to draw the Bouncable in its Frame
     */
    void draw();

    /**
     * Method that moves the Bouncable (updates its possition in its Frame)
     */
    void move();

    /**
     * @return the color of the Bouncable
     */
    Color getColor();

    /**
     * @return the shape of the Bouncable
     */
    Shape getShape();
}

