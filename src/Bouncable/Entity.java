package Bouncable;

import java.awt.*;
import java.util.Random;

import Util.Vector;

abstract public class Entity implements Bouncable {
    private Vector position;
    private Vector deplacement;
    private int size;

    int maxSpeed = 10;
    int minSpeed = 5;
    int maxSize = 20;
    int minSize = 10;
    private int xDim = 500;
    private int yDim = 500;

    Random random = new Random();

    public Entity(){
        size = new Random().nextInt(maxSize - minSize) + minSize;
        position = new Vector(new Random().nextInt(xDim - size) + size, new Random().nextInt(yDim - size) + size);
        deplacement = new Vector(new Random().nextInt(maxSpeed - minSpeed) + minSpeed,
                new Random().nextInt(maxSpeed - minSpeed) + minSpeed);
    }

    abstract public Color getColor();

    public void updateDirection(Vector direction) {
        this.deplacement = direction;
    }

    public void updatePosition(Vector position){
        this.position = position;
        // ou position = position.add(deplacement); vient de refresh
    }

    public void draw(){
        // how ?
        //getRenderer.display(,this);
    }

    public void move(){
        // missing something but what
        int x = position.getX();
        int y = position.getY();

        if (x - size / 2 <= 0 || x + size / 2 >= size)
            deplacement.setX(-deplacement.getX());
        if (y - size / 2 <= 0 || y + size / 2 >= size)
            deplacement.setY(-deplacement.getY());
    }

/*

    public void paintComponent(Graphics g) {
        g.setColor(getColor());
        drawShape(g);
    }

 */

}
