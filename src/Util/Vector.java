package Util;

/**
 * Vector.java
 * Class to represent position and deplacement
 * @authors Egger Magali, Nunez Tania
 */
public class Vector {
    private int x;
    private int y;

    /**
     * set the x component of the Vector
     * @param x the new x component
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * set the y component of the Vector
     * @param y the new y component
     */
    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Vector(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Adds a Vector to another
     * @param other the second operand
     * @return a new Vector representing the result
     */
    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

}
