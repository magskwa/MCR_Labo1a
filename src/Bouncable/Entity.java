package Bouncable;

import java.awt.*;
import java.util.Random;
import Graphic.*;
import Graphic.Frame;
import Renderer.*;
import Util.Vector;

/**
 * Entity.java
 * class Entity
 * @brief Class representing an Entity that can be drawn into a JFrame Object.
 * @authors Magali Egger, Tania Nunez
 */

abstract public class Entity implements Bouncable {

    protected Vector position;
    protected Vector deplacement;
    protected int size;
    private Color color;

    static private int maxSpeed = 5;
    static private int minSpeed = 2;
    static private int maxSize = 20;
    static private int minSize = 10;
    static private int xDim = 500;
    static private int yDim = 500;

    private Random random = new Random();

    public Entity(Color c){
        size = random.nextInt(maxSize - minSize) + minSize;
        position = new Vector(new Random().nextInt(xDim - size) + size, random.nextInt(yDim - size) + size);
        deplacement = new Vector(new Random().nextInt(maxSpeed - minSpeed) + minSpeed,
                random.nextInt(maxSpeed - minSpeed) + minSpeed);
        color = c;
    }

    /**
     * @return the color of the Entity
     */
    public Color getColor() { return color; }

    /**
     * @return the Render that displays the Entity
     */
    abstract public Renderer getRenderer();

    /**
     * @brief Entity is drawn by its Renderer
     */
    public void draw(){
        getRenderer().display( Frame.getInstance().getGraphics() ,this);
    }

    /**
     * @brief Updates the position of the Entity by adding its deplacement. If the Entity touches a side of the JFrame,
     * it bounces in the opposite way.
     */
    public void move(){


        int x = position.getX();
        int y = position.getY();

        if (x - size / 2 <= 0 || x + size / 2 >= Frame.getInstance().getWidth())
            deplacement.setX(-deplacement.getX());
        if (y - size / 2 <= 0 || y + size / 2 >= Frame.getInstance().getHeight())
            deplacement.setY(-deplacement.getY());

        position = position.add(deplacement);


    }
}
