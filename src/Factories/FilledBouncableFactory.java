package Factories;

import Bouncable.FilledCircle;
import Bouncable.FilledSquare;

/**
 * FilledBouncableFactory.java
 * Singleton Factory to create FilledBouncable objects
 * @authors Egger Magali, Nunez Tania
 */
public class FilledBouncableFactory extends BouncableFactory {
    private static FilledBouncableFactory instance;

    public static FilledBouncableFactory getInstance() {
        if(instance == null) instance = new FilledBouncableFactory();
        return instance;
    }

    public FilledSquare createSquare(){
        return new FilledSquare();
    }

    public FilledCircle createCercle(){
        return new FilledCircle();
    }

}
