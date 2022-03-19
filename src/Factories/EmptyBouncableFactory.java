package Factories;

import Bouncable.EmptyCercle;
import Bouncable.EmptySquare;

public class EmptyBouncableFactory extends BouncableFactory {
    // getInstance if singleton

    public EmptySquare createSquare(){
        return new EmptySquare();
    }

    public EmptyCercle createCercle(){
        return new EmptyCercle();
    }
}
