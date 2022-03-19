package Factories;

import Bouncable.Entity;

abstract public class BouncableFactory {
    abstract public Entity createSquare();
    abstract public Entity createCercle();
}
