package Bouncable;

import java.awt.*;
import java.util.Random;
import Graphic.*;
import Graphic.Frame;
import Renderer.*;
import Util.Vector;

abstract public class Entity implements Bouncable {
    protected Vector position;
    protected Vector deplacement;
    protected int size;

    int maxSpeed = 10;
    int minSpeed = 5;
    int maxSize = 20;
    int minSize = 10;
    private int xDim = 500;
    private int yDim = 500;

    Random random = new Random();

    public Entity(){
        size = random.nextInt(maxSize - minSize) + minSize;
        position = new Vector(new Random().nextInt(xDim - size) + size, random.nextInt(yDim - size) + size);
        deplacement = new Vector(new Random().nextInt(maxSpeed - minSpeed) + minSpeed,
                random.nextInt(maxSpeed - minSpeed) + minSpeed);
    }

    abstract public Color getColor();

    public void updateDirection(Vector direction) {
        this.deplacement = direction;
    }

    public void updatePosition(Vector position){
        this.position = position;
        // ou position = position.add(deplacement); vient de refresh
    }

    abstract public Renderer getRenderer();

    public void draw(){
        getRenderer().display( Frame.getInstance().getGraphics() ,this);
    }

    public void move(){
        position = position.add(deplacement);

        int x = position.getX();
        int y = position.getY();


        if (x - size / 2 <= 0)
            position.setX(size / 2);
        if (x + size / 2 >= Frame.getInstance().getWidth())
            position.setX(Frame.getInstance().getWidth() - size / 2);
        if (y - size / 2 <= 0)
            position.setY(size / 2);
        if (y + size / 2 >= Frame.getInstance().getWidth())
            position.setY(Frame.getInstance().getHeight() - size / 2);

        if (x - size / 2 <= 0 || x + size / 2 >= Frame.getInstance().getWidth())
            deplacement.setX(-deplacement.getX());
        if (y - size / 2 <= 0 || y + size / 2 >= Frame.getInstance().getHeight())
            deplacement.setY(-deplacement.getY());


    }

/*

    public void paintComponent(Graphics g) {
        g.setColor(getColor());
        drawShape(g);
    }

 */

}
