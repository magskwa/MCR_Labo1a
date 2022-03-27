package Renderer;

import Bouncable.Bouncable;

import java.awt.*;

/**
 * Renderer.java
 * Interface that implements the methods to display a Bouncable in a Graphics2D object
 */
public interface Renderer {
    /**
     * Displays the Bouncable in a Graphics2D object
     * @param g the Graphics2D to draw in
     * @param b the Bouncable to be drawn
     */
    void display(Graphics2D g, Bouncable b);
}
