package Bouncable;

import Renderer.*;

import java.awt.*;

public class FillSquare extends Entity {

    private Color color = Color.yellow;

    public Color getColor() { return color; }

    public Renderer getRenderer(){
        return new FillRenderer();
    }

    public Shape getShape(){
        return new Rectangle(position.getX(), position.getY(), size, size);
    }
}
