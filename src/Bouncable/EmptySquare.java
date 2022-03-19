package Bouncable;

import Renderer.*;

import java.awt.*;

public class EmptySquare extends Entity {
    private Color color = Color.red;

    public Color getColor() { return color; }

    public Renderer getRenderer(){
        return new EmptyRenderer();
    }

    public Shape getShape(){
        return new Rectangle(position.getX(), position.getY(), size, size);
    }
}
