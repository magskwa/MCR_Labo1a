package Factories;

import Bouncable.FillCercle;
import Bouncable.FillSquare;

public class FillBouncableFactory extends BouncableFactory {
    // getInstance if we choose to make it a singleton

    public FillSquare createSquare(){
        return new FillSquare();
    }

    public FillCercle createCercle(){
        return new FillCercle();
    }

}
