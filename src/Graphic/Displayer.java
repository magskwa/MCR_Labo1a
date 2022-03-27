package Graphic;

import java.awt.*;

/**
 * Displayer.java
 * Interface that has methods to display entities in a frame
 * @authors Egger Magali, Nunez Tania
 */
public interface Displayer {
    /**
     * @return the width of the Displayer
     */
    int getWidth();

    /**
     * @return the height of the Displayer
     */
    int getHeight();

    /**
     * @return the Graphics object in which the entities will be drawn
     */
    Graphics2D getGraphics();

    /**
     * Repaints the displayer and its components
     */
    void repaint();

    /**
     * Sets the title of the Displayer
     * @param title the title to be displayed
     */
    void setTitle(String title);
}
