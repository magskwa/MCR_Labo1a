package Bouncable;

import Util.Vector;

import javax.swing.*;
import java.awt.*;

public class EmptySquare extends Entity{
    private Color color = Color.red;

    public Color getColor() { return color; }

    public Renderer getRenderer(){
        return new EmptyRenderer();
    }

    public Shape getShape(){

    }
}
