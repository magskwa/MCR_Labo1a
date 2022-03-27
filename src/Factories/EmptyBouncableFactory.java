package Factories;

import Bouncable.EmptyCircle;
import Bouncable.EmptySquare;
import Graphic.Frame;

/**
 * EmptyBouncableFactory.java
 * Singleton Factory to create EmptyBouncable objects
 * @authors Egger Magali, Nunez Tania
 */
public class EmptyBouncableFactory extends BouncableFactory {
    private static EmptyBouncableFactory instance;

    public static EmptyBouncableFactory getInstance() {
        if(instance == null) instance = new EmptyBouncableFactory();
        return instance;
    }

    public EmptySquare createSquare(){
        return new EmptySquare();
    }

    public EmptyCircle createCercle(){
        return new EmptyCircle();
    }
}
