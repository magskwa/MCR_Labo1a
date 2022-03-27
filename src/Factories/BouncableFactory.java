package Factories;

import Bouncable.Entity;

/**
 * BouncableFactory.java
 * Abstract class to represent Bouncable Factories. These objects will create either EmptyBouncable or FilledBouncable.
 * @authors Egger Magali, Nunez Tania
 */
abstract public class BouncableFactory {
    /**
     * @return an Instance of a Square
     */
    abstract public Entity createSquare();
    /**
     * @return an Instance of a Circle
     */
    abstract public Entity createCercle();
}
